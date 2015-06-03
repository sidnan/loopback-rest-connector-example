drop view if exists MEDICATION;
drop table if exists DOSAGE;
drop table if exists PRESCRIPTION;
drop table if exists DRUG;
drop table if exists PATIENT;
drop table if exists DOCTOR;


-- PATIENT 
CREATE TABLE PATIENT (
  id INTEGER NOT NULL,
  first_name varchar(45) NOT NULL,
  last_name varchar(45) NOT NULL,
  PRIMARY KEY (id)
);

-- DOCTOR
CREATE TABLE DOCTOR (
  id INTEGER NOT NULL,
  first_name varchar(45) NOT NULL,
  last_name varchar(45) NOT NULL,
  PRIMARY KEY (id)
);

-- DRUG
CREATE TABLE DRUG (
  id INTEGER NOT NULL,
  drug_name varchar(45) NOT NULL,
  drug_company varchar(45) NOT NULL,
  PRIMARY KEY (id)
);

-- PRESCRIPTION
CREATE TABLE PRESCRIPTION (
  id INTEGER NOT NULL,
  prescription_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
  patient_id INTEGER NOT NULL,
  doctor_id INTEGER NOT NULL,
  PRIMARY KEY (id),
  FOREIGN KEY (patient_id) REFERENCES PATIENT(id),
  FOREIGN KEY (doctor_id) REFERENCES DOCTOR(id)
);

-- DOSAGE
CREATE TABLE DOSAGE (
  id INTEGER NOT NULL,
  prescription_id INTEGER NOT NULL,
  drug_id INTEGER NOT NULL,
  start_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP, 
  days INTEGER NOT NULL,
  quantity INTEGER NOT NULL,
  PRIMARY KEY (id),
  FOREIGN KEY (prescription_id) REFERENCES PRESCRIPTION(id),
  FOREIGN KEY (drug_id) REFERENCES DRUG(id)
);


-- MEDICATION VIEW
-- For all the patients, Only the medication patient is on. i.e. only if the start date and no. of days the drug must be consumed must be greater than or equal to today
-- otherwise the patient is not under medication
CREATE VIEW MEDICATION AS (
  SELECT d.id id, p.patient_id patient_id, dg.drug_name drug_name, dg.drug_company drug_company, d.start_date start_date, d.days days
  FROM DOSAGE d, PRESCRIPTION p, DRUG dg
  WHERE 
  (d.start_date + d.days DAY) >= CURRENT_TIMESTAMP
  AND d.prescription_id = p.id
  AND d.drug_id = dg.id
);