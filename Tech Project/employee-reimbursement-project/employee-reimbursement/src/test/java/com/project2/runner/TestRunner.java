package com.project2.runner;

import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

// import com.project2.entities.Employees;
// import com.project2.entities.Reimbursement;
import com.project2.poms.Employee;
import com.project2.poms.Login;
import com.project2.poms.Manager;
// import com.project2.repository.EmployeesDAOInterface;
// import com.project2.repository.EmployeesDao;
// import com.project2.repository.ReimbursementDAOInterface;
// import com.project2.repository.ReimbursementDao;

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

        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver,15);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        login= new Login(driver);
        manager = new Manager(driver);
        employee = new Employee(driver);

        // ReimbursementDAOInterface reimbursementDao = new ReimbursementDao();
        // Reimbursement reimbursementForE2ETest = reimbursementDao.createReimbursement(new Reimbursement("Mike",700, "comic books E2E", "Approved: I love comics"));
        // EmployeesDAOInterface employeesDao = new EmployeesDao();
        // Employees employeeForE2ETest = employeesDao.createEmployees(new Employees(0,"","",""));
    }

    @AfterClass 
    public static void teardown(){
        driver.quit();

    }

    
    
}
