
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
| Day 16 | JMS & Redis Caching | Fundoo Notes App – Reminder & Notification, Token Caching |
| Day 17 | RabbitMQ & Spring Batch | Fundoo Notes App – File Attachment Module |
| Day 18 | REST API Patterns, Global Exception Handling, AOP & Spring Cloud | Fundoo Notes App – Backend Consolidation |
| Day 19 | Monolith vs Microservices & Spring Boot Microservices | Fundoo Notes App – User Management & Authentication Microservices |
| Day 20 | Service Registry (Eureka) & Microservices Completion | Fundoo Notes App – Complete Microservices Architecture |

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

---

# 📅 Day 12 — Spring Scopes, Logging, Maven & Postman

## 🎯 Focus Area

Working with advanced Spring Boot backend concepts including **Spring Bean Scopes, Logging, Maven, and Postman**.

## 📚 Concepts Covered

### 🌱 Spring Bean Scopes

Understanding different Spring Bean scopes:

- `singleton` - One shared instance per Spring container
- `prototype` - A new instance whenever the bean is requested
- `request` - One instance per HTTP request
- `session` - One instance per HTTP session

### 📝 Logging in Spring Boot

Implemented logging in Spring Boot applications:

- Tracking application execution
- Debugging backend issues
- Monitoring application events
- Recording important information

### 📦 Maven

Worked with Maven for:

- Project build and lifecycle management
- Dependency management
- Running Spring Boot applications
- Managing dependencies using `pom.xml`

### 🧪 Postman

Used Postman for API testing:

- Creating API requests
- Testing CRUD endpoints
- Validating request and response data
- Creating and using Postman collections

## 💡 Key Learning

Learned how Spring Bean Scopes control object lifecycles, how logging helps debug and monitor applications, how Maven manages dependencies and builds, and how Postman can be used to test REST APIs.

## 🚀 Project Work

- Complete **Employee Payroll App** backend
- Complete **Address Book App** backend
- Test all endpoints using **Postman collections**

## 🔗 Resources

[View Day 12 Directory](https://github.com/vikashkrsingh1003/BridgeLabz-Training/tree/Refresher-Training/Refresher-Training/Day12)

---

# 📅 Day 13 — Spring Security & JWT Authentication

## 🎯 Focus Area

Working with **Spring Security** and **JWT (JSON Web Token)** authentication to secure Spring Boot applications.

## 📚 Concepts Covered

### 🔐 Spring Security

Recapped Spring Boot fundamentals and learned Spring Security concepts:

- Authentication fundamentals
- Securing REST APIs
- Security filters
- Protecting backend resources
- Configuring application security

### 🎟️ JWT Authentication

Implemented token-based authentication using **JWT**:

- User login authentication
- JWT token generation
- Token-based request verification
- Securing protected API endpoints
- Handling authenticated users

## 💡 Key Learning

Learned how Spring Security protects backend applications and how JWT provides a stateless, token-based authentication mechanism for securing REST APIs.

## 🚀 Project Work

### Fundoo Notes App — User Management Module

Implemented:

- User registration
- User login
- Password recovery
- Authentication-related APIs

## 🔗 Resources

[View Day 13 Directory](https://github.com/vikashkrsingh1003/BridgeLabz-Training/tree/Refresher-Training/Refresher-Training/Day13)

---

# 📅 Day 14 — Authorization & JPA for Notes Management

## 🎯 Focus Area

Working with **Authorization** and **JPA entity relationships** to secure and manage notes in the Fundoo Notes application.

## 📚 Concepts Covered

### 🔐 Authentication vs Authorization

Understanding the difference between authentication and authorization:

- **Authentication** - Verifies who the user is
- **Authorization** - Determines what an authenticated user is allowed to access
- Secure token-based verification
- Protecting authorized resources

### 🗃️ JPA Deep Dive

Worked with JPA and entity relationships:

- Entity mapping
- User and Notes relationships
- One-to-many relationships
- Many-to-one relationships
- Repository-based database operations
- Managing related entities using JPA

## 💡 Key Learning

Learned how authentication and authorization work together to secure REST APIs and how JPA relationships can be used to connect users with their notes.

## 🚀 Project Work

### Fundoo Notes App

#### 🔐 Authentication & Authorization Module

- Secure protected APIs
- Validate authenticated users
- Apply authorization rules

#### 📝 Notes Management Module

- Create notes
- Delete notes
- Associate notes with users
- Manage notes using JPA relationships

## 🔗 Resources

[View Day 14 Directory](https://github.com/vikashkrsingh1003/BridgeLabz-Training/tree/Refresher-Training/Refresher-Training/Day14)

---

# 📅 Day 15 — Organisation Modules: Pin, Archive, Trash, Search & Tags

## 🎯 Focus Area

Working with organisation-oriented REST APIs and implementing **Pin, Archive, Trash, Search, Filter, and Tags/Labels** functionality in the Fundoo Notes application.

## 📚 Concepts Covered

### 📌 Organisation-Oriented REST Endpoints

Designed REST endpoints for managing the state of notes:

- Pin and unpin notes
- Archive and unarchive notes
- Move notes to trash
- Restore notes from trash
- Apply state-based filtering

### 🔎 Search & Filter Query Design

Implemented query-based note discovery:

- Search notes by relevant content
- Filter notes based on state
- Design REST query parameters
- Combine search and filtering requirements

### 🏷️ Tags / Labels

Worked with tags and labels to organize notes:

- Create and manage labels
- Associate labels with notes
- Filter notes using labels
- Improve note organization

## 💡 Key Learning

Learned how to design state-based REST APIs and query-driven filtering for a real-world notes application. Also understood how Pin, Archive, Trash, Search, and Tags work together to provide efficient note organization.

## 🚀 Project Work

### Fundoo Notes App

Implemented the following modules:

- 📌 **Pin / Unpin Module**
- 📦 **Archive / Unarchive Module**
- 🗑️ **Trash / Restore Module**
- 🔎 **Search & Filter Module**
- 🏷️ **Tags / Labels Management Module**

## 🔗 Resources

[View Day 15 Directory](https://github.com/vikashkrsingh1003/BridgeLabz-Training/tree/Refresher-Training/Refresher-Training/Day15)

---

# 📅 Day 16 — JMS (Asynchronous Messaging) & Redis Caching

## 🎯 Focus Area

Working with asynchronous messaging using **JMS (Java Message Service)** and improving application performance using **Redis caching**.

## 📚 Concepts Covered

### 📩 JMS (Java Message Service)

Implemented asynchronous, non-blocking background processing using JMS.

- JMS (Java Message Service) fundamentals
- Asynchronous messaging
- Non-blocking background processing
- Message producers and consumers
- Background processing using JMS

### ⚡ Redis Caching

Implemented Redis-based token caching to improve authorization performance.

- Redis fundamentals
- Token caching
- Storing authentication tokens in Redis
- Retrieving cached tokens
- Improving authorization performance using caching

## 💡 Key Learning

Learned how JMS can be used for asynchronous and non-blocking background processing and how Redis caching can improve authentication and authorization performance.

## 🔗 Resources

[View Day 16 Directory](https://github.com/vikashkrsingh1003/BridgeLabz-Training/tree/Refresher-Training/Refresher-Training/Day16)

---

# 📅 Day 17 — RabbitMQ & Spring Batch (Excel)

## 🎯 Focus Area

Working with **RabbitMQ** for message queuing and **Spring Batch** for batch processing and Excel import/export operations.

## 📚 Concepts Covered

### 🐇 RabbitMQ

Explored RabbitMQ fundamentals for asynchronous message queuing and background processing.

- RabbitMQ fundamentals
- Message queues
- Producers and consumers
- Sending messages through queues
- Receiving and processing messages
- Asynchronous/background operations

### 📊 Spring Batch & Excel

Worked with Spring Batch for processing large amounts of data and Excel import/export operations.

- Spring Batch fundamentals
- Batch processing
- Reading Excel data
- Writing Excel data
- Excel import/export
- Processing data in batches

## 💡 Key Learning

Learned how RabbitMQ can be used for smooth asynchronous communication and how Spring Batch can be used for efficient batch processing and Excel import/export operations.

## 🔗 Resources

[View Day 17 Directory](https://github.com/vikashkrsingh1003/BridgeLabz-Training/tree/Refresher-Training/Refresher-Training/Day17)

---

# 📅 Day 18 — REST API Patterns, Global Exception Handling, AOP & Spring Cloud

## 🎯 Focus Area

Applying advanced Spring Boot concepts including **REST API design patterns, global exception handling, AOP (Aspect-Oriented Programming), and Spring Cloud**.

## 📚 Concepts Covered

### 🌐 REST API Patterns

Applied REST API design patterns to build clean and maintainable APIs.

- REST API design principles
- HTTP methods
- Request and response handling
- RESTful endpoint design
- Spring Scopes revisited

### 🔄 Mapping Methods

Worked with mapping between DTOs and Entities.

- DTO (Data Transfer Object)
- Entity
- DTO → Entity mapping
- Entity → DTO mapping
- Separating API models from database models

### ⚠️ Global Exception Handling

Implemented centralized exception handling for Spring Boot applications.

- Global exception handling
- `@ControllerAdvice`
- `@ExceptionHandler`
- Custom exceptions
- Consistent error responses

### 🧩 AOP (Aspect-Oriented Programming)

Explored AOP for handling cross-cutting concerns.

- Aspect-Oriented Programming
- Logging
- Cross-cutting concerns
- Separation of business logic and supporting concerns
- Applying logging using AOP

### ☁️ Spring Cloud

Introduction to Spring Cloud and its role in building distributed applications.

- Spring Cloud fundamentals
- Microservices support
- Distributed application concepts
- Service-to-service communication concepts

## 💡 Key Learning

Learned how REST API patterns, DTO mapping, global exception handling, AOP, and Spring Cloud can be combined to create a cleaner, more maintainable, and production-ready backend architecture.

## 🔗 Resources

[View Day 18 Directory](https://github.com/vikashkrsingh1003/BridgeLabz-Training/tree/Refresher-Training/Refresher-Training/Day18)

---

# 📅 Day 19 — Monolith vs Microservices & Spring Boot Microservices

## 🎯 Focus Area

Understanding **Monolithic and Microservices architectures** and beginning the decomposition of the Fundoo Notes application into independent microservices.

## 📚 Concepts Covered

### 🏗️ Monolith vs Microservices

Compared monolithic architecture with microservices architecture.

- Monolithic architecture
- Microservices architecture
- Advantages and disadvantages of monoliths
- Advantages and disadvantages of microservices
- Architecture trade-offs
- When to use monolithic architecture
- When to use microservices architecture

### 🔧 Spring Boot Microservices

Learned the project structure and fundamentals required to build Spring Boot microservices.

- Spring Boot microservice structure
- Independent services
- Service responsibilities
- Inter-service communication
- Service separation
- Independent deployment concepts

### 🚪 API Gateway

Explored the purpose of an API Gateway in a microservices architecture.

- API Gateway fundamentals
- Request routing
- Centralized entry point
- Routing requests to appropriate services
- Microservices communication through gateway

### 📝 Fundoo Notes Microservices

Started decomposing the Fundoo Notes application into microservices.

Initial services included:

- User Management
- Authentication

## 💡 Key Learning

Learned the differences between monolithic and microservices architectures and started converting the Fundoo Notes application into a microservices-based architecture with independent services and API Gateway routing.

## 🔗 Resources

[View Day 19 Directory](https://github.com/vikashkrsingh1003/BridgeLabz-Training/tree/Refresher-Training/Refresher-Training/Day19)

---

# 📅 Day 20 — Service Registry (Eureka) & Microservices Completion

## 🎯 Focus Area

Working with **Service Registry using Eureka** and completing the microservices architecture for the Fundoo Notes application.

## 📚 Concepts Covered

### 🔎 Service Registry with Eureka

Implemented service discovery using Eureka.

- Service Registry
- Eureka Server
- Eureka Client
- Service discovery
- Service registration
- Registering microservices with Eureka
- Discovering services dynamically

### 🧩 Microservices Architecture

Consolidated the concepts learned throughout the microservices module.

- Microservices architecture
- Independent services
- Inter-service communication
- Service discovery
- API Gateway
- Distributed application structure
- Communication between services

### 📝 Fundoo Notes Microservices

Completed the major microservices of the Fundoo Notes application.

The application was divided into:

- User Management
- Authentication & Authorization
- Notes Management
- Search & Filter
- Tags / Labels Management
- Reminder & Notification

### 🚀 Final Microservices-Based Application

Completed the Fundoo Notes application using a microservices-based architecture.

- Service Registry using Eureka
- Independent microservices
- Authentication and authorization
- Notes management
- Search and filtering
- Tags and labels
- Reminder and notification
- Inter-service communication

## 💡 Key Learning

Learned how Eureka provides service discovery in a microservices architecture and consolidated the complete microservices concepts by building the Fundoo Notes application as a distributed, microservices-based system.

## 🔗 Resources

[View Day 20 Directory](https://github.com/vikashkrsingh1003/BridgeLabz-Training/tree/Refresher-Training/Refresher-Training/Day20)

```
