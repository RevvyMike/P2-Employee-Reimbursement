package com.project2.steps;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.project2.runner.TestRunner;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
    
    @Given("The manager is on the login page")
    public void the_manager_is_on_the_login_page() {
        TestRunner.driver.get("File://C:/Users/Mike/Desktop/P2-Employee-Reimbursement/Tech Project/employee-reimbursement-project/employee-reimbursement/src/main/resources/web pages/login.html");
    }

    @When("The manager enters his correct username")
    public void the_manager_enters_his_correct_username() {
        TestRunner.login.enterUsername("MasterSplinter");
}

    @When("The manager enters his correct password")
    public void the_manager_enters_his_correct_password() {
        TestRunner.login.enterPassword("rat");
}

    @When("The manager clicks the login button")
    public void the_manager_clicks_the_login_button() {
        TestRunner.login.clickButton();
}


    @Then("The manager should be logged into the manager home page")
    public void the_manager_should_be_logged_into_the_manager_home_page() {
        TestRunner.wait.until(ExpectedConditions.titleIs("AAA Manager Page"));
        Assert.assertEquals("AAA Manager Page", TestRunner.driver.getTitle());
        TestRunner.driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
        // TestRunner.driver.get("File://C:/Users/Mike/Desktop/P2-Employee-Reimbursement/Tech Project/employee-reimbursement-project/employee-reimbursement/src/main/resources/web pages/P2Manager.html");
}


    @Given("The employee is on the login page")
    public void the_employee_is_on_the_login_page() {
        TestRunner.driver.get("File://C:/Users/Mike/Desktop/P2-Employee-Reimbursement/Tech Project/employee-reimbursement-project/employee-reimbursement/src/main/resources/web pages/login.html");
}


    @When("The employee enters his correct username")
    public void the_employee_enters_his_correct_username() {
        TestRunner.login.enterUsername("Leonardo");
}

    @When("The employee enters his correct password")
    public void the_employee_enters_his_correct_password() {
        TestRunner.login.enterPassword("leo");
}

    @When("The employee clicks the login button")
    public void the_employee_clicks_the_login_button() {
        TestRunner.login.clickButton();
}

    @Then("The employee should be logged into the employee home page")
    public void the_employee_should_be_logged_into_the_employee_home_page() {
        TestRunner.wait.until(ExpectedConditions.titleIs("Reimbursement Request"));
        Assert.assertEquals("Reimbursement Request", TestRunner.driver.getTitle());
        TestRunner.driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
        // TestRunner.driver.get("File://C:/Users/Mike/Desktop/P2-Employee-Reimbursement/Tech Project/employee-reimbursement-project/employee-reimbursement/src/main/resources/web pages/EMPLOYEEdavid.html");
}



}
