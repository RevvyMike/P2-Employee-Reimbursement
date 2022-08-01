package com.project2.steps;

import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.project2.runner.TestRunner;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EmployeeSteps {
    

    @Given("The employee is on the on their homepage")
    public void the_employee_is_on_the_on_their_homepage() {
        TestRunner.driver.get("File://C:/Users/Mike/Desktop/P2-Employee-Reimbursement/Tech Project/employee-reimbursement-project/employee-reimbursement/src/main/resources/web pages/EMPLOYEEdavid.html");
}


    @When("The employee views the remibursement requests")
    public void the_employee_views_the_remibursement_requests() {
        TestRunner.driver.get("File://C:/Users/Mike/Desktop/P2-Employee-Reimbursement/Tech Project/employee-reimbursement-project/employee-reimbursement/src/main/resources/web pages/EMPLOYEEdavid.html");
    }

    @Then("The employee should be ready to create new request")
    public void the_employee_should_be_ready_to_create_new_request() {
        TestRunner.driver.get("File://C:/Users/Mike/Desktop/P2-Employee-Reimbursement/Tech Project/employee-reimbursement-project/employee-reimbursement/src/main/resources/web pages/EMPLOYEEdavid.html");}


    @Given("The employee is in request field on homepage")
    public void the_employee_is_in_request_field_on_homepage() {
        TestRunner.driver.get("File://C:/Users/Mike/Desktop/P2-Employee-Reimbursement/Tech Project/employee-reimbursement-project/employee-reimbursement/src/main/resources/web pages/EMPLOYEEdavid.html");
}


    @When("The employee types request reason into request reason input")
    public void the_employee_types_request_reason_into_request_reason_input() {
        TestRunner.employee.employeeDescription("Fixing a manhole downtown");
}


    @When("The employee types dollar amount into dollar request input")
    public void the_employee_types_dollar_amount_into_dollar_request_input() {
        TestRunner.employee.employeeRequest(100);
    }
    @When("Then employee clicks submit request button")
    public void then_employee_clicks_submit_request_button() {
      TestRunner.employee.clickButton();
}


    @Then("The employee should be ready to log out")
    public void the_employee_should_be_ready_to_log_out() {
        TestRunner.wait.until(ExpectedConditions.alertIsPresent());
        Assert.assertEquals("Request Submitted", TestRunner.driver.switchTo().alert().getText());
        TestRunner.driver.switchTo().alert().accept();
        // TestRunner.wait.until(ExpectedConditions.titleIs("AAA Login Page"));
        // Assert.assertEquals("AAA Login Page", TestRunner.driver.getTitle());
}







//     @Given("The employee is on the manager homepage")
// public void the_employee_is_on_the_manager_homepage() {
//     TestRunner.driver.get("File://C:/Users/Mike/Desktop/P2-Employee-Reimbursement/Tech Project/employee-reimbursement-project/employee-reimbursement/src/main/resources/web pages/EMPLOYEEdavid.html");
// }

    @When("The employee clicks log out button")
    public void the_employee_clicks_log_out_button() {
        TestRunner.employee.clickButton1();
}
    @Then("The employee should be logged out")
    public void the_employee_should_be_logged_out() {
        TestRunner.wait.until(ExpectedConditions.alertIsPresent());
        Assert.assertEquals("You are logged out", TestRunner.driver.switchTo().alert().getText());
        TestRunner.driver.switchTo().alert().accept();
        TestRunner.wait.until(ExpectedConditions.titleIs("AAA Login Page"));
        Assert.assertEquals("AAA Login Page", TestRunner.driver.getTitle());

}



}




  