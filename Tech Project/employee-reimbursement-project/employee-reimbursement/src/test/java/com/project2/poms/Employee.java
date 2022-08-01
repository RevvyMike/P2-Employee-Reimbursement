package com.project2.poms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Employee {
    
    @FindBy(id ="eName")
    public WebElement EmployeeId;
    @FindBy(id = "request_amount")
    public WebElement RequestAmount;
    @FindBy(id ="reason")
    public WebElement RequestDescription;
        @FindBy(id ="submit")
    public WebElement Submit;
    @FindBy(id ="logout")
    public WebElement LogOut;
    private WebDriver  driver;

    public Employee(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);

    } 
    
    public void employeeIdInput(String eName){
    
        this.EmployeeId.sendKeys(eName);
    
    }

    public void employeeRequest(int amount){
    
        this.RequestAmount.sendKeys(String.valueOf(amount));
    
    }

    public void employeeDescription(String reason){
    
        this.RequestDescription.sendKeys(reason);
    
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
