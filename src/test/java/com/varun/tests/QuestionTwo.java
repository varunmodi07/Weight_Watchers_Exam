package test.java.com.varun.tests;

import main.java.com.varun.core.Base;
import main.java.com.varun.pageObject.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class QuestionTwo extends Base {

  @Test(enabled = true, groups = {"Two"})
  public void testSecondQuestion() {

    HomePage loginPage = PageFactory.initElements(driver, HomePage.class);
    /*
    Second Requirement
     */
    Reporter.log(
        "<br>2.- Verify loaded page title matches Weight Loss Program, Recipes & Help | Weight Watchers");

    softAssert.assertTrue(
        HomePage.getPage_Title() == "Weight Loss Program, Recipes & Help | Weight Watchers",
        "Title is not equals to Weight Loss Program, Recipes & Help | Weight Watchers");
    /*
    Third Requirement
     */
    Reporter.log("<br>3.- On the right corner of the page, click on Find a Meeting");
    loginPage.clickOnFindAMeetingLink();
    /*
    Fourth Requirement
     */
    Reporter.log("<br>4.- Verify loaded page title contains Get Schedules & Times Near You");
    softAssert.assertTrue(HomePage.getPage_Title() == "Get Schedules & Times Near You",
        "Title is not equals to Get Schedules & Times Near You");
    /*
    Fifth Requirement
     */
    Reporter.log("<br>5.- In the search field, search for meetings for zip code: 10011");
    loginPage.enterSearchData("10011");
    loginPage.enterSearch();
    /*
    Sixth Requirement
     */
    Reporter.log(
        "<br>6.- Print the title of the first result and the distance (located on the right of location title/name)");
    loginPage.gettingFirstDataResult("TITLE",0,false);
    loginPage.gettingFirstDataResult("DISTANCE",0,false);
    /*
    Seventh Requirement
     */
    Reporter.log(
        "<br>7.- Click on the first search result and then, verify displayed location name matches with the name of the first searched result that was clicked.");
    loginPage.gettingFirstDataResult("TITLE",0,true);
    softAssert.assertTrue(loginPage.getTitleNameResult().getText() == loginPage.gettingFirstDataResult("TITLE",0 ,false ).getTitleNameResult().getText(), "Title is not the same as the previous Click");

    Reporter.log(">>>> Name of the Result Displayed in the loaded Page: " + loginPage.getTitleNameResult().getText() );
    Reporter.log(">>>> Name of the First Title that we clicked on: " + loginPage.gettingFirstDataResult("TITLE",0 ,false ).getTitleNameResult().getText());
    /*
    Eight Requirement
     */
    Reporter.log(
        "<br>8.- From this location page, print TODAY's hours of operation (located towards the bottom of the page)");

    loginPage.getHoursOfOperation();

    Reporter.log("Finishing Test !");
  }
}
