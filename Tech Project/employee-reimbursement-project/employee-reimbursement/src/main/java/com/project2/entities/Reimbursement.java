package com.project2.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "reimbursement")
public class Reimbursement {
    
    // field represent the data in our table
    @Id
    @GeneratedValue
    private int id;
    private String employee_name;
    private int reimbursement_amount;
    private String request_reason;
    
    
    // empty constructor for hibernate
    public Reimbursement() {}


    // partial constructor to ensure we don't assign a bad id
    public Reimbursement(String employee_name, int reimbursement_amount, String request_reason) {
        this.employee_name = employee_name;
        this.reimbursement_amount = reimbursement_amount;
        this.request_reason = request_reason;
    }

    // This constructor will allow our code to fully create ManagerTable objects from pre-existing data in our table
    public Reimbursement(int id, String employee_name, int reimbursement_request, String request_reason) {
        this.id = id;
        this.employee_name = employee_name;
        this.reimbursement_amount = reimbursement_request;
        this.request_reason = request_reason;
    }

    //  getters & setters
    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }


    public String getEmployeeName() {
        return employee_name;
    }


    public void setEmployeeName(String employee_name) {
        this.employee_name = employee_name;
    }


    public int getReimbursementRequest() {
        return reimbursement_amount;
    }


    public void setReimbursementRequest(int reimbursement_request) {
        this.reimbursement_amount = reimbursement_request;
    }


    public String getRequestReason() {
        return request_reason;
    }


    public void setRequestReason(String request_reason) {
        this.request_reason = request_reason;
    }

    // this method is to help us better see what data we are working with our tables.
    @Override
    public String toString() {
        return "ReimbursementTable [employeename=" + employee_name + ", id=" + id + ", reimbursement_amount="
                + reimbursement_amount + ", request_reason=" + request_reason + "]";
    }

    
}
