### Test Plan   

## Technologies to be used

- Java
- Maven
- Hibernate
- AWS RDS (Postgres)
- Selenium
- Cucumber
- Junit
- HTML
- CSS
-JavaScript

## Entities
Requests:
- Id (int) (primary identifier)
- Employee Name (String/varchar)
- Dollar Request (int)
- Request Reason (varchar)

## User Stories and associated unit/service tests

- As a user I want to sign in to view my homepage
    - Unit Tests
        - sign into user login
            - method: userLogin()
    - Service Tests
        - incorrect credentials
            - method: checkForLogin()
- As a user I should be able to view reimbursement requests
    - Unit Tests
        - see all employee requests in database
            - method: getAllRequests()
    - Service Tests
        - N/A
-  As a manager, I want to approve any reimbursement requests
    - Unit Tests
        - approve employee requests
            - method: approveRequests()
    - Service Tests
        - can't approve without reason
            - method: checkForReason()
- As a manager, I want to deny any reimbursement requests
    - Unit Tests
        - deny employee requests
            - method: denyRequests()
    - Service Tests
        - can't deny without reason
            - method: checkForReason()
-  As a user I want to log out (No NEED TO TEST)
    - Unit Tests
        - log out of user page
            - method: logout()
    - Service Tests
        - log into different user page
            - method: checkLogout()
- As an employee I want to create a reimbursement request so I can get money back
    - Unit Tests
        - create reimbursement request
            - method: createRequest()
    - Service Tests
        - Can't request without reason
            - method: checkForReason()






