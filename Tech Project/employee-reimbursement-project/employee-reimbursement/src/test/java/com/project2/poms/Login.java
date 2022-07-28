package com.project2.poms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
    
    @FindBy(id = "username")
    public WebElement usernameBox;

    @FindBy(id = "password")
    public WebElement passwordBox;

    @FindBy(tagName = "button" ) 
    public WebElement signInButton;


    public Login(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    
        public void enterUsername(String Username){

            this.usernameBox.sendKeys(Username);
        }

        public void enterPassword(String password){
    
            this.passwordBox.sendKeys(password);
        
        }

        public void clickButton(){
    
            this.signInButton.click();
        
        }

        

}
