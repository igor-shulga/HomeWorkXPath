package Tests;

import PageObjects.W3SchoolPage;
import org.junit.Test;


public class GetRowsData extends BaseTest {

    W3SchoolPage w3School;
    @Test
    public void secondRowForJohn(){
        w3School = new W3SchoolPage(driver);
        System.out.println(w3School.getContentofRow());
    }
    @Test
    public void printRowPoints(){
        w3School = new W3SchoolPage(driver);

    }

}
