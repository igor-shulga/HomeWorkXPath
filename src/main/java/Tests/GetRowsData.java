package Tests;

import PageObjects.W3SchoolPage;
import org.junit.Test;


public class GetRowsData extends BaseTest {

    W3SchoolPage w3School;
    @Test
    public void shpwSecondRow(){
        w3School = new W3SchoolPage(driver);
        System.out.println(w3School.getContentofRow());
    }
    @Test
    public void printRowPoints(){
        w3School = new W3SchoolPage(driver);
        System.out.println(w3School.getPointsofRow());
    }

    @Test
    public void getRowByPersonName(){
        w3School = new W3SchoolPage(driver);
        System.out.println(w3School.findPersonByName("Adam"));
    }

}
