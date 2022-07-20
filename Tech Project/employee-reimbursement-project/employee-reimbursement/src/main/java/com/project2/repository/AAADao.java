package com.project2.repository;

import java.util.List;

import com.project2.entities.AAA;
import com.project2.utils.HibernateUtil;

public class AAADao implements AAADAOInterface {


    @Override
    public AAA createRequest(AAA newRequest) {
        HibernateUtil.beginTransaction();
        HibernateUtil.getSession().save(newRequest);
        HibernateUtil.endTransaction();
        return newRequest;
        
    }

    @Override
    public List<AAA> getAllRequests() {
        HibernateUtil.beginTransaction();
        List<AAA> requestList = HibernateUtil.getSession().createQuery("from AAA", AAA.class).getResultList();
        HibernateUtil.endTransaction();
        return requestList;

    }

    @Override
    public AAA updateRequest(AAA updatedRequest) {
        HibernateUtil.beginTransaction();
        HibernateUtil.getSession().update(updatedRequest);
        HibernateUtil.endTransaction();
        return updatedRequest;
    }

    @Override
    public boolean removeRequest(AAA requestToBeDeleted) {
        HibernateUtil.beginTransaction();
        HibernateUtil.getSession().delete(requestToBeDeleted);
        HibernateUtil.endTransaction();
        return true;
    }
    
    
}
