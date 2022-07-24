package com.project2.services;

import java.util.List;

import com.project2.entities.Employees;
import com.project2.repository.EmployeesDAOInterface;

public class EmployeesService implements EmployeesServiceInterface{

/*
    Because my service class is gate-keeping for the repository layer, it needs to have some way
    of sending data that has been validated to the repository layer. This is accomplished by using 
    dependency injection: I create a field of the proper data access object interface, and then I used
    the constructor at runtime to create the proper implementation object for said interface.
 */
    private EmployeesDAOInterface employeeDao;

    public EmployeesService (EmployeesDAOInterface employeeDao){
        // the aaaDao field is part of the object scope, so make sure to use the this keyword
        this.employeeDao = employeeDao;
    }


    // @Override
    // public boolean checkForLogin(Employees employeeToCheck) {
    //   List<Employees> listOfEmployees = employeeDao.getAllEmployees();
    //   if(listOfEmployees.size() == 1){
    //     return true;
    //   }  else {
    //     return false;
    //   }
      
    @Override
    public boolean checkForLogin(Employees checkCredentials){
        List<Employees> listOfEmployees = employeeDao.getAllEmployees();
        for(Employees creds : listOfEmployees){
            if(creds.getUsername().equals(checkCredentials.getUsername()) && creds.getUserPassword().equals(checkCredentials.getUserPassword())){
                return true;
            }
        } 
        return false;
    }

    // @Override
    // public boolean checkForLogin(Employees credentials){
    //     List<Employees> allCredentials = this.employeeDao.getAllEmployees;
    //     for(Employees creds : allCredentials){
    //         if(creds.getUsername.equals(credentials.getUsername) && creds.getPassword.equals(credentials.getPassword)){
    //             return true;
    //         }
    //     }
    //     return false
    // }



    @Override
    public Employees serviceCreateEmployees(Employees newEmployee) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<Employees> serviceGetAllEmployees() {
        // no business rules associated with this method. MAYBE
        return this.employeeDao.getAllEmployees();
    }

    @Override
    public Employees serviceUpdateEmployees(Employees updatedEmployee) {
        // TODO Auto-generated method stub
        return null;
    }
        // All that's needed for the remove method because there are no business rules for removing requests.
        // this method sends information to the already tested repository methods.
    @Override
    public boolean serviceRemoveEmployees(Employees requestToBeDeleted) {
        return this.employeeDao.removeEmployees(requestToBeDeleted);
    }




    
}
