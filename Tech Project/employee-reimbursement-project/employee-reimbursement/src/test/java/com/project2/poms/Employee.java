package com.project2.poms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Employee {
    
    @FindBy(id ="eName")
    public WebElement EmployeeId;
    @FindBy(id = "amount")
    public WebElement RequestAmount;
    @FindBy(id ="descript")
    public WebElement RequestDescription;
        @FindBy(id ="sub")
    public WebElement Submit;
    @FindBy(id ="log")
    public WebElement LogOut;
    private WebDriver  driver;

    public Employee(WebDriver driver){
        PageFactory.initElements(driver, this);

    } 
    
    public void employeeIdInput(String eName){
    
        this.EmployeeId.sendKeys(eName);
    
    }

    public void employeeRequest(int amount){
    
        this.RequestAmount.sendKeys(String.valueOf(amount));
    
    }

    public void employeeDescription(String descript){
    
        this.RequestDescription.sendKeys(descript);
    
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
