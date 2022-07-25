package com.project2.controllers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;
import com.project2.entities.Reimbursement;
import com.project2.exceptions.InvalidRequest;
import com.project2.services.ReimbursementServiceInterface;

import io.javalin.http.Handler;

public class ReimbursementController {
    
    private ReimbursementServiceInterface reimbursementService;
    private Gson gson; 

    public ReimbursementController(ReimbursementServiceInterface reimbursementService){
        this.reimbursementService = reimbursementService;
        this.gson = new Gson();

    }

    public Handler getAllRequests = ctx -> {
        List<Reimbursement> reimbursementRequests = this.reimbursementService.serviceGetAllRequests();
        String reimbursementRequestsJson = this.gson.toJson(reimbursementRequests);
        ctx.result(reimbursementRequestsJson);
        ctx.status(200);
    };


    public Handler deleteRequests = ctx -> {
            String json = ctx.body();
            Reimbursement requestToDelete = this.gson.fromJson(json, Reimbursement.class);
            this.reimbursementService.serviceRemoveRequests(requestToDelete);
            Map<String, String> message = new HashMap<>();
            message.put("message", "employee was released");
            String messageJson = this.gson.toJson(message);
            ctx.result(messageJson);
            ctx.status(203); //double check
    };

    public Handler updateRequests = ctx -> {
        try{
             // get json from request body
            String json = ctx.body();
            // convert hson to our java object
            Reimbursement updatedRequests = this.gson.fromJson(json, Reimbursement.class);
              // pass the data into the service layer and get method result back
            Reimbursement result = this.reimbursementService.serviceUpdateRequests(updatedRequests);
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


    public Handler createRequests = ctx ->  {
        try {
            String json = ctx.body();
            Reimbursement newRequests = this.gson.fromJson(json, Reimbursement.class);
            Reimbursement result = this.reimbursementService.serviceCreateRequest(newRequests);
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
