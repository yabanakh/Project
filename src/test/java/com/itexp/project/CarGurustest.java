/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itexp.project;

import com.itexps.project.CarGurus;
import java.util.concurrent.TimeUnit;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;


/**
 *
 * @author yaban
 */
public class CarGurustest {
    
    private static WebDriver driver;
    private String baseUrl;
    
    public CarGurustest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        System.setProperty("webdriver.chrome.driver", "C:\\qa\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
    }
    
    
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
    
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void executePageSearch() throws Exception {
        CarGurus page = PageFactory.initElements(driver, CarGurus.class);
        page.searchApplic("Maserati", "Quattroporte", "2019", "S RWD", "60089");
    
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    }
}
