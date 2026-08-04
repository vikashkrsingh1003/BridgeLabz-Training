

create database healthclinicApp;

use healthclinicApp;

Create TABLE patient (
    patient_id int PRIMARY KEY AUTO_INCREMENT,
    name       VARCHAR(100) NOT NULL,
    phone      VARCHAR(15),
    dob        DATE);


create TABLE doctor (
    doctor_id  INT PRIMARY KEY AUTO_INCREMENT,
    name       VARCHAR(100) NOT NULL,
    specialty  VARCHAR(50) );


CREATE TABLE appointment (
    appointment_id    INT PRIMARY KEY AUTO_INCREMENT,
    patient_id        INT NOT NULL,
    doctor_id         INT NOT NULL,
    appointment_date  DATETIME NOT NULL,
    status             VARCHAR(20) DEFAULT 'Scheduled',
    FOREIGN KEY (patient_id) REFERENCES patient(patient_id),
    FOREIGN KEY (doctor_id)  REFERENCES doctor(doctor_id)
   );


INSERT INTO patient (name, phone, dob)
VALUES
('Rahul Sharma','9876543210','1998-05-10'),
('Priya Singh','9123456789','2000-08-15'),
('Amit Verma','9988776655','1997-12-01'),
('Neha Gupta','9871234567','1999-03-20'),
('Rohan Patel','9765432109','2001-06-25'),
('Sneha Joshi','9654321098','1998-11-18');



INSERT INTO doctor (name, specialty)
VALUES
 ('Dr. Raja Patel','Cardiology'),('Dr. Aditya Gupta','Dentist'),
('Dr. Priya Sharma','Pediatrics'),('Dr. Amit Verma','Orthopedics'),
('Dr. Neha Singh','Dermatology'),('Dr. Rahul Kumar','Neurology');


INSERT INTO appointment
(patient_id, doctor_id, appointment_date, status)
VALUES
(1,1,'2026-08-05 10:00:00','Scheduled'),
(2,2,'2026-08-05 11:00:00','Completed'),
(3,3,'2026-08-06 09:30:00','Scheduled'),
(4,4,'2026-08-06 12:00:00','Cancelled'),
(5,5,'2026-08-07 10:30:00','Completed'),
(6,6,'2026-08-07 02:00:00','Scheduled');



SELECT * FROM patient;

SELECT * FROM doctor;

SELECT * FROM appointment;

select * from doctor 
where specialty = 'Neurology';

select * from appointment 
where status = 'completed';

select * from patient
where dob > '2000-01-01';


SELECT *
FROM doctor
ORDER BY name;

SELECT *
FROM patient
LIMIT 5;

select status,COUNT(*)
FROM appointment
GROUP BY status;

SELECT *
FROM patient
WHERE name LIKE 'A%';

SELECT *
FROM appointment
WHERE appointment_date
BETWEEN '2026-08-05'
AND '2026-08-08';


SELECT *
FROM doctor
WHERE specialty
IN ('ENT','Dentist');



CREATE INDEX idx_name_specialty
ON doctor(name, specialty);



SELECT *
FROM doctor
WHERE name='Dr. Raja patel'
AND specialty='Cardiology';

DELIMITER  $$

Create procedure GetDoctor()
BegIN 
  
  Select * from doctor;
  
END$$
DELIMITER ;
