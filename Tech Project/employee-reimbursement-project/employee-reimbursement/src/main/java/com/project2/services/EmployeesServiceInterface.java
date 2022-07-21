package com.project2.services;

import java.util.List;

import com.project2.entities.Employees;

public interface EmployeesServiceInterface {
    
// Business Rules Method
    boolean checkForReason(Employees employeeToCheck);




    // Pulled from AAADaoInterface
    Employees serviceCreateEmployees(Employees newEmployee);
    
    //reads
    
        List<Employees> serviceGetAllEmployees();
     
    // updates
    
        Employees serviceUpdateEmployees(Employees updatedEmployee);
    
    // deletes
    
        boolean serviceRemoveEmployees(Employees employeeToBeDeleted);

}
