

create database healthclinicApp;

use healthclinicApp;

show tables;

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

CREATE TABLE visit_history(
    visit_id INT PRIMARY KEY AUTO_INCREMENT,
    patient_id INT NOT NULL,
    doctor_id INT NOT NULL,
    diagnosis VARCHAR(200),
    prescription VARCHAR(200),
    visit_date DATE,
    FOREIGN KEY(patient_id) REFERENCES patient(patient_id),
    FOREIGN KEY(doctor_id) REFERENCES doctor(doctor_id)
);

INSERT INTO visit_history(patient_id,doctor_id,diagnosis,prescription,visit_date)
VALUES
(1,1,'High Blood Pressure','Medicine A','2026-08-05'),
(2,2,'Tooth Pain','Pain Killer','2026-08-05'),
(3,3,'Fever','Paracetamol','2026-08-06');


CREATE TABLE billing(
    bill_id INT PRIMARY KEY AUTO_INCREMENT,
    patient_id INT NOT NULL,
    amount DECIMAL(10,2),
    payment_status VARCHAR(20),
    bill_date DATE,
    FOREIGN KEY(patient_id) REFERENCES patient(patient_id)
);

INSERT INTO billing(patient_id,amount,payment_status,bill_date)
VALUES
(1,1500,'Paid','2026-08-05'),
(2,800,'Pending','2026-08-05'),
(3,1200,'Paid','2026-08-06');

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

-- store procedure 
DELIMITER //

CREATE PROCEDURE AddDoctor(
    IN p_name VARCHAR(100),
    IN p_specialty VARCHAR(100)
)
BEGIN
    INSERT INTO doctor(name, specialty)
    VALUES (p_name, p_specialty);
END //

DELIMITER ;

-- store procedure out 

DROP PROCEDURE IF EXISTS GetDoctorCount;

DELIMITER //

CREATE PROCEDURE GetDoctorCount(
    OUT totalDoctors INT
)
BEGIN
    SELECT COUNT(*) INTO totalDoctors
    FROM doctor;
END //

DELIMITER ;


DELIMITER //

CREATE PROCEDURE GetDoctorBySpecialty(
    IN p_specialty VARCHAR(100)
)
BEGIN
    SELECT *
    FROM doctor
    WHERE specialty = p_specialty;
END //

DELIMITER ;

CALL GetDoctorBySpecialty('neuro');


-- Shows only patients who have appointments.

SELECT
    p.patient_id,
    p.name AS patient_name,
    d.name AS doctor_name,
    d.specialty,
    a.appointment_date,
    a.status
FROM patient p
INNER JOIN appointment a
ON p.patient_id = a.patient_id
INNER JOIN doctor d
ON a.doctor_id = d.doctor_id;

-- Shows all patients, even if they don't have appointments.

SELECT
    p.patient_id,
    p.name,
    a.appointment_date,
    a.status
FROM patient p
LEFT JOIN appointment a
ON p.patient_id = a.patient_id;


-- Shows all doctors, even if no appointment exists.

SELECT
    d.doctor_id,
    d.name AS doctor_name,
    p.name AS patient_name,
    a.appointment_date
FROM patient p
RIGHT JOIN appointment a
ON p.patient_id = a.patient_id
RIGHT JOIN doctor d
ON a.doctor_id = d.doctor_id;


-- Patient + Visit History + Doctor
SELECT
    p.name AS patient_name,
    d.name AS doctor_name,
    vh.diagnosis,
    vh.prescription,
    vh.visit_date
FROM visit_history vh
INNER JOIN patient p
ON vh.patient_id = p.patient_id
INNER JOIN doctor d
ON vh.doctor_id = d.doctor_id;


-- Patient + Billing
SELECT
    p.name,
    b.amount,
    b.payment_status,
    b.bill_date
FROM patient p
INNER JOIN billing b
ON p.patient_id = b.patient_id;
