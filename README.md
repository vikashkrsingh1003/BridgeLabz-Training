# [ BridgeLabz Refresher-Training ]

##  *Training Overview*

 > This repository documents my learning journey at BridgeLabz, spanning from **July 31** to present. 
 > The training is organized into structured branches covering different aspects of Java development.

##  *Learning Milestones*

| Day |     Date    | Topic                           | Coverage                              |
|-----|-------------|---------------------------------|---------------------------------------|
|   1 | 31 Jul      |Types of Databases,  Relational Databases, Non-Relational Databases, DDL, DML|**1.** Set up MySQL environment **2.** Begin ER Diagram sketch for the Health Clinic App (patients, doctors, appointments)|
|   2 | 3 Aug       |Entity Relation Diagram principles, Table Indexing, Normalization forms|**1.**  Finalise the ER Diagram for the Health Clinic App **2.** Normalize the patient/doctor/appointment schema|

---
##  *Key Concepts Covered*
> ### DBMS
-  **Fundamentals**: Types of Databases, Relational and Non-Relational Databases, MySQL, DDL, DML, ER Diagrams, Indexing, Normalization forms(1NF, 2NF, 3NF, BCNF)
---


## 🔗 *Quick Links*

> ### DBMS :
- 📌 [Day-1](https://github.com/vikashkrsingh1003/BridgeLabz-Training/tree/Refresher-Training/Refresher-Training/Day01)  
- 📌 [Day-2](https://github.com/vikashkrsingh1003/BridgeLabz-Training/tree/Refresher-Training/Refresher-Training/Day02)  

  ### Day 3: Joins, Triggers, and Stored Procedures
* **Focus Area:** Advanced SQL operations — mastering joins, automating workflows with triggers, and encapsulating logic using stored procedures.  
* **Code & Resources:** [View Day 3 Directory]((https://github.com/vikashkrsingh1003/BridgeLabz-Training/tree/Refresher-Training/Refresher-Training/Day03))

#### Core Concepts Covered

##### 1. SQL Joins
- **INNER JOIN:** Match patients with confirmed appointments  
- **LEFT JOIN:** Show all doctors, even those without appointments  
- **RIGHT JOIN:** Show all patients, even those without appointments  

##### 2. Triggers
- **AFTER INSERT Trigger:** Update doctor statistics when a new appointment is booked  
- **AFTER UPDATE Trigger:** Log patient information changes into a `patient_log` table  
- **AFTER DELETE Trigger:** Decrement doctor patient counts when appointments are cancelled  

Triggers ensure **real-time analytics**, **data integrity**, and **automation**.

##### 3. Stored Procedures
- **AddDoctor Procedure:** Insert new doctor records with validated parameters  
- **AddPatient Procedure:** Add patients while enforcing mandatory fields (name, gender)  
- **BookAppointment Procedure:** Book appointments linking doctor and patient IDs, with default status as `confirmed`  

Stored procedures simplify integration with Java CLI applications by providing a clean, callable interface for database operations.

---
# Day 4: HealthClinic CLI Application (Java + JDBC)

## Focus Area
Building a command-line interface (CLI) application to interact with the HealthClinic database using JDBC.

## Code & Resources
[View Day 4 Directory](https://github.com/vikashkrsingh1003/BridgeLabz-Training/tree/Refresher-Training/Day04)

---

## Core Concepts Covered
- **JDBC Workflow:** Driver loading, connection establishment, statement execution, result processing, and resource management  
- **POJO Classes:** Mapping database rows into Java objects for clean data handling  
- **PreparedStatement:** Parameterized queries to prevent SQL injection  
- **CLI Integration:** Menu-driven interface for CRUD operations on doctors, patients, and appointments  

## Application Features
- Add new doctors and patients  
- Book, update, and cancel appointments  
- View patient history and doctor schedules  


# Day 5: Servlets, Tomcat Server, and Spring Core

## Focus Area

Understanding Java Servlets and the Tomcat server, followed by exploring the fundamentals of the Spring Core framework and its dependency injection features.

## Code & Resources

[View Day 5 Directory](https://github.com/vikashkrsingh1003/BridgeLabz-Training/tree/Refresher-Training/Day05)

---

## Core Concepts Covered

### 1. Java Servlets

- Understanding the role of **Servlets** in Java web applications
- Exploring the **Servlet lifecycle**
- Handling HTTP requests and responses
- Working with `doGet()` and `doPost()` methods
- Understanding request parameters and response handling

### 2. Apache Tomcat Server

- Understanding Tomcat as a **Servlet container**
- Configuring and running web applications using Tomcat
- Deploying servlet-based applications
- Understanding how Tomcat receives and processes HTTP requests

### 3. Spring Core

- Introduction to the **Spring Framework**
- Understanding **Inversion of Control (IoC)**
- Exploring **Dependency Injection (DI)**
- Creating Spring beans
- Understanding Spring configuration and bean management
- Exploring annotation-based configuration

## Practical Work

- Explored Java Servlets and their lifecycle
- Set up and worked with the Tomcat server
- Created basic servlet-based learning projects
- Built small projects to understand Spring Core concepts
- Practiced dependency injection and Spring bean configuration

## Summary

Day 5 focused on moving from traditional Java web development using **Servlets and Tomcat** toward modern application development with **Spring Core**, establishing a foundation for learning Spring MVC.

---

# Day 6: Spring MVC Fundamentals

## Focus Area

Understanding the fundamentals of **Spring MVC** and building a simple web application using the Model-View-Controller architecture.

## Code & Resources

[View Day 6 Directory](https://github.com/vikashkrsingh1003/BridgeLabz-Training/tree/Refresher-Training/Day06)

---

## Core Concepts Covered

### 1. Spring MVC Architecture

- Understanding the **Model-View-Controller (MVC)** design pattern
- Understanding the responsibilities of Model, View, and Controller
- Exploring how requests flow through a Spring MVC application

### 2. Controllers

- Creating Spring MVC controllers
- Handling HTTP requests using controller methods
- Using request mappings to map URLs to specific controller methods
- Returning responses from controller methods

### 3. Views and Request Handling

- Understanding how controllers interact with views
- Passing data from controllers to views
- Handling user requests and generating appropriate responses

### 4. Spring MVC Application Flow

- Client sends an HTTP request
- Request is handled by the Spring MVC framework
- Controller processes the request
- Required data is prepared
- Appropriate response/view is returned to the client

## Practical Work

- Explored the fundamentals of **Spring MVC**
- Created a basic Spring MVC project
- Implemented controllers and request mappings
- Built a **Demo Greetings App**
- Practiced handling web requests and returning responses

## Summary

Day 6 focused on understanding the **Spring MVC architecture** and applying its core concepts by building a simple **Demo Greetings App**. This provided a foundation for developing structured Java web applications using Spring.


## Summary
This project demonstrates **end-to-end integration**:  
**SQL schema design → JDBC connection → Java POJO mapping → CLI interaction**
---
