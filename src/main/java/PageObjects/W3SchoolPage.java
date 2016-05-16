package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;


public class W3SchoolPage {
    private WebDriver driver;
    private String homeUrl = "http://www.w3schools.com/html/html_tables.asp";
    private By row2 = By.xpath(".//*[@id='main']/table[1]/tbody/tr[3]");
    private By points = By.xpath("td[4]");
    private By tableContent = By.xpath(".//*[@id='main']/table[1]/tbody/tr//td");
    private By rowsLocator = By.xpath(".//*[@id='main']/table[1]/tbody//tr");
    private By xpathName = By.xpath("td[2]");
    private WebElement i;
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



    /*public WebElement findPersonByName(String name) {
        List<WebElement> rows = driver.findElements(rowsLocator);
        List<WebElement> r = new ArrayList<WebElement>()
        for (WebElement i : rows) {
            if (i.findElement(xpathName).getText().equals(name)) {
                return i;
            }
            break;
        }
        return i;}*/
}

