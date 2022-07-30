Feature: Manager should be able to view reimbursement requests

    Scenario: As a manager, I want to view reimbursement requests so that I can address them

        Given The manager is on their homepage
        When  The manager views the reimbursement requests
        Then  The manager should be ready to approve or deny requests     

    Scenario: As a manager, I want to approve any reimbursement requests

        Given  The manager is viewing requests table on homepage
        When   The manager the manager clicks approve button
        Then   The manager should be ready to log out

    Scenario: As a manager, I want to deny any reimbursement requests

        Given  The manager is viewing request table on homepage
        When   The manager clicks deny button
        Then   The manager should be ready to log out

    Scenario: As a manager I want to log out

        Given   The manager is on the manager homepage
        When    The manager clicks log out button
        Then    The manager should be logged out  
