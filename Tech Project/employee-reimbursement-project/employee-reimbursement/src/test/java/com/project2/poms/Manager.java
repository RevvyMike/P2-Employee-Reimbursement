package com.project2.poms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Manager {
   
    @FindBy(id = "ApproveButton")
    public WebElement approve;
    @FindBy(id =  "DenyButton")
    public WebElement deny;
    @FindBy(id = "ManagerReason")
    public WebElement description;
    @FindBy(id = "Logged")
    public WebElement logout;
    private WebDriver driver;
    
    public Manager(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
        public void clickButton(){

            this.approve.click();
        }

        public void clickButton1(){
    
            this.deny.click();
        
        }

        public void requestInput(String description){
    
            this.description.sendKeys(description);
        
        }
        public String getAlertText(){
            String text = this.driver.switchTo().alert().getText();
            this.driver.switchTo().alert().accept();
            return text;
        }    

        public void clickButton2(){

            this.logout.click();
        }

}
