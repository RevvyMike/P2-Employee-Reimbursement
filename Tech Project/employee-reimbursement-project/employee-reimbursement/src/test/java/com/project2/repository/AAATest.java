package com.project2.repository;

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

    }

    @Test
    public void createRequestPositiveTest(){
        AAA testLogin = new AAA("mikeyangelo", "pizzababy", "employee", "Michaelangelo", 600, "Family vacation baby");
        AAA result = aaaDao.createRequest(testLogin);
        Assert.assertNotNull(result.getId());
    }

}
