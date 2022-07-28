package com.project2.poms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Manager {
   
    @FindBy(className ="favoriteStyled")
    public WebElement approve;
    @FindBy(className = "favoriteStyled1")
    public WebElement deny;
    @FindBy(id = "description")
    public WebElement description;
    @FindBy(className ="logoutBtn")
    public WebElement logout;
    private WebDriver driver;
    public Manager(WebDriver driver){
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
