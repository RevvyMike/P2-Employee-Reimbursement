package com.project2.repository;

import java.util.List;

import com.project2.entities.Employees;







public interface EmployeesDAOInterface {
    
    /*
        This interface is where we will declare the methods that we need to test. all methods created here 
        will by default be considered public and abstract.
     */

// create

    
    Employees createEmployees(Employees newEmployee);
    
//reads

    List<Employees> getAllEmployees();
 
// updates

    Employees updateEmployees(Employees updatedEmployee);

// deletes

    boolean removeEmployees(Employees employeeToBeDeleted);


}
