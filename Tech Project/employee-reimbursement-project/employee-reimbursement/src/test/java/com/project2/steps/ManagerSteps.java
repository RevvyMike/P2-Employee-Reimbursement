package com.project2.steps;

import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.project2.runner.TestRunner;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ManagerSteps {

       
    /*
        As a manager, I want to approve reimbursement requests

    */
    @Given("The manager is logged into the database")
    public void the_manager_is_logged_into_the_database() {
        // Write code here that turns the phrase above into concrete actions
        TestRunner.driver.get("file:///C:/Users/17132/Desktop/P2-Employee-Reimbursement/Tech%20Project/employee-reimbursement-project/employee-reimbursement/src/main/resources/web%20pages/manager.html");
    }

    @When("The manager views reimbursement requests")
    public void the_manager_views_reimbursement_requests() {
        // Write code here that turns the phrase above into concrete actions
        TestRunner.manager.requestInput("");
    }

    @When("The manager selects list to approve request")
    public void the_manager_selects_list_to_approve_request() {
        // Write code here that turns the phrase above into concrete actions
        TestRunner.manager.clickButton();
    }

    @Then("The manager should be able to save all changes")
    public void the_manager_should_be_able_to_save_all_changes() {
        // Write code here that turns the phrase above into concrete actions
        TestRunner.wait.until(ExpectedConditions.alertIsPresent());
                    String text = TestRunner.driver.switchTo().alert().getText();
                    Assert.assertEquals("Request Approved", text);
    }
        /*
            The manager should be able to deny reimbursement requests 
        */
    @When("The manager views reimbursement request")
    public void the_manager_views_reimbursement_request() {
        // Write code here that turns the phrase above into concrete actions
        TestRunner.manager.requestInput("");
    }

    @When("The manager selects list to deny request")
    public void the_manager_selects_list_to_deny_request() {
        // Write code here that turns the phrase above into concrete actions
        TestRunner.manager.clickButton1();
    }

    @Then("The manager should be able to save  changes")
    public void the_manager_should_be_able_to_save_changes() {
        // Write code here that turns the phrase above into concrete actions
        TestRunner.wait.until(ExpectedConditions.alertIsPresent());
                    String text = TestRunner.driver.switchTo().alert().getText();
                    Assert.assertEquals("Request Denied", text);
    }

        /*
            As a manager I should be able to log out of the webpage  
        */
    @When("The manager clicks the button to sign out")
    public void the_manager_clicks_the_button_to_sign_out() {
        // Write code here that turns the phrase above into concrete actions
        TestRunner.manager.clickButton2();
    }

    @Then("The manager should log out and be redirected to the homepage")
    public void the_manager_should_log_out_and_be_redirected_to_the_homepage() {
        // Write code here that turns the phrase above into concrete actions
        TestRunner.driver.get("file:///C:/Users/17132/Desktop/P2-Employee-Reimbursement/Tech%20Project/employee-reimbursement-project/employee-reimbursement/src/main/resources/web%20pages/employee.html");
    }

}
