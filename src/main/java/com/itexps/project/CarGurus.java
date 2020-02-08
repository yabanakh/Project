/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itexps.project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 *
 * @author yaban
 */
public class CarGurus {
    
     WebDriver driver;

    public CarGurus(WebDriver driver) {
        this.driver = driver;
    }
 
    @FindBy(linkText = "New Cars")
    private WebElement NewCars;
    
    //-----------------------------------------------------------------------------

    @FindBy(id = "submitTopicForm_entitySelectingHelper_selectedEntity_makerSelect")
    private WebElement selectmake;

    @FindBy(id = "submitTopicForm_entitySelectingHelper_selectedEntity_makerSelect")
    private WebElement make;

    @FindBy(id = "submitTopicForm_entitySelectingHelper_selectedEntity_makerSelect")
    private WebElement selected1;
    
    //-----------------------------------------------------------------------------
    
    @FindBy(id = "submitTopicForm_entitySelectingHelper_selectedEntity_modelSelect")
    private WebElement selectmodel;

    @FindBy(id = "submitTopicForm_entitySelectingHelper_selectedEntity_modelSelect")
    private WebElement model;

    @FindBy(id = "submitTopicForm_entitySelectingHelper_selectedEntity_modelSelect")
    private WebElement selected2;
    
    //------------------------------------------------------------------------------
    
    @FindBy(id = "submitTopicForm_entitySelectingHelper_selectedEntity_year1Select")
    private WebElement selectyear;

    @FindBy(id = "submitTopicForm_entitySelectingHelper_selectedEntity_year1Select")
    private WebElement year;

    @FindBy(id = "submitTopicForm_entitySelectingHelper_selectedEntity_year1Select")
    private WebElement selected3; 
    
    //------------------------------------------------------------------------------
    
    @FindBy(id = "submitTopicForm_entitySelectingHelper_selectedEntity_trimSelect")
    private WebElement selecttrim;

    @FindBy(id = "submitTopicForm_entitySelectingHelper_selectedEntity_trimSelect")
    private WebElement trim;

    @FindBy(id = "submitTopicForm_entitySelectingHelper_selectedEntity_trimSelect")
    private WebElement selected4; 
    
    //----------------------------------------------------------------------------
    
    @FindBy(name = "zip")
    private WebElement zip;
    @FindBy(id = "submitTopicForm_0")
    private WebElement submit;
    
    //-----------------------------------------------------------------------------
    
    @FindBy(className = "_2YhWJV")
    private WebElement selectcar;
    @FindBy(xpath = "//img[@alt='Vehicle Full Photo']")
    private WebElement selectphoto;
    

    public void searchApplic(String SelectMake, String SelectModel, String SelectYear, String SelectTrim, String Zip)
            throws Exception {
        try {
            driver.manage().window().maximize();
            driver.get("https://www.cargurus.com/");

            NewCars.click();
            selectmake.click();
            make.sendKeys(SelectMake);
            selected1.click();
            selectmodel.click();
            model.sendKeys(SelectModel);
            selected2.click();
            selectyear.click();
            year.sendKeys(SelectYear);
            selected3.click();
            selecttrim.click();
            trim.sendKeys(SelectTrim);
            selected4.click();
            zip.sendKeys(Zip);
            submit.click();
            selectcar.click();
            selectphoto.click();
            Thread.sleep(4000);
            driver.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }
}
    

