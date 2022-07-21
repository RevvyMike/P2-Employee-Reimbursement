package com.project2.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

// AAA stands for amphibious assault association
@Entity
@Table(name = "aaa" )
public class Employees {
    
        @Id
        @GeneratedValue
        private int id;             // these fields represent the data in our database
        private String username;
        private String userPassword;
        private String roles;

        
        //empty constructor to initialize hibernate
        public Employees() {}


        public Employees(String username, String userPassword, String roles) {
            this.username = username;
            this.userPassword = userPassword;
            this.roles = roles;
        }


        public Employees(int id, String username, String userPassword, String roles) {
            this.id = id;
            this.username = username;
            this.userPassword = userPassword;
            this.roles = roles;
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


        
        @Override
        public String toString() {
            return "AAA [id=" + id + ", roles=" + roles + ", userPassword=" + userPassword + ", username=" + username
                    + "]";
        }

        
     
        

       


        
    
    


}
