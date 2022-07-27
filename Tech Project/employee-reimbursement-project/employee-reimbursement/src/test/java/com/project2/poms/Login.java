package com.project2.poms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
    
    @FindBy(className = "textbox")
    public WebElement usernameBox;

    @FindBy(className = "textbox1")
    public WebElement passwordBox;

    @FindBy(tagName = "btn" ) 
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
