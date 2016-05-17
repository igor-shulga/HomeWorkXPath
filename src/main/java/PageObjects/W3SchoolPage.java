package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.List;


public class W3SchoolPage {
    private WebDriver driver;
    private String homeUrl = "http://www.w3schools.com/html/html_tables.asp";
    private By row2 = By.xpath(".//*[@id='main']/table[1]/tbody/tr[3]");
    private By points = By.xpath("td[4]");
    private By rowsLocator = By.xpath(".//table[@class='w3-table-all']/tbody//tr[position()>1]");
    private By personName = By.xpath("td[2]");
    private String personRow;


    public W3SchoolPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public String getContentofRow(){
        driver.navigate().to(homeUrl);
        return  driver.findElement(row2).getText();
    }
    public String getPointsofRow() {
        driver.navigate().to(homeUrl);
        WebElement row = driver.findElement(row2);
        return row.findElement(points).getText();}


    public String findPersonByName(String name){
        driver.navigate().to(homeUrl);
        List<WebElement> rows = driver.findElements(rowsLocator);
        for(WebElement i : rows ){
             if(i.findElement(personName).getText().equals(name)){
                 personRow = i.getText();
                 break;

            }
        }

        return personRow;
    }

}

