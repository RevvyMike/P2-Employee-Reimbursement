package com.project2.repository;

import java.util.List;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import com.project2.entities.Employees;

public class EmployeesTest {
 
    // Here is where we're going to test the EmployeeDAO

    // Declared as an interface
    public static EmployeesDAOInterface employeeDao;

    @BeforeClass
    public static void setup(){
        // initialized the field as a AAATableDAO
        employeeDao = new EmployeesDao();

        /*
         Once methods are working, we can adde them to our setup method to programatically 
         set up my test environment for future tests.
         */

         Employees setupUpdateEmployee = new Employees(-1, "Leonardo", "Leo", "employee");
         employeeDao.updateEmployees(setupUpdateEmployee);
    }

    @Test
    public void createEmployeesPositiveTest(){
        Employees testEmployee = new Employees(0, "mike", "renfroe", "employee");
        Employees result = employeeDao.createEmployees(testEmployee);
        Assert.assertNotNull(result.getId());
    }
    
    
    @Test
    public void getAllEmployeesPositiveTest(){
        List<Employees> employeeList = employeeDao.getAllEmployees();
        Assert.assertTrue(employeeList.size() >= 3);
    }

    @Test
    public void updatedEmployeesPositiveTest(){
        Employees updatedEmployee = new Employees(-1, "mike mike", "mike ", "employee");
        Employees result = employeeDao.updateEmployees(updatedEmployee);
        Assert.assertEquals("mike mike", result.getUsername());

    }

    @Test
    public void removeEmployeesPositiveTest(){
        Employees requestToBeDeleted = new Employees(291, "mike", "renfroe", "employee");
        boolean result = employeeDao.removeEmployees(requestToBeDeleted);
        Assert.assertTrue(result);
    }
}
