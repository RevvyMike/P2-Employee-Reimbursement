package com.project2.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

// AAA stands for amphibious assault association
@Entity
@Table(name = "aaa" )
public class AAA {
    
        @Id
        @GeneratedValue
        private int id;             // these fields represent the data in our database
        private String username;
        private String userPassword;
        private String roles;
        private String employeeName;
        private int amountRequested;
        private String decision;
        
        //empty constructor to initialize hibernate
        public AAA() {}

         // partial constructor with no id to make sure we don't assign a bad ID        
        public AAA(String username, String userPassword, String roles, String employeeName, int amountRequested,
                String decision) {
            this.username = username;
            this.userPassword = userPassword;
            this.roles = roles;
            this.employeeName = employeeName;
            this.amountRequested = amountRequested;
            this.decision = decision;
        }

        // This constructor will allow our code to fully create AAATable (employee/manager) objects from pre-existing data in our table
        public AAA(int id, String username, String userPassword, String roles, String employeeName, int amountRequested,
                String decision) {
            this.id = id;
            this.username = username;
            this.userPassword = userPassword;
            this.roles = roles;
            this.employeeName = employeeName;
            this.amountRequested = amountRequested;
            this.decision = decision;
        }

        // getters & setters
        public int getId() {
            return id;
        }


        public void setId(int id) {
            this.id = id;
        }


        public String getUsername() {
            return username;
        }


        public void setUsername(String username) {
            this.username = username;
        }


        public String getUserPassword() {
            return userPassword;
        }


        public void setUserPassword(String userPassword) {
            this.userPassword = userPassword;
        }


        public String getRoles() {
            return roles;
        }


        public void setRoles(String roles) {
            this.roles = roles;
        }


        public String getEmployeeName() {
            return employeeName;
        }


        public void setEmployeeName(String employeeName) {
            this.employeeName = employeeName;
        }


        public int getAmountRequested() {
            return amountRequested;
        }


        public void setAmountRequested(int amountRequested) {
            this.amountRequested = amountRequested;
        }


        public String getDecision() {
            return decision;
        }


        public void setDecision(String decision) {
            this.decision = decision;
        }

        // this method is to help us better see what data we are working with our tables.
        @Override
        public String toString() {
            return "AAA [amountRequested=" + amountRequested + ", decision=" + decision + ", employeeName="
                    + employeeName + ", id=" + id + ", roles=" + roles + ", userPassword=" + userPassword
                    + ", username=" + username + "]";
        }


       


        
    
    


}
