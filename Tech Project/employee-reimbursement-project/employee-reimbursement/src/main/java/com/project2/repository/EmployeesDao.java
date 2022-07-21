package com.project2.repository;

import java.util.List;

import com.project2.entities.Employees;
import com.project2.utils.HibernateUtil;

public class EmployeesDao implements EmployeesDAOInterface {


    @Override
    public Employees createEmployees(Employees newEmployee) {
        HibernateUtil.beginTransaction();
        HibernateUtil.getSession().save(newEmployee);
        HibernateUtil.endTransaction();
        return newEmployee;
        
    }

    // @Override
    // public List<Employees> getAllEmployees() {
    //     HibernateUtil.beginTransaction();
    //     List<Employees> requestList = HibernateUtil.getSession().createQuery("from aaa", Employees.class).getResultList();
    //     HibernateUtil.endTransaction();
    //     return requestList;

    // }

    @Override
    public List<Employees> getAllEmployees(){
        HibernateUtil.beginTransaction();
        List<Employees> requestList = HibernateUtil.getSession().createQuery("from Employees", Employees.class).getResultList();
        HibernateUtil.endTransaction();
        return requestList;
    }

    @Override
    public Employees updateEmployees(Employees updatedEmployee) {
        HibernateUtil.beginTransaction();
        HibernateUtil.getSession().update(updatedEmployee);
        HibernateUtil.endTransaction();
        return updatedEmployee;
    }

    @Override
    public boolean removeEmployees(Employees employeeToBeDeleted) {
        HibernateUtil.beginTransaction();
        HibernateUtil.getSession().delete(employeeToBeDeleted);
        HibernateUtil.endTransaction();
        return true;
    }
    
    
}
