/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itexpt.project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

/**
 *
 * @author yaban
 */
public class DriverUtils {
    public static WebDriver getChromeDriver(){
        System.setProperty("webdriver.chrome.driver", "c:\\qa\\drivers\\chromedriver.exe");
        DesiredCapabilities capabilities=DesiredCapabilities.chrome();
        return new ChromeDriver(capabilities);
     }
     
    public static void main (String[] args){
        getChromeDriver();
    }
}
