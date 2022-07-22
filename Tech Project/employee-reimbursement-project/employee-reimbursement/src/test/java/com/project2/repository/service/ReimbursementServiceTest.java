package com.project2.repository.service;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import com.project2.entities.Reimbursement;
import com.project2.exceptions.InvalidRequest;
import com.project2.repository.ReimbursementDAOInterface;
import com.project2.repository.ReimbursementDao;
import com.project2.services.ReimbursementServiceInterface;
import com.project2.services.ReimbursementServices;

public class ReimbursementServiceTest {

    public static ReimbursementDAOInterface reimbursementDAO;
    public static ReimbursementServiceInterface reimbursementService;
    
    @BeforeClass
    public static void setup(){
        reimbursementDAO = new ReimbursementDao();
        reimbursementService = new ReimbursementServices(reimbursementDAO);
    }

    @Test
    public void checkRequestDollarAmountNegativeTest(){
        Reimbursement badDollar = new Reimbursement("mike",1001,"jet");
        boolean result = reimbursementService.checkRequestDollarAmount(badDollar);
        Assert.assertFalse(result);
    }
    @Test
    
        public void managerCheckRequestLengthNegativeTest(){

            try{
            Reimbursement badLength = new Reimbursement("herman",777,"asdfghjklwasdfghjklwasdfghjklwasdfghjklwasdfghjklwasdfghjklwasdfghjklwasdfghjklwasdfghjklwasdfghjklwasdfghjklwasdfghjklwasdfghjklwasdfghjklwasdfghjklwasdfghjklwasdfghjklwasdfghjklwasdfghjklwasdfghjklwasdfghjklwasdfghjklwasdfghjklwasdfghjklwasdfghjklwasdfghjklwasdfghjklwasdfghjklwasdfghjklwasdfghjklwasdfghjklwasdfghjklwasdfghjklwasdfghjklwasdfghjklwasdfghjklwasdfghjklwasdfghjklwasdfghjklwasdfghjklwasdfghjklwasdfghjklwasdfghjklwasdfghjklwasdfghjklwasdfghjklwasdfghjklwasdfghjklwasdfghjklwasdfghjklwasdfghjklwasdfghjklwasdfghjklwasdfghjklwasdfghjklwasdfghjklwasdfghjklwasdfghjklwasdfghjklwasdfghjklwasdfghjklwasdfghjklwasdfghjklwasdfghjklwasdfghjklwasdfghjklwasdfghjklwasdfghjklwasdfghjklwasdfghjklwasdfghjklwasdfghjklwasdfghjklwasdfghjklwasdfghjklwasdfghjklwasdfghjklwasdfghjklwasdfghjklwasdfghjklwasdfghjklwasdfghjklwasdfghjklwasdfghjklwasdfghjklwasdfghjklwasdfghjklwasdfghjklwasdfghjklwasdfghjklwasdfghjklwasdfghjklwasdfghjklwasdfghjklwasdfghjklwasdfghjklwasdfghjklwasdfghjklwasdfghjklwasdfghjklw");
            boolean result = reimbursementService.managerCheckRequestLength(badLength);
            Assert.fail();
        } catch(InvalidRequest e){
            Assert.assertEquals("Request reason exceeds length", e.getMessage());
        }

    }   
    
    @Test
    public void employeeCheckRequestLengthNegativeTest(){
        try{
            Reimbursement badLength = new Reimbursement("tareka",888,"asdfghjklwasdfghjklwasdfghjklwasdfghjklwasdfghjklwasdfghjklwasdfghjklwasdfghjklwasdfghjklwasdfghjklwasdfghjklwasdfghjklwasdfghjklwasdfghjklwasdfghjklwasdfghjklwasdfghjklwasdfghjklwasdfghjklwasdfghjklwasdfghjklwasdfghjklwasdfghjklwasdfghjklwasdfghjklwasdfghjklwasdfghjklwasdfghjklwasdfghjklwasdfghjklwasdfghjklwasdfghjklwasdfghjklwasdfghjklwasdfghjklwasdfghjklwasdfghjklwasdfghjklwasdfghjklwasdfghjklwasdfghjklwasdfghjklwasdfghjklwasdfghjklwasdfghjklwasdfghjklwasdfghjklwasdfghjklwasdfghjklwasdfghjklwasdfghjklwasdfghjklwasdfghjklwasdfghjklwasdfghjklwasdfghjklwasdfghjklwasdfghjklwasdfghjklwasdfghjklwasdfghjklwasdfghjklwasdfghjklwasdfghjklwasdfghjklwasdfghjklwasdfghjklwasdfghjklwasdfghjklwasdfghjklwasdfghjklwasdfghjklwasdfghjklwasdfghjklwasdfghjklwasdfghjklwasdfghjklwasdfghjklwasdfghjklwasdfghjklwasdfghjklwasdfghjklwasdfghjklwasdfghjklwasdfghjklwasdfghjklwasdfghjklwasdfghjklwasdfghjklwasdfghjklwasdfghjklwasdfghjklwasdfghjklwasdfghjklwasdfghjklwasdfghjklwasdfghjklwasdfghjklwasdfghjklwasdfghjklw");
            boolean result = reimbursementService.employeeCheckRequestLength(badLength);
            Assert.fail();
        } catch(InvalidRequest e){
            Assert.assertEquals("Request reason exceeds length", e.getMessage());
        }
        
    }
}
