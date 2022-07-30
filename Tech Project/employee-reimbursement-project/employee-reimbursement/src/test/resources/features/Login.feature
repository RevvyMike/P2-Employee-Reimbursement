Feature:  Users should be able to login to access their homepages

    Scenario: As a manager, I want to sign in to view my homepage

        Given  The manager is on the login page
        When   The manager enters his correct username
        When   The manager enters his correct password
        When   The manager clicks the login button
        Then   The manager should be logged into the manager home page

    Scenario: As an employee, I want to sign in to view my homepage

        Given  The employee is on the login page
        When   The employee enters his correct username
        When   The employee enters his correct password
        When   The employee clicks the login button
        Then   The employee should be logged into the employee home page