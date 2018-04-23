package main.java.com.varun.pageObject;

import java.util.ArrayList;
import java.util.List;
import org.apache.xpath.operations.Bool;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class HomePage {

  private static String page_Title = "Weight Loss Program, Recipes & Help | Weight Watchers";

  @FindBy(id = "ela-menu-visitor-desktop-supplementa_find-a-meeting")
  private WebElement findAMeeting;

  @FindBy(id = "meetingSearch")
  private WebElement searchBox;

  @FindBy(css = ".btn.btn-default.form-blue-pill__btn")
  private WebElement searchButton;

  @FindBy(css = ".location__name>span")
  private WebElement titleNameResult;

  private WebDriver driver;

  public HomePage() {
  }

  public HomePage(WebDriver driver) {
    try {
      this.driver = driver;
      // Initialise Elements
      //PageFactory.initElements(driver, this);

      System.out.println("Starting TEST: " + driver.getTitle());
    } catch (Exception e) {
      System.out.println("ERROR: " + e.getMessage());
    }
  }

  public static String getPage_Title() {
    return page_Title;
  }

  public WebElement getFindAMeeting() {
    return findAMeeting;
  }

  public WebElement getSearchBox() {
    return searchBox;
  }

  public WebElement getSearchButton() {
    return searchButton;
  }

  public WebElement getTitleNameResult() {
    return titleNameResult;
  }

  public void clickOnFindAMeetingLink() {
    findAMeeting.click();
  }

  public void enterSearchData(String data) {
    searchBox.sendKeys(data);
  }

  public void enterSearch() {
    searchBox.sendKeys(Keys.ENTER);
  }

  public HomePage gettingFirstDataResult(String option,Integer resultIndex, Boolean clickOn) {
    try {
      //Reporter.log(">Getting First "+option+" Result data");
      List<WebElement> result = new ArrayList<WebElement>();
      switch (option) {
        case "TITLE":
          result = driver
              .findElements(By.cssSelector(".location__name>span"));
          break;
        case "DISTANCE":
          result = driver
              .findElements(By.cssSelector(".location__distance"));
          break;
        default:
      }

        Reporter.log(">>"+ option+"> "+ result.get(resultIndex).getText());

      if(clickOn){
        Reporter.log(">>>Clicking on the First Result");
        result.get(resultIndex).click();
      }

    } catch (ElementNotVisibleException e) {
      Reporter.log(e.getLocalizedMessage());
    }
    return this;
  }

  public HomePage getHoursOfOperation(){

    Reporter.log(">Getting Hours of Operation");
    List<WebElement> hoursOfOperation = driver
        .findElements(By.cssSelector(".meeting-hours.meeting-detail-bottom-section>hours-list"));

    for (WebElement opt : hoursOfOperation) {
      String replace = opt.getText();
      replace = replace.replaceAll("[^\\p{ASCII}]", " - ");
      Reporter.log("<br>" + replace+"<br>");
    }

    return this;
  }
}
