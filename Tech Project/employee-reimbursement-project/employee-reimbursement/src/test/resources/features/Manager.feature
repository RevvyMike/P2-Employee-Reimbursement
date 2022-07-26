Manager Acceptance Criteria

Feature:  The manager should be able to login into the database via webpage

    Scenario: As the manager, I want to view tables in the database

        Given The manager is on the login page
        When  The manager enters their username
        When  The manager enters their password
        When  The manager clicks button to sign in
        Then  The manager should be able to view tables

Feature: The manager should be able to approve reimbursement requests

    Scenario: As a manager, I want to approve reimbursement requests

        Given The manager is logged into the database
        When  The manager views reimbursement requests
        When  The manager selects list to approve request
        Then  The manager should be able to save all changes

Feature: The manager should be able to deny reimbursement requests

    Scenario: As a manager, I want to deny reimbursement requests

        Given  The manager is logged into the database
        When   The manager views reimbursement requests
        When   The manager selects list to deny request
        Then   The manager should be able to save all changes 


Feature: Manager should be able to log out of the database after saving all changes

    Scenario: As a manager I should be able to log out of the webpage 

        Given  The manager is logged into the database
        When   The manager clicks the button to sign out
        Then   The manager should log out and be redirected to the homepage 
