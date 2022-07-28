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

    @FindBy(className = "btn" ) 
    public WebElement signInButton;
    private WebDriver driver;

    public Login(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    
        public void enterUsername(String Username){

            this.usernameBox.sendKeys(Username);
        }

        public void enterPassword(String password){
    
            this.passwordBox.sendKeys(password);
        
        }
        public String getAlertText(){
            String text = this.driver.switchTo().alert().getText();
            this.driver.switchTo().alert().accept();
            return text;
        }    

        public void clickButton(){
    
            this.signInButton.click();
        
        }

        

}
