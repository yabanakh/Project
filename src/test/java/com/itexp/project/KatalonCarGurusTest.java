package com.itexp.project;

import com.itexpt.project.DriverUtils;
import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class KatalonCarGurusTest {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();
  private Object DriverUtls;

  @Before
  public void setUp() throws Exception {
    driver=DriverUtils.getChromeDriver();
    driver = new ChromeDriver();
    baseUrl = "https://www.google.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    driver.manage().window().maximize();
  }

  @Test
  public void testCargurus() throws Exception {
    driver.get("https://www.cargurus.com/");
    driver.findElement(By.linkText("New Cars")).click();
    driver.findElement(By.id("submitTopicForm_entitySelectingHelper_selectedEntity_makerSelect")).click();
    new Select(driver.findElement(By.id("submitTopicForm_entitySelectingHelper_selectedEntity_makerSelect"))).selectByVisibleText("Maserati");
    driver.findElement(By.id("submitTopicForm_entitySelectingHelper_selectedEntity_makerSelect")).click();
    driver.findElement(By.id("submitTopicForm_entitySelectingHelper_selectedEntity_modelSelect")).click();
    new Select(driver.findElement(By.id("submitTopicForm_entitySelectingHelper_selectedEntity_modelSelect"))).selectByVisibleText("Quattroporte");
    driver.findElement(By.id("submitTopicForm_entitySelectingHelper_selectedEntity_modelSelect")).click();
    driver.findElement(By.id("submitTopicForm_entitySelectingHelper_selectedEntity_year1Select")).click();
    new Select(driver.findElement(By.id("submitTopicForm_entitySelectingHelper_selectedEntity_year1Select"))).selectByVisibleText("2019");
    driver.findElement(By.id("submitTopicForm_entitySelectingHelper_selectedEntity_year1Select")).click();
    driver.findElement(By.id("submitTopicForm_entitySelectingHelper_selectedEntity_trimSelect")).click();
    new Select(driver.findElement(By.id("submitTopicForm_entitySelectingHelper_selectedEntity_trimSelect"))).selectByVisibleText("S RWD");
    driver.findElement(By.id("submitTopicForm_entitySelectingHelper_selectedEntity_trimSelect")).click();
    driver.findElement(By.name("zip")).sendKeys("60089");
    driver.findElement(By.id("submitTopicForm_0")).click();
    driver.findElement(By.xpath("//img[@alt='New 2019 Maserati Quattroporte S Q4 AWD']")).click();
    driver.findElement(By.xpath("//img[@alt='Vehicle Full Photo']")).click();
  }

  @After
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}
