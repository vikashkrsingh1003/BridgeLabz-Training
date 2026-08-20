
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
| Day 09 | Spring Boot Fundamentals | ContactApp Backend |
| Day 10 | Dependency Injection & H2 Database | Employee Payroll App Backend |
| Day 11 | Spring Services, Spring JPA , @Query| Employee Payroll App Backend |
| Day 12 | Spring Scopes, Logging, Maven & Postman | Employee Payroll App + Address Book App |
| Day 13 | Spring Security & JWT Authentication | Fundoo Notes App – User Management |
| Day 14 | Authorization & JPA Relationships | Fundoo Notes App – Notes Management |
| Day 15 | Pin, Archive, Trash, Search, Filter & Tags | Fundoo Notes App – Organisation Modules |

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

---

# 📅 Day 09 — Backend w/ Spring Boot | Spring Boot Fundamentals

## 🎯 Focus Area

Introduction to **Spring Boot fundamentals**, including auto-configuration, Spring Boot starters, embedded servers, Spring Controllers, and REST API development.

## 🛠️ Tools & Technologies

- Spring Boot
- Spring MVC
- REST API
- Java
- Maven
- Embedded Server

## 📚 Concepts Covered

- Spring Boot fundamentals
- Spring Boot auto-configuration
- Spring Boot starters
- Embedded server
- Spring Controller
- REST API basics
- HTTP methods and endpoints
- Application configuration

## ✨ Activities

- Bootstrapped a new Spring Boot project
- Learned Spring Boot auto-configuration and starter dependencies
- Created Spring Controllers and REST API endpoints
- Continued building the ContactApp backend using Spring Boot
- Applied Spring Boot concepts introduced during live classes

## 💡 Key Learning

Learned the fundamentals of **Spring Boot**, including auto-configuration, starters, embedded servers, controllers, and building basic REST APIs for backend applications.

## 🔗 Resources

[View Day 09 Directory](https://github.com/vikashkrsingh1003/BridgeLabz-Training/tree/Refresher-Training/Refresher-Training/Day10)

---

# 📅 Day 10 — Backend w/ Spring Boot | Dependency Injection & H2 Database

## 🎯 Focus Area

Deep dive into **Dependency Injection in Spring Boot** and integration of the **H2 in-memory database** for backend application development.

## 🛠️ Tools & Technologies

- Spring Boot
- Spring Core
- Dependency Injection
- H2 Database
- Spring Data
- Java
- Maven

## 📚 Concepts Covered

- Dependency Injection (DI)
- Inversion of Control (IoC)
- Spring Beans
- Component scanning
- `@Component`
- `@Service`
- `@Repository`
- `@Autowired`
- H2 Database
- H2 database configuration
- In-memory database integration

## ✨ Activities

- Explored Dependency Injection in Spring Boot
- Created and configured Spring Beans
- Practiced constructor-based dependency injection
- Integrated H2 Database with a Spring Boot application
- Configured H2 database properties
- Wired H2 Database into the ContactApp / Employee Payroll App backend
- Applied Spring Boot and database concepts introduced during live classes

## 💡 Key Learning

Learned how **Dependency Injection and IoC** work in Spring Boot and how to integrate and configure an **H2 in-memory database** for backend application development.

## 🔗 Resources

[View Day 10 Directory](https://github.com/vikashkrsingh1003/BridgeLabz-Training/tree/Refresher-Training/Refresher-Training/Day09)

---

# 📅 Day 11 — Backend w/ Spring Boot | Spring Services, Spring JPA & Spring JDBC

## 🎯 Focus Area

Learned how to design a **service layer** in Spring Boot and work with databases using **Spring JPA** and **Spring JDBC**.

## 🛠️ Tools & Technologies

- Spring Boot
- Spring REST API
- Spring Services
- Spring Data JPA
- Spring JDBC
- Hibernate
- H2 Database
- Java
- Maven

## 📚 Concepts Covered

- Spring REST API service-layer design
- Service layer architecture
- `@Service`
- Spring Data JPA
- JPA repositories
- Entity mapping
- `@Entity`
- `@Id`
- Repository pattern
- Spring JDBC
- `JdbcTemplate`
- Template-based data access
- Database CRUD operations

## ✨ Activities

- Designed a service layer for Spring Boot REST APIs
- Created service classes using `@Service`
- Created JPA entities and repository interfaces
- Practiced entity and database table mapping
- Explored Spring JDBC and `JdbcTemplate`
- Implemented database access using Spring JPA and Spring JDBC
- Built the Employee Payroll App backend using Spring JPA / Spring JDBC
- Applied service-layer and database concepts introduced during live classes

## 💡 Key Learning

Learned how to build a structured **Spring Boot backend using service-layer architecture**, and how to perform database operations using both **Spring Data JPA and Spring JDBC**.

## 🔗 Resources
z
[View Day 11 Directory](https://github.com/vikashkrsingh1003/BridgeLabz-Training/tree/Refresher-Training/Refresher-Training/Day11)

## Summary
Built `ContactApp` using **Spring Boot, Spring Data JPA, and H2 Database** to understand how REST APIs interact with a relational database. Implemented complete **CRUD operations** using a layered architecture consisting of **Controller → Service → Repository → H2 Database**.
```
