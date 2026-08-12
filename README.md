
# 🚀 BridgeLabz Training

> This repository contains my **BridgeLabz Training journey**, including daily learning, assignments, practical exercises, and projects.

The training is organized day-wise to make the progress easy to follow.

---

## 📚 Training Progress

| Day | Topic | Project / Activity |
|---|---|---|
| Day 01 | DDL & DML | Database Operations |
| Day 02 | ER Diagrams & Normalization | Health Clinic Database |
| Day 03 | Joins, Triggers & Stored Procedures | Advanced SQL |
| Day 04 | Java + JDBC | HealthClinic CLI |
| Day 05 | Spring Core | Spring Configuration |
| Day 06 | Spring MVC | MyGreetingApp |
| Day 07 | Spring Boot + JPA | ContactApp |
| Day08  | API Testing & SDLC | ContactApp |

---

# 🗓️ Day 01 — DDL & DML Operations

### 🎯 Focus

Introduction to **DBMS, DDL, DML, and CRUD operations**.

### 📌 Topics Covered

- Introduction to DBMS
- Problems with file-based storage
- Data redundancy and consistency
- DDL commands
- DML commands
- CRUD operations

### 🔗 Resources

[View Day 01](https://github.com/vikashkrsingh1003/BridgeLabz-Training/tree/Refresher-Training/Refresher-Training/Day01)

---

# 🗓️ Day 02 — ER Diagrams & Normalization

### 🎯 Focus

Database design using **ER diagrams, relationships, and normalization**.

### 📌 Topics Covered

- ER Diagrams
- One-to-Many relationships
- Many-to-Many relationships
- Junction Tables
- Data Anomalies
- 1NF, 2NF, and 3NF

### 🏥 Practical Work

Designed a **Health Clinic database** using:

```text
Patient → Appointment ← Doctor
```
### 🔗 Resources

[View Day 02](https://github.com/vikashkrsingh1003/BridgeLabz-Training/tree/Refresher-Training/Refresher-Training/Day02)

---

# 🗓️ Day 03 — Joins, Triggers & Stored Procedures

## 🎯 Focus Area

Working with advanced SQL concepts including **Joins, Triggers, and Stored Procedures**.

## 📚 Concepts Covered

### 🔄 SQL Joins

- `INNER JOIN` - Retrieves matching records from both tables
- `LEFT JOIN` - Retrieves all records from the left table
- `RIGHT JOIN` - Retrieves all records from the right table

### ⚡ Triggers

Implemented triggers for automating database operations:

- `AFTER INSERT` - Updates doctor statistics when an appointment is created
- `AFTER UPDATE` - Logs patient information changes
- `AFTER DELETE` - Updates doctor statistics when an appointment is cancelled

### ⚙️ Stored Procedures

Implemented stored procedures for:

- `AddDoctor`
- `AddPatient`
- `BookAppointment`

## 💡 Key Learning

Learned how SQL Joins are used to retrieve related data and how Triggers and Stored Procedures can automate and simplify database operations.

## 🔗 Resources

[View Day 03 Directory](https://github.com/vikashkrsingh1003/BridgeLabz-Training/tree/Refresher-Training/Refresher-Training/Day03)

---

# 🗓️ Day 04 — HealthClinic CLI Application

## 🎯 Focus Area

Building a **Java CLI application** to interact with the HealthClinic database using **JDBC**.

## 🛠️ Technologies Used

- Java
- JDBC
- MySQL
- SQL

## 📚 Concepts Covered

- JDBC workflow
- Database connection
- `PreparedStatement`
- `ResultSet`
- POJO classes
- CRUD operations
- Exception handling
- Menu-driven CLI application

## ✨ Application Features

- Add doctors
- Add patients
- Book appointments
- Update appointments
- Cancel appointments
- View patient history
- View doctor schedules

## 🏗️ Application Flow

```text
Java CLI Application
        ↓
       JDBC
        ↓
   MySQL Database
```
### 🔗 Resources

[View Day 04](https://github.com/vikashkrsingh1003/BridgeLabz-Training/tree/Refresher-Training/Refresher-Training/Day04)

---

# 🗓️ Day 05 — Spring Core Configuration

## 🎯 Focus Area

Understanding **Spring Core**, IoC, Dependency Injection, and different Spring configuration approaches.

## 📚 Concepts Covered

- Inversion of Control (IoC)
- Dependency Injection
- Constructor Injection
- Spring Beans
- IoC Container
- Component Scanning
- XML-based Configuration
- Annotation-based Configuration
- Java-based Configuration
- `@Component`
- `@Autowired`
- `@Configuration`
- `@Bean`

## 🔧 Configuration Approaches

### 1. XML-Based Configuration

Configured Spring Beans using `applicationContext.xml`.

### 2. Annotation-Based Configuration

Used annotations such as:


@Component
@Autowired

### 🔗 Resources

[View Day 05](https://github.com/vikashkrsingh1003/BridgeLabz-Training/tree/Refresher-Training/Refresher-Training/Day05)

---

# 🗓️ Day 06 — MyGreetingApp | Spring MVC

## 🎯 Focus Area

Building a basic **Spring MVC web application** using Controller, Service, and Model layers.

## 🛠️ Technologies Used

- Java
- Spring Core
- Spring MVC
- Maven

## 📚 Concepts Covered

- Spring MVC Architecture
- Controller Layer
- Service Layer
- Model Layer
- Dependency Injection
- Constructor Injection
- Form Handling
- Request and Response
- `@Controller`
- `@GetMapping`
- `@PostMapping`

## 🏗️ Application Architecture

```text
Client
   ↓
Controller
   ↓
Service
   ↓
Model
   ↓
Response

```
### 🔗 Resources

[View Day 06](https://github.com/vikashkrsingh1003/BridgeLabz-Training/tree/Refresher-Training/Refresher-Training/Day06)

---

# 🗓️ Day 07 — ContactApp | Spring Boot + H2 Database

## 🎯 Focus Area

Building a **Contact Management REST API** using Spring Boot, Spring Data JPA, and H2 Database.

## 🛠️ Technologies Used

- Java
- Spring Boot
- Spring Web
- Spring Data JPA
- H2 Database
- Maven

## 📚 Concepts Covered

- Spring Boot
- REST API
- Spring Data JPA
- H2 Database
- Entity Mapping
- `@Entity`
- `JpaRepository`
- Dependency Injection
- Layered Architecture
- CRUD Operations

## 🏗️ Architecture

```text
Controller
    ↓
Service
    ↓
Repository
    ↓
H2 Database
```

### 🔗 Resources

[View Day 07](https://github.com/vikashkrsingh1003/BridgeLabz-Training/tree/Refresher-Training/Refresher-Training/Day07)

---

# 🗓️ Day 08 — Backend Basics | API Testing & SDLC

## 🎯 Focus Area

Introduction to **API Testing Tools** and **Software Development Life Cycle (SDLC)**.

## 🛠️ Tools & Technologies

- REST Assured
- JSON Server
- REST API
- SDLC

## 📚 Concepts Covered

- API mocking using JSON Server
- API testing using REST Assured
- REST API endpoints
- Software Development Life Cycle (SDLC)
- Backend development process

## ✨ Activities

- Continued development of the **ContactApp backend**
- Applied concepts introduced during live classes
- Created and tested mock APIs using JSON Server
- Tested ContactApp endpoints using REST Assured

## 💡 Key Learning

Learned the basics of **API testing, API mocking, and SDLC** and how they are used in backend development.

## 🔗 Resources

[View Day 08 Directory](https://github.com/vikashkrsingh1003/BridgeLabz-Training/tree/Refresher-Training/Refresher-Training/Day08)
## Summary

Built `ContactApp` using **Spring Boot, Spring Data JPA, and H2 Database** to understand how REST APIs interact with a relational database. Implemented complete **CRUD operations** using a layered architecture consisting of **Controller → Service → Repository → H2 Database**.
```
