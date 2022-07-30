Feature: Employee should be able to view previous reimbursement requests

    Scenario: As an employee I want to view a reimbursement request so I see if I can get money back

        Given   The employee is on the on their homepage
        When    The employee views the remibursement requests
        Then    The employee should be ready to create new request

    Scenario: As an employee I want create a reimbursement request so I can get money back

        Given   The employee is in request field on homepage
        When    The employee types request reason into request reason input
        When    The employee types dollar amount into dollar request input
        When    Then employee clicks submit request button
        Then    The employee should be ready to log out

    Scenario: As an employee I want to log out

        Given   The employee is on the manager homepage
        When    The employee clicks log out button
        Then    The employee should be logged out  
