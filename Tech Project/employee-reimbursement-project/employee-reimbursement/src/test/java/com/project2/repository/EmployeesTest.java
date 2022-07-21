package com.project2.repository;

import java.util.List;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import com.project2.entities.Employees;

public class EmployeesTest {
 
    // Here is where we're going to test the AAATableDAO

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

         Employees setupUpdateEmployee = new Employees(28, "bluenardo", "Leonardo", "employee");
         employeeDao.updateEmployees(setupUpdateEmployee);
    }

    @Test
    public void createEmployeesPositiveTest(){
        Employees testEmployee = new Employees("aoneil", "thegirl", "employee");
        Employees result = employeeDao.createEmployees(testEmployee);
        Assert.assertNotNull(result.getId());
    }
    
    @Test
    public void getAllEmployeesPositiveTest(){
        List<Employees> requestList = employeeDao.getAllEmployees();
        Assert.assertTrue(requestList.size() >= 3);
    }

    @Test
    public void updatedEmployeesPositiveTest(){
        Employees updatedEmployee = new Employees(29, "donnyboy", "purple", "employee");
        Employees result = employeeDao.updateEmployees(updatedEmployee);
        Assert.assertEquals("donnyboy", result.getUsername());

    }

    @Test
    public void removeEmployeesPositiveTest(){
        Employees requestToBeDeleted = new Employees(29, "donnyboy", "purple", "employee");
        boolean result = employeeDao.removeEmployees(requestToBeDeleted);
        Assert.assertTrue(result);
    }
}
