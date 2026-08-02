CREATE DATABASE HealthClinicDB;

show databases;

use HealthClinicDB;


create table Docter (
  
DocterId int PRIMARY KEY,
FirstName varchar(50) NOT NUll,
LastName varchar(50) NOT NUll,
Specialization VARCHAR(100) NOT NULL,
Phone VARCHAR(15) UNIQUE
);

 Alter table Docter rename to doctor ;
 
 
ALTER TABLE Doctor ADD Email VARCHAR(100) UNIQUE;

show tables;

desc doctor;

INSERT INTO Doctor (DocterId, FirstName, LastName, Specialization, Phone, Email)
VALUES
(1, 'Raja', 'Patel', 'Cardiology', '7321079025', 'raja.patel@healthclinic.com'),
(2, 'Aditya', 'Gupta', 'Dentist', '9546354171', 'aditya.gupta@healthclinic.com'),
(3, 'Priya', 'Sharma', 'Pediatrics', '9876543210', 'priya.sharma@healthclinic.com'),
(4, 'Amit', 'Verma', 'Orthopedics', '9123456780', 'amit.verma@healthclinic.com'),
(5, 'Neha', 'Singh', 'Dermatology', '9988776655', 'neha.singh@healthclinic.com'),
(6, 'Rahul', 'Kumar', 'Neurology', '9871234567', 'rahul.kumar@healthclinic.com'),
(7, 'Sneha', 'Joshi', 'Gynecology', '9765432109', 'sneha.joshi@healthclinic.com'),
(8, 'Vikram', 'Reddy', 'Ophthalmology', '9654321098', 'vikram.reddy@healthclinic.com'),
(9, 'Anjali', 'Mehta', 'ENT', '9543210987', 'anjali.mehta@healthclinic.com'),
(10, 'Karan', 'Malhotra', 'General Medicine', '9432109876', 'karan.malhotra@healthclinic.com');


select * from doctor;


SELECT DocterID, FirstName, LastName, Specialization
FROM Doctor
WHERE Specialization = 'Cardiology';


UPDATE Doctor SET LastName = 'singh' WHERE DocterID = 1;


DELETE FROM Doctor WHERE DocterID = 6;
