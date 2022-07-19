package com.project2.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

// AAA stands for amphibious assault association
@Entity
@Table(name = "aaa" )
public class AAATable {
    
        @Id
        @GeneratedValue
        private int id;             // these fields represent the data in our database
        private String username;
        private String userPassword;
        private String roles;
        private String employeeName;
        private String requestReason;
        
        //empty constructor to initialize hibernate
        public AAATable() {}


        // partial constructor with no id to make sure we don't assign a bad ID
        public AAATable(String username, String userPassword, String roles, String employeeName, String requestReason) {
            this.username = username;
            this.userPassword = userPassword;
            this.roles = roles;
            this.employeeName = employeeName;
            this.requestReason = requestReason;
        }

        // This constructor will allow our code to fully create AAATable (employee/manager) objects from pre-existing data in our table
        public AAATable(int id, String username, String userPassword, String roles, String employeeName,
                String requestReason) {
            this.id = id;
            this.username = username;
            this.userPassword = userPassword;
            this.roles = roles;
            this.employeeName = employeeName;
            this.requestReason = requestReason;
        }


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


        public String getRequestReason() {
            return requestReason;
        }


        public void setRequestReason(String requestReason) {
            this.requestReason = requestReason;
        }

        // this method is to help us better see what data we are working with our tables.
        @Override
        public String toString() {
            return "AAA [employeeName=" + employeeName + ", id=" + id + ", requestReason=" + requestReason + ", roles="
                    + roles + ", userPassword=" + userPassword + ", username=" + username + "]";
        }


        
    
    


}
