package com.project2.steps;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.project2.runner.TestRunner;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
    

    /*
     Steps for Scenario logging In 
     should be able to view request table
    */
    @Given("The employee is on the login page")
    public void the_employee_is_on_the_login_page() {
        // Write code here that turns the phrase above into concrete actions
        TestRunner.driver.get("file:///C:/Users/17132/Desktop/P2-Employee-Reimbursement/Tech%20Project/employee-reimbursement-project/employee-reimbursement/src/main/resources/web%20pages/P2Login.html");
    }

    @When("The employee enters their username")
    public void the_employee_enters_their_username() {
        // Write code here that turns the phrase above into concrete actions
        TestRunner.login.enterUsername("bluenardo");
    }

    @When("The employee enters their password")
    public void the_employee_enters_their_password() {
        // Write code here that turns the phrase above into concrete actions
        TestRunner.login.enterPassword("Leaonardo");
    }

    @Then("The employee should be able to view table")
    public void the_employee_should_be_able_to_view_table() {
        // Write code here that turns the phrase above into concrete actions
        TestRunner.driver.get("file:///C:/Users/17132/Desktop/P2-Employee-Reimbursement/Tech%20Project/employee-reimbursement-project/employee-reimbursement/src/main/resources/web%20pages/employee.html");
    }
    @Then("the employee should be logged in to the manager home page")
    public void the_employee_should_be_logged_in_to_the_manager_home_page() {
        // Write code here that turns the phrase above into concrete actions
        TestRunner.wait.until(ExpectedConditions.alertIsPresent());
            String text = TestRunner.driver.switchTo().alert().getText();
            Assert.assertEquals("you are logged in", text);
            TestRunner.driver.switchTo().alert().accept();
    }
    
    @When("the manager enters his correct username")
    public void the_manager_enters_his_correct_username() {
        // Write code here that turns the phrase above into concrete actions
        TestRunner.login.enterUsername("splinter");
    }

    @When("the manager enters his correct password")
    public void the_manager_enters_his_correct_password() {
        // Write code here that turns the phrase above into concrete actions
        TestRunner.login.enterPassword("turtlePower");
    }
  
    @When("The employee clicks button to sign in")
    public void the_employee_clicks_button_to_sign_in() {
        // Write code here that turns the phrase above into concrete actions
        TestRunner.login.clickButton();
    }

    @Then("the manager should be logged in to the manager home page")
    public void the_manager_should_be_logged_in_to_the_manager_home_page() {
        // Write code here that turns the phrase above into concrete actions
        TestRunner.wait.until(ExpectedConditions.alertIsPresent());
            String text = TestRunner.driver.switchTo().alert().getText();
            Assert.assertEquals("you are logged in", text);
            TestRunner.driver.switchTo().alert().accept();
    }



}
