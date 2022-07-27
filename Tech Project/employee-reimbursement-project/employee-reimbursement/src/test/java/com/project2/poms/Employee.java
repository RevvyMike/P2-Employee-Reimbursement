package com.project2.poms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Employee {
    
    @FindBy(className ="formgroup")
    public WebElement EmployeeId;
    @FindBy(className = "formgroup1")
    public WebElement RequestAmount;
    @FindBy(className ="formgroup2")
    public WebElement RequestDescription;
        @FindBy(className ="btnprimary")
    public WebElement Submit;
    @FindBy(className ="btnprimary1")
    public WebElement LogOut;


    public Employee(WebDriver driver){
        PageFactory.initElements(driver, this);

    } 
    
    public void employeeIdInput(String formGroup){
    
        this.EmployeeId.sendKeys(formGroup);
    
    }

    public void employeeRequest(String formGroup1){
    
        this.RequestAmount.sendKeys(formGroup1);
    
    }

    public void employeeDescription(String formGroup2){
    
        this.RequestDescription.sendKeys(formGroup2);
    
    }

    public void clickButton(){

        this.Submit.click();
    }

    public String getAlertText(){
        String text = this.driver.switchTo().alert().getText();
        this.driver.switchTo().alert().accept();
        return text;
    }
    public void clickButton1(){

        this.LogOut.click();
    
    }





}
