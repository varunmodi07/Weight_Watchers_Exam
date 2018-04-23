package main.java.com.varun.core;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.asserts.SoftAssert;

public class Base {

  public SoftAssert softAssert ;
  protected WebDriver driver;
  String baseUrl = "https://www.weightwatchers.com/us/";

  @BeforeClass (alwaysRun = true)
  @Parameters ({"browserName", "remoteurl"})
  public void setUp(@Optional("chrome") final String browser, final String baseUrlProperty)throws MalformedURLException {
    softAssert = new SoftAssert();
    System.setProperty("webdriver.chrome.driver","chromedriver");
    driver = new ChromeDriver();

    /*
    First Requirement
     */
    Reporter.log("1.- Navigate to https://www.weightwatchers.com/us/");
    driver.get(baseUrl);
  }

  @AfterClass(alwaysRun = true)
  public void tearDown() {
    driver.quit();

  }
}
