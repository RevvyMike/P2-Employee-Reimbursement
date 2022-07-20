package com.project2.repository;

import java.util.List;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import com.project2.entities.AAA;

public class AAATest {
 
    // Here is where we're going to test the AAATableDAO

    // Declared as an interface
    public static AAADAOInterface aaaDao;

    @BeforeClass
    public static void setup(){
        // initialized the field as a AAATableDAO
        aaaDao = new AAADao();

        /*
         Once methods are working, we can adde them to our setup method to programatically 
         set up my test environment for future tests.
         */

         AAA setupUpdateAAA = new AAA();
    }

    @Test
    public void createRequestPositiveTest(){
        AAA testRequest = new AAA("mikeyangelo", "pizzababy", "employee", "Michaelangelo", 600, "Family vacation baby");
        AAA result = aaaDao.createRequest(testRequest);
        Assert.assertNotNull(result.getId());
    }
    
    @Test
    public void getAllRequestsPositiveTest(){
        List<AAA> requestList = aaaDao.getAllRequests();
        Assert.assertTrue(requestList.size() >= 3);
    }

    @Test
    public void updatedRequestPositiveTest(){
        AAA updatedRequest = new AAA(3, "donnyboy", "purple", "employee", "Donatello", 350, "Missing Worker's Comp" );
        AAA result = aaaDao.updateRequest(updatedRequest);
        Assert.assertEquals("donnyboy", result.getUsername());

    }

    @Test
    public void removeRequestPositiveTest(){
        AAA requestToBeDeleted = new AAA(7, "mikeyangelo", "pizzababy", "employee", "Michaelangelo", 600, "Family vacation baby");
        boolean result = aaaDao.removeRequest(requestToBeDeleted);
        Assert.assertTrue(result);
    }
}
