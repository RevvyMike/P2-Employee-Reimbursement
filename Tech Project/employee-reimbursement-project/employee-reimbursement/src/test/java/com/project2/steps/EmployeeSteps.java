package com.project2.steps;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.project2.runner.TestRunner;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EmployeeSteps {

    /*
        Scenario for employee logging in 
        check the status on my reimbursement request
    */

    @When("The employee checks on current status")
    public void the_employee_checks_on_current_status() {
        // Write code here that turns the phrase above into concrete actions
        TestRunner.driver.get("C:/Users/17132/Desktop/P2-Employee-Reimbursement/Tech Project/employee-reimbursement-project/employee-reimbursement/src/main/resources/web pages/EMPLOYEEdavid.html");
    }

     /*
        As an employee I want to create and submit a new 
        reimbursement request
    */

    @When("The employee enters the employees username")
    public void the_employee_enters_the_employees_username() {
        // Write code here that turns the phrase above into concrete actions
        TestRunner.employee.employeeIdInput("Leonardo");
    }

   
    @When("The employee enters a dollar amount less than or equal to $1000")
    public void the_employee_enters_a_dollar_amount_less_than_or_equal_to_$1000() {
        // Write code here that turns the phrase above into concrete actions
        TestRunner.employee.employeeRequest(100);
    }

    @When("The employee enters a request description")
    public void the_employee_enters_a_request_description() {
        // Write code here that turns the phrase above into concrete actions
        TestRunner.employee.employeeDescription("");
    }

    @When("The employee clicks on the submit button")
    public void the_employee_clicks_on_the_submit_button() {
        // Write code here that turns the phrase above into concrete actions
        TestRunner.employee.clickButton();
    }

    @Then("The employee sees a success notification")
    public void the_employee_sees_a_success_notification() {
        // Write code here that turns the phrase above into concrete actions
        TestRunner.wait.until(ExpectedConditions.alertIsPresent());
        String text = TestRunner.driver.switchTo().alert().getText();
        Assert.assertEquals("Request Submitted", text);
        TestRunner.driver.switchTo().alert().accept();
    } 

    /*
        As an employee I need to close the session by logging out 
    */
    
    @When("The employee clicks the button to sign out")
    public void the_employee_clicks_the_button_to_sign_out() {
        // Write code here that turns the phrase above into concrete actions
        TestRunner.employee.clickButton1();
    }

    @Then("The employee should be logged out and be redirected to the homepage")
    public void the_employee_should_be_logged_out_and_be_redirected_to_the_homepage() {
        // Write code here that turns the phrase above into concrete actions
        String text = TestRunner.driver.switchTo().alert().getText();
        Assert.assertEquals("You are logged out", text);
        TestRunner.driver.switchTo().alert().accept();
        TestRunner.driver.get("file:///C:/Users/17132/Desktop/P2-Employee-Reimbursement/Tech%20Project/employee-reimbursement-project/employee-reimbursement/src/main/resources/web%20pages/login.html");
    }


}
