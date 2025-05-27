Class Design:
BankAccount (Abstract Parent Class):
o	Includes fundamental attributes such as accountNumber, balance, and ownerName.
o	Offers methods for depositing funds, withdrawing money, and displaying account information, with the withdraw method being abstract to ensure all child classes implement it.
SavingsClass (Child Class):
o	Introduces functionality for applying interest to the account balance.
o	Inherits all properties and methods from the parent class.
o	Implements its own versions of the deposit and withdraw methods.
CurrentAccount Class:
•	Manages an overdraft limit for transactions.
•	Inherits from the parent class (BankAccount).
•	Defines its own logic for depositing and withdrawing funds.
Customer Class:
•	Enables users to create and manage multiple bank accounts.
•	Demonstrates aggregation, reflecting a "has-a" relationship where a customer can possess one or more accounts.
OOP Implementation:
•	The BankAccount class is abstract, adhering to the principle of abstraction by concealing internal implementation details.
•	Both SavingsClass and CurrentAccount extend BankAccount, showcasing inheritance in action.
•	Sensitive attributes like balance are kept private and accessed via getters and setters, enforcing encapsulation.
•	Runtime polymorphism is achieved by overriding the withdraw method in child classes, customizing its behavior as needed.
•	The Customer class aggregates one or more BankAccount objects, modeling a real-world relationship through aggregation.
•	The InsufficientBalanceException is utilized to handle cases where withdrawals exceed the available balance or overdraft limit, ensuring graceful error handling.
