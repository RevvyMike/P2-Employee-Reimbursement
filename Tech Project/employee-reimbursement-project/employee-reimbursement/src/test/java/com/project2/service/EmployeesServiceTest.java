package com.project2.service;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import com.project2.entities.Employees;
import com.project2.repository.EmployeesDAOInterface;
import com.project2.repository.EmployeesDao;
import com.project2.services.EmployeesService;
import com.project2.services.EmployeesServiceInterface;

public class EmployeesServiceTest {
 
   public static EmployeesDAOInterface employeeDao;
   public static EmployeesServiceInterface employeeService;

   @BeforeClass
   public static void setup(){
        employeeDao = new EmployeesDao();
        employeeService = new EmployeesService(employeeDao);
   }

   
   @Test
   public void checkForLoginNegativeTest(){
        Employees badLogin = new Employees( "mikeyangelo", "thatguy", "employee");
        boolean result = employeeService.checkForLogin(badLogin);
        Assert.assertFalse(result);
   }


}




