Feature:  The employee scenarios

    Scenario: As the employee, I want to view tables in the database

        Given  The employee is on the login page
        When   The employee enters their username
        When   The employee enters their password
        When   The employee clicks button to sign in
        Then   The employee should be able to view table


# Feature: The employee should be able to check status on reimbursement requests

#Scenario: As an employee I want to check the status on my reimbursement request

        #Given  The employee is logged into the webpage
        #When   The employee checks on current status 
        #Then   The employee should see more details

# Feature: The employee should be able to create a new reimbursement request 

    Scenario: As an employee I want create a reimbursement request via webpage

        #Given  The employee is logged into the database to make a reimbursement request
        When   The employee enters the employees username 
        When   The employee enters a dollar amount less than or equal to $1000
        When   The employee enters a request description
        When   The employee clicks on the submit button
        Then   The employee sees a success notification


# Feature: The employee should be able to log out of the database for security reasons

    Scenario: As an employee I need to close the session by logging out

        Given  The employee is on the webpage
        When   The employee clicks the button to sign out
        Then   The employee should be logged out and be redirected to the homepage 
