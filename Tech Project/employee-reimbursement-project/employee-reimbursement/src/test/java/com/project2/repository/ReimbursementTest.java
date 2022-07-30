package com.project2.repository;

import java.util.List;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import com.project2.entities.Reimbursement;

public class ReimbursementTest {
    public static ReimbursementDAOInterface reimbursementDAO;

    @BeforeClass
    public static void setup(){
        reimbursementDAO = new ReimbursementDao();
    }

    @Test
    public void createReimbursementPositiveTest(){
        Reimbursement testReimbursement = new Reimbursement("herm",400,"fuel", "Denied");
        Reimbursement result = reimbursementDAO.createReimbursement(testReimbursement);
        Assert.assertNotNull(result.getId());
    }

    @Test
    public void getAllReimbursementPositiveTest(){
        List<Reimbursement>requests = reimbursementDAO.getAllRequests();
        Assert.assertTrue(requests.size() >= 1);
    }

    @Test
    public void updateReimbursementPositiveTest(){
        Reimbursement updateReimbursement = new Reimbursement(296,"david", 555,"fuel surcharge", "Denied");
        Reimbursement result = reimbursementDAO.updateReimbursement(updateReimbursement);
        Assert.assertEquals(296, result.getId());
    }

    @Test
    public void removedReimbursementPositiveTest(){
        Reimbursement removedReimbursement = new Reimbursement(312, "herm",	400,	"fuel", "Denied");
        Boolean result = reimbursementDAO.removedReimbursement(removedReimbursement);
        Assert.assertTrue(result);
    }
}
