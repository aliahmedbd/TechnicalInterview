
**Problem Statement:**

You are tasked with building an account overview and transaction management application. The application should consist of two main screens:
1. Account Overview Screen:
    * This screen will display the user's opening and closing balances for the past three months, derived from the data provided by an API endpoint that returns a list of transactions.
2. Transaction Screen:
    * From the account overview screen, users should be able to navigate to the transaction screen where a detailed list of transactions is displayed.
    * This screen should have the following additional features:
        * A dropdown menu for filtering transactions by type.
        * A search field where users can input keywords to filter transactions based on their query.


**API Specification:**

Endpoint: https://dd28b8de-0a7e-4a8d-b5d4-8f25f5a35069.mock.pstmn.io/accounts/ACT123456/statement/date
TYPE: GET
response: 


**Base project link -> **



**Requirements:**
* Architecture: Follow an architecture such as MVI or MVVM for the implementation.
* Unit Testing: Write unit tests, primarily for testing the ViewModel.
* Asynchronous Programming: Use Coroutines and Flows for managing asynchronous tasks and data flow.
* Performance: Optimize the application for fast and efficient performance.
* Readability: Ensure the code is easy to understand and follow.
* Maintainability: The code should be organized in a way that allows easy future updates and modifications.
* Testability: Design the app to be easily testable, with clear separation of concerns.
* Scalability: Ensure the app can scale easily if new features or transaction data types are added.
* Simplicity: Keep the design and implementation as simple as possible while fulfilling all the functional requirements.

