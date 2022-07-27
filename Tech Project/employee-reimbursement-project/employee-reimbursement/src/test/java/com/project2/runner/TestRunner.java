package com.project2.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.project2.poms.Employee;
import com.project2.poms.Login;
import com.project2.poms.Manager;
import com.project2.repository.ReimbursementDAOInterface;
import com.project2.repository.ReimbursementDao;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "classpath:features", glue = "com/project2/steps", plugin = "pretty")
public class TestRunner {

        public static WebDriver driver;        
        public static WebDriverWait wait;
        public static Manager manager;
        public static Employee employee;
        public static Login login;

    @BeforeClass
    public static void setup(){

        System.setProperty("webdriver.chrome.driver", "src/test/resources/features/chromedriver.exe");
        driver = new ChromeDriver();
        
        ReimbursementDAOInterface reimbursementDao = new ReimbursementDao();

        driver= new ChromeDriver(); 
        login= new Login(driver);
        wait = new WebDriverWait(driver,7);
        employee = new Employee(driver);
        manager = new Manager(driver);
}
@AfterClass public static void Teardown(){
    driver.quit();
}

    
    
}
