package com.project2.services;

import java.util.List;

import com.project2.entities.Reimbursement;
import com.project2.exceptions.InvalidRequest;
import com.project2.repository.ReimbursementDAOInterface;

public class ReimbursementServices implements ReimbursementServiceInterface {
    
    public ReimbursementDAOInterface reimbursementDao;

    public ReimbursementServices (ReimbursementDAOInterface reimbursementDao){
        // the ReimbursementDao field is part of the object scope, so make sure to use the this keyword
        this.reimbursementDao = reimbursementDao;
    }

    @Override
    public boolean employeeCheckRequestLength(Reimbursement request_reason){
        if (request_reason.getRequestReason().length()<= 500){
            return true;
        } else {
            throw new InvalidRequest("Request reason exceeds length");
        }
    }

    @Override
    public boolean managerCheckRequestLength(Reimbursement request_reason){
        if (request_reason.getRequestReason().length()<= 500){
            return true;
        } else {
            throw new InvalidRequest("Request reason exceeds length");
        }
    }


    @Override
    public boolean checkRequestDollarAmount(Reimbursement reimbursement_amount) {
        if (reimbursement_amount.getReimbursementRequest()<= 1000){
            return true;
        } else {
            return false;
        }

    }

    @Override
    public Reimbursement serviceCreateRequest(Reimbursement newReimbursement) {
        return this.reimbursementDao.createReimbursement(newReimbursement);
    }

    @Override
    public List<Reimbursement> serviceGetAllRequests() {
        return this.reimbursementDao.getAllRequests();
    }

    @Override
    public Reimbursement serviceUpdateRequests(Reimbursement updatedReimbursement) {
        return this.reimbursementDao.updateReimbursement(updatedReimbursement);
    }

    @Override
    public boolean serviceRemoveRequests(Reimbursement requestToBeDeleted) {
        return this.reimbursementDao.removedReimbursement(requestToBeDeleted);
    }


}
