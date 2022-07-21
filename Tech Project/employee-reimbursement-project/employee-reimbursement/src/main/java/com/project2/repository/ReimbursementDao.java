package com.project2.repository;

import java.util.List;

import com.project2.entities.Reimbursement;
import com.project2.utils.HibernateUtil;

public class ReimbursementDao implements ReimbursementDAOInterface {
    
    @Override
    public Reimbursement createReimbursement(Reimbursement newReimbursement) {
        HibernateUtil.beginTransaction();
        HibernateUtil.getSession().save(newReimbursement);
        HibernateUtil.endTransaction();
        return newReimbursement;
    }

    @Override
    public List<Reimbursement> getAllRequests(){
        HibernateUtil.beginTransaction();
        List<Reimbursement> request = HibernateUtil.getSession().createQuery("from Reimbursement", Reimbursement.class).getResultList();
        return request;
        
    }

    @Override
    public Reimbursement updateReimbursement(Reimbursement updateReimbursement) {
        HibernateUtil.beginTransaction();
        HibernateUtil.getSession().update(updateReimbursement);
        HibernateUtil.endTransaction();
        return updateReimbursement;
    }

    @Override
    public boolean removedReimbursement(Reimbursement removedReimbursement) {
        HibernateUtil.beginTransaction();
        HibernateUtil.getSession().delete(removedReimbursement(removedReimbursement));
        HibernateUtil.endTransaction();
        return true;
    }



   
}
