package com.project2.steps;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.project2.runner.TestRunner;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ManagerSteps {
    

    @Given("The manager is on their homepage")
    public void the_manager_is_on_their_homepage() {
        TestRunner.driver.get("File://C:/Users/Mike/Desktop/P2-Employee-Reimbursement/Tech Project/employee-reimbursement-project/employee-reimbursement/src/main/resources/web pages/P2Manager.html");
}


    @When("The manager the manager clicks approve button")
    public void the_manager_the_manager_clicks_approve_button() {
       TestRunner.manager.clickButton();
    }
    @Then("The manager should be ready to log out")
    public void the_manager_should_be_ready_to_log_out() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }


    @When("The manager clicks deny button")
    public void the_manager_clicks_deny_button() {
        TestRunner.manager.clickButton1();
    }




    @When("The manager inputs the reimbursement requests reason")
    public void the_manager_inputs_the_reimbursement_requests_reason() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("The manager should be ready to approve or deny requests")
    public void the_manager_should_be_ready_to_approve_or_deny_requests() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }



    
    @When("The manager clicks log out button")
    public void the_manager_clicks_log_out_button() {
       TestRunner.manager.clickButton2();
      
    }
    @Then("The manager should be logged out")
    public void the_manager_should_be_logged_out() {
        TestRunner.wait.until(ExpectedConditions.titleIs("AAA Login Page"));
        Assert.assertEquals("AAA Login Page", TestRunner.driver.getTitle());
        TestRunner.driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
    }



}
