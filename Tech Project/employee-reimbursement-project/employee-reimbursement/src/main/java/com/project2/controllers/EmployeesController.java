package com.project2.controllers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;
import com.project2.entities.Employees;
import com.project2.exceptions.InvalidRequest;
import com.project2.services.EmployeesServiceInterface;

import io.javalin.http.Handler;

public class EmployeesController {
    
    private EmployeesServiceInterface employeesService;
    private Gson gson;

    public EmployeesController(EmployeesServiceInterface employeesService){
        this.employeesService = employeesService;
        this.gson = new Gson();
    }
    /*
        This employee controller is goign to parse the information received in HTTP request bodies, send the information 
        to the appropriate service method, and craft an HTTP Response for us based upon the data recieved from 
        the service methods
     */

     /*
        This is the basic setup for how to handle HTTP requests via Javalin: you create a variable that is a 
        reference to a lambda, provide an argument called ctx (stands for context, provided by Javalin), and the
        you write your code to handle the request
      */
     public Handler getHelloWorld = ctx -> {
        ctx.result("Hello World!");
        ctx.status(200);
     };

     public Handler getAllEmployees = ctx -> {
        List<Employees> employees = this.employeesService.serviceGetAllEmployees();
        /*
            Employees arraylist above contains mulptiple Java employee objects; these need to turn into
            JSON formatting to be able to attach them to the HTTP Response Body. We can use the GSON library
            we acquired from the maven repository to handle this conversion process for us
         */
        
        // the toJson method provided by Gson turns out collection of Employees objects into a formatted string
        String employeesJson = this.gson.toJson(employees);
        // we use the ctx.result() method to attach the employeesJson to the resposne body
        ctx.result(employeesJson);
        ctx.status(200);
     };

     public Handler deleteEmployees = ctx -> {
        // the ctx.body() method creates a java string object from the content of the request body
        String json = ctx.body();
        // conmverts json string into the java class we are working with.
        Employees employeeToDelete = this.gson.fromJson(json, Employees.class);
         // passes the java object we created into the appropriate service method for validation
        this.employeesService.serviceRemoveEmployees(employeeToDelete);
        // because I am not returning any special entity with this method I will use a map to create my key/value pair
        Map<String, String> message = new HashMap<>();
        message.put("message", "employee was released");
        // once the map is made we conver it into a json
        String messageJson = this.gson.toJson(message);
        // then we attach it to the response body and set the status code.
        ctx.result(messageJson);
        ctx.status(203); //double check
     };

    public Handler updateEmployees = ctx -> { // THIS MAY NOT need the Try catch block since we didn't use one for update, We only used this for checkin login in Employees service layer
        try{
            // get json from request body
            String json = ctx.body();
            // convert hson to our java object
            Employees updatedEmployees = this.gson.fromJson(json, Employees.class);
            // pass the data into the service layer and get method result back
            Employees result = this.employeesService.serviceUpdateEmployees(updatedEmployees);
            // convert the result into a json
            String resultJson = this.gson.toJson(result);
            // set the response body and status code
            ctx.result(resultJson);
            ctx.status(200);
        } catch(InvalidRequest e){
            // create a map to easily make key/value pair for json
            Map<String, String> message = new HashMap<>();
            // place the exception message into the map
            message.put("message", e.getMessage());
            // convert the map into a json
            String messageJson = this.gson.toJson(message);
            // attach the json to the response body and set the status code
            ctx.result(messageJson);
            ctx.status(400); 
        }
    };


    public Handler createEmployees = ctx -> {
        try {
            String json = ctx.body();
            Employees newEmployees = this.gson.fromJson(json, Employees.class);
            Employees result = this.employeesService.serviceCreateEmployees(newEmployees);
            String resultJson = this.gson.toJson(result);
            ctx.result(resultJson);
            ctx.status(201);
        } catch (InvalidRequest e) {
            Map<String, String> message = new HashMap<>();
            message.put("message", e.getMessage());
            String messageJson = this.gson.toJson(message);
            ctx.result(messageJson);
            ctx.status(400); 
        }
     
    };


}
