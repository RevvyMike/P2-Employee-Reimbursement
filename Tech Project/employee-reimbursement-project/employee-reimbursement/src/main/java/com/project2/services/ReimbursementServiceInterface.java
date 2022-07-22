package com.project2.services;

import com.project2.entities.Reimbursement;

public interface ReimbursementServiceInterface {
    // Business Rules Method
    // Checks Dollar amount
    boolean checkRequestDollarAmount(Reimbursement reimbursement_amount);

    //Checks request length  
    boolean managerCheckRequestLength(Reimbursement request_reason);

    boolean employeeCheckRequestLength(Reimbursement request_reason);
    
    

}
