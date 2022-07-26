package com.project2;

import com.project2.controllers.EmployeesController;
import com.project2.controllers.ReimbursementController;
import com.project2.repository.EmployeesDAOInterface;
import com.project2.repository.EmployeesDao;
import com.project2.repository.ReimbursementDAOInterface;
import com.project2.repository.ReimbursementDao;
import com.project2.services.EmployeesService;
import com.project2.services.EmployeesServiceInterface;
import com.project2.services.ReimbursementServiceInterface;
import com.project2.services.ReimbursementServices;
import com.project2.utils.HibernateUtil;

import io.javalin.Javalin;

public class Main {
    

    // reminder: this main method is the entry point for your application
    public static void main(String[] args) {
      HibernateUtil.getSessionFactory();
        // inside of the create method we call a lambda that Javalin can use to configure our web server
        Javalin app = Javalin.create(config ->{
            config.enableCorsForAllOrigins();   // This will make sure that we can access and get infromation to and from all of our webpages
            config.enableDevLogging();          // With this anytime you make an http request or get any kind of feeback from our application it will show up in our terminal.
        });  
        
    /* 
        For our controller class to be able to send information to the service layer for validation it 
        must be given a service object. however, that service object requires its own dependencies to work 
        correctly, so this is where we create out official objects for our repository and service layers so 
        that our API can correctly send information where it needs to go
    */

        EmployeesDAOInterface employeeDao = new EmployeesDao();
        // just realizing We forgot business rules (talk to eric and see how this will affect things)
        EmployeesServiceInterface employeesService = new EmployeesService(employeeDao);
        EmployeesController employeesController = new EmployeesController(employeesService);

        ReimbursementDAOInterface reimbursementDao = new ReimbursementDao();
        ReimbursementServiceInterface reimbursementService = new ReimbursementServices(reimbursementDao);
        ReimbursementController reimbursementController = new ReimbursementController(reimbursementService);

        // hello world example
        app.get("/hello", employeesController.getHelloWorld);

        /*
            Notice that my path strings all include employees in them: this is part of creating a restful web service.
         */
        
        // get all employees
        app.get("/employees", employeesController.getAllEmployees);

        app.delete("/employees/{id}", employeesController.deleteEmployees);

        app.patch("/employees/{id}", employeesController.updateEmployees);

        app.post("/employees", employeesController.createEmployees);

        app.get("/requests", reimbursementController.getAllRequests);

        app.delete("/requests/{id}", reimbursementController.deleteRequests);

        app.patch("/requests/{id}", reimbursementController.updateRequests);

        app.post("/requests", reimbursementController.createRequests);

        app.start();



    }

}
