package com.project2.repository;

import java.util.List;

import com.project2.entities.Reimbursement;

public interface ReimbursementDAOInterface {


    //creates
    Reimbursement createReimbursement(Reimbursement newReimbursement);

    //reads
    List <Reimbursement> getAllRequests();
    
    //updates
    Reimbursement updateReimbursement(Reimbursement updateReimbursement);
    
    //deletes
    boolean removedReimbursement(Reimbursement removedReimbursement);
    
}
