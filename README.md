# Banking System - Spring Boot Project

This is a simple Banking System REST API built with Spring Boot and MySQL. It supports operations on Customers and Bank Accounts like creating, reading, updating, and deleting (CRUD).

## Technologies Used

- Java
- Spring Boot
- Spring Data JPA
- MySQL
- Postman (for API testing)

## Project Structure

- `model/` - Contains entity classes: Customer, BankAccount
- `controller/` - REST controllers for Customer and BankAccount
- `service/` - Service interfaces and implementations
- `repository/` - Spring Data JPA repositories

## API Endpoints

### Customer Endpoints
- `GET /api/customers` – Get all customers
- `GET /api/customers/{id}` – Get a customer by ID
- `POST /api/customers` – Create a new customer
- `PUT /api/customers/{id}` – Update a customer
- `DELETE /api/customers/{id}` – Delete a customer

### Bank Account Endpoints
- `GET /api/accounts` – Get all bank accounts
- `GET /api/accounts/{id}` – Get a bank account by ID
- `POST /api/accounts` – Create a new bank account
- `PUT /api/accounts/{id}` – Update a bank account
- `DELETE /api/accounts/{id}` – Delete a bank account

## How to Run

1. Make sure MySQL is running and update your database details in `application.properties`.
2. Run the Spring Boot application from your IDE
3. Use postman to test APIs
