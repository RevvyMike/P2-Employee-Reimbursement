package com.project2.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "manager_table")
public class ManagerTable {
    
    // fields that represent the data in our database
    @Id
    @GeneratedValue
    private int id;
    private String employeeName;
    private int reimbursementRequest;
    private String requestReason;

    // empty constructor for hibernate
    public ManagerTable(){}

    // partial constructor will help make sure we don'y accidentally set a bad id
    public ManagerTable(String employeeName, int reimbursementRequest, String requestReason) {
        this.employeeName = employeeName;
        this.reimbursementRequest = reimbursementRequest;
        this.requestReason = requestReason;
    }

    // This constructor will allow our code to fully create ManagerTable objects from pre-existing data in our table
    public ManagerTable(int id, String employeeName, int reimbursementRequest, String requestReason) {
        this.id = id;                                            // primary key
        this.employeeName = employeeName;                   // employee name
        this.reimbursementRequest = reimbursementRequest;   // dollar request amount 
        this.requestReason = requestReason;                 // typed out reason for reimbursement
    }

    // getters & setters
    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }


    public String getEmployeeName() {
        return employeeName;
    }


    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }


    public int getReimbursementRequest() {
        return reimbursementRequest;
    }


    public void setReimbursementRequest(int reimbursementRequest) {
        this.reimbursementRequest = reimbursementRequest;
    }


    public String getRequestReason() {
        return requestReason;
    }


    public void setRequestReason(String requestReason) {
        this.requestReason = requestReason;
    }

    // this method allows us to better see what data we are working with.
    @Override
    public String toString() {
        return "ManagerTable [Id=" + id + ", employeeName=" + employeeName + ", reimbursementRequest="
                + reimbursementRequest + ", requestReason=" + requestReason + "]";
    }

    

}
