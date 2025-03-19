
***Problem Statement:***

You are tasked with building an account overview and transaction management application. The application should consist of two main screens:
1. Account Overview Screen:
    * This screen will display the user's opening and closing balances for the past three months, derived from the data provided by an API endpoint that returns a list of transactions.
2. Transaction Screen:
    * From the account overview screen, users should be able to navigate to the transaction screen where a detailed list of transactions is displayed.
    * This screen should have the following additional features:
        * A dropdown menu for filtering transactions by type.
        * A search field where users can input keywords to filter transactions based on their query.
     

We have already finished the basic setup and implemented some of the boilerplate code.
- `NavGraph` is for hosting the Jetpack navigation
- An account overview screen is created which is `AccountOverviewScreen` with ViewModel
- A transaction screen is created which is `TransactionScreen` with ViewModel


***Screenshot***
<img width="400" alt="Screenshot 2025-03-19 at 16 16 23" src="https://github.com/user-attachments/assets/56006d5e-e45a-46fe-abd3-09ee1099764a" />


***Requirements:***
* **Architecture**: Follow an architecture such as **MVI** or **MVVM** for the implementation.
* **Unit Testing**: Write unit tests, primarily for testing the ViewModel.
* **Asynchronous** Programming: Use Coroutines and Flows for managing asynchronous tasks and data flow.
* **Performance**: Optimize the application for fast and efficient performance.
* **Readability**: Ensure the code is easy to understand and follow.
* **Maintainability**: The code should be organized in a way that allows easy future updates and modifications.
* **Testability**: Design the app to be easily testable, with clear separation of concerns.
* **Scalability**: Ensure the app can scale easily if new features or transaction data types are added.
* **Simplicity**: Keep the design and implementation as simple as possible while fulfilling all the functional requirements.
  
**Notes:**
- Please feel free to use the internet but **not any AI tools**.
- Create a branch from the main branch and name it "**develop-(name)**", add as many as commits you want and after finishing the development please push your changes.
- Feel free to ask us anything


***API Specification:***

Endpoint: https://dd28b8de-0a7e-4a8d-b5d4-8f25f5a35069.mock.pstmn.io/accounts/ACT123456/statement/date

TYPE: **GET**

**Response**: 

```json
{
    "period": "latest",
    "balance": {
        "opening": 780.89,
        "closing": 162.46
    },
    "money": {
        "in": 788.02,
        "out": 163.88
    },
    "transactions": [
        {
            "date": "Mon Mar 17 2025 20:55:37 GMT+0000 (Coordinated Universal Time)",
            "description": "Dooley - Hirthe",
            "type": "invoice",
            "amount": 945.05,
            "balance": 502.25
        },
        {
            "date": "Tue Mar 18 2025 05:03:27 GMT+0000 (Coordinated Universal Time)",
            "description": "Weissnat Group",
            "type": "invoice",
            "amount": 736.89,
            "balance": 183.11
        },
        {
            "date": "Tue Mar 18 2025 11:10:44 GMT+0000 (Coordinated Universal Time)",
            "description": "Lebsack - Braun",
            "type": "invoice",
            "amount": 6.9,
            "balance": 521.41
        },
        {
            "date": "Tue Mar 18 2025 07:58:13 GMT+0000 (Coordinated Universal Time)",
            "description": "Jacobi - Bauch",
            "type": "withdrawal",
            "amount": 79.18,
            "balance": 954.26
        },
        {
            "date": "Mon Mar 17 2025 22:45:32 GMT+0000 (Coordinated Universal Time)",
            "description": "Runte - Fay",
            "type": "deposit",
            "amount": 644.4,
            "balance": 838.43
        },
        {
            "date": "Tue Mar 18 2025 02:38:08 GMT+0000 (Coordinated Universal Time)",
            "description": "DuBuque, Fay and Davis",
            "type": "payment",
            "amount": 870.99,
            "balance": 223.99
        },
        {
            "date": "Tue Mar 18 2025 10:14:49 GMT+0000 (Coordinated Universal Time)",
            "description": "Bosco - Gerlach",
            "type": "payment",
            "amount": 982.72,
            "balance": 445.76
        },
        {
            "date": "Tue Mar 18 2025 10:02:03 GMT+0000 (Coordinated Universal Time)",
            "description": "Schimmel, McCullough and Connelly",
            "type": "withdrawal",
            "amount": 197.49,
            "balance": 250.28
        },
        {
            "date": "Tue Mar 18 2025 02:04:08 GMT+0000 (Coordinated Universal Time)",
            "description": "Emard - Schimmel",
            "type": "payment",
            "amount": 352.99,
            "balance": 639.39
        },
        {
            "date": "Mon Mar 17 2025 20:20:33 GMT+0000 (Coordinated Universal Time)",
            "description": "Keeling, Parisian and Terry",
            "type": "deposit",
            "amount": 983.06,
            "balance": 303.12
        }
    ]
}
```



