-- Mock patient data
INSERT INTO PATIENT(id, first_name, last_name) VALUES (1,'John','Doe');
INSERT INTO PATIENT(id, first_name, last_name) VALUES (2,'John','Smith');


-- Mock dcotor data
INSERT INTO DOCTOR(id, first_name, last_name) VALUES (1,'Bob','Smith');
INSERT INTO DOCTOR(id, first_name, last_name) VALUES (2,'Jane','Doe');


-- Mock drug data
INSERT INTO DRUG(id, drug_name, drug_company) VALUES (1,'Aspirin1','Acme1');
INSERT INTO DRUG(id, drug_name, drug_company) VALUES (2,'Advil2','Ace1');
INSERT INTO DRUG(id, drug_name, drug_company) VALUES (3,'Advil3','Acme2');
INSERT INTO DRUG(id, drug_name, drug_company) VALUES (4,'Advil4','Ace2');
INSERT INTO DRUG(id, drug_name, drug_company) VALUES (5,'Aspirin5','Acme1');
INSERT INTO DRUG(id, drug_name, drug_company) VALUES (6,'Advil6','Ace1');
INSERT INTO DRUG(id, drug_name, drug_company) VALUES (7,'Advil7','Acme2');
INSERT INTO DRUG(id, drug_name, drug_company) VALUES (8,'Advil8','Ace2');
INSERT INTO DRUG(id, drug_name, drug_company) VALUES (9,'Aspirin9','Acme1');
INSERT INTO DRUG(id, drug_name, drug_company) VALUES (10,'Advil10','Ace1');
INSERT INTO DRUG(id, drug_name, drug_company) VALUES (11,'Advil11','Acme2');
INSERT INTO DRUG(id, drug_name, drug_company) VALUES (12,'Advil12','Ace2');


-- Mock prescription data
INSERT INTO PRESCRIPTION(id, prescription_date, patient_id, doctor_id) VALUES (1,'2015-02-02 16:42:58.729',1,1);
INSERT INTO PRESCRIPTION(id, prescription_date, patient_id, doctor_id) VALUES (2,'2015-01-02 16:42:58.729',1,2);
INSERT INTO PRESCRIPTION(id, prescription_date, patient_id, doctor_id) VALUES (3,'2015-02-22 16:42:58.729',2,1);
INSERT INTO PRESCRIPTION(id, prescription_date, patient_id, doctor_id) VALUES (4,'2015-01-22 16:42:58.729',2,2);


-- Mock dosage data
INSERT INTO DOSAGE(id, prescription_id, drug_id, start_date, days, quantity) VALUES (1, 1, 1, '2015-02-02 16:42:58.729', 120, 120);
INSERT INTO DOSAGE(id, prescription_id, drug_id, start_date, days, quantity) VALUES (2, 2, 2, '2015-02-02 16:42:58.729', 120, 120);
INSERT INTO DOSAGE(id, prescription_id, drug_id, start_date, days, quantity) VALUES (3, 3, 3, '2015-02-02 16:42:58.729', 120, 120);
INSERT INTO DOSAGE(id, prescription_id, drug_id, start_date, days, quantity) VALUES (4, 4, 4, '2015-02-02 16:42:58.729', 120, 120);
INSERT INTO DOSAGE(id, prescription_id, drug_id, start_date, days, quantity) VALUES (5, 1, 5, '2015-02-02 16:42:58.729', 120, 120);
INSERT INTO DOSAGE(id, prescription_id, drug_id, start_date, days, quantity) VALUES (6, 2, 6, '2015-02-02 16:42:58.729', 120, 120);
INSERT INTO DOSAGE(id, prescription_id, drug_id, start_date, days, quantity) VALUES (7, 3, 7, '2015-02-02 16:42:58.729', 120, 120);
INSERT INTO DOSAGE(id, prescription_id, drug_id, start_date, days, quantity) VALUES (8, 4, 8, '2015-02-02 16:42:58.729', 120, 120);
INSERT INTO DOSAGE(id, prescription_id, drug_id, start_date, days, quantity) VALUES (9, 1, 9, '2015-02-02 16:42:58.729', 120, 120);
INSERT INTO DOSAGE(id, prescription_id, drug_id, start_date, days, quantity) VALUES (10, 2, 10, '2015-02-02 16:42:58.729', 120, 120);
INSERT INTO DOSAGE(id, prescription_id, drug_id, start_date, days, quantity) VALUES (11, 3, 11, '2015-02-02 16:42:58.729', 120, 120);
INSERT INTO DOSAGE(id, prescription_id, drug_id, start_date, days, quantity) VALUES (12, 4, 12, '2015-02-02 16:42:58.729', 120, 120);
INSERT INTO DOSAGE(id, prescription_id, drug_id, start_date, days, quantity) VALUES (13, 4, 11, '2015-02-02 16:42:58.729', 120, 120);
INSERT INTO DOSAGE(id, prescription_id, drug_id, start_date, days, quantity) VALUES (14, 3, 10, '2015-02-02 16:42:58.729', 120, 120);
INSERT INTO DOSAGE(id, prescription_id, drug_id, start_date, days, quantity) VALUES (15, 2, 9, '2015-02-02 16:42:58.729', 120, 120);
INSERT INTO DOSAGE(id, prescription_id, drug_id, start_date, days, quantity) VALUES (16, 1, 8, '2015-02-02 16:42:58.729', 120, 120);
INSERT INTO DOSAGE(id, prescription_id, drug_id, start_date, days, quantity) VALUES (17, 4, 7, '2015-02-02 16:42:58.729', 120, 120);
INSERT INTO DOSAGE(id, prescription_id, drug_id, start_date, days, quantity) VALUES (18, 3, 6, '2015-02-02 16:42:58.729', 120, 120);
INSERT INTO DOSAGE(id, prescription_id, drug_id, start_date, days, quantity) VALUES (19, 2, 5, '2015-02-02 16:42:58.729', 120, 120);
INSERT INTO DOSAGE(id, prescription_id, drug_id, start_date, days, quantity) VALUES (20, 1, 4, '2015-02-02 16:42:58.729', 120, 120);
INSERT INTO DOSAGE(id, prescription_id, drug_id, start_date, days, quantity) VALUES (21, 4, 3, '2015-02-02 16:42:58.729', 120, 120);
INSERT INTO DOSAGE(id, prescription_id, drug_id, start_date, days, quantity) VALUES (22, 3, 2, '2015-02-02 16:42:58.729', 120, 120);
INSERT INTO DOSAGE(id, prescription_id, drug_id, start_date, days, quantity) VALUES (23, 2, 1, '2015-02-02 16:42:58.729', 120, 120);
INSERT INTO DOSAGE(id, prescription_id, drug_id, start_date, days, quantity) VALUES (24, 1, 2, '2015-02-02 16:42:58.729', 120, 120);
INSERT INTO DOSAGE(id, prescription_id, drug_id, start_date, days, quantity) VALUES (25, 1, 3, '2015-02-02 16:42:58.729', 120, 120);
INSERT INTO DOSAGE(id, prescription_id, drug_id, start_date, days, quantity) VALUES (26, 1, 6, '2015-02-02 16:42:58.729', 120, 120);
INSERT INTO DOSAGE(id, prescription_id, drug_id, start_date, days, quantity) VALUES (27, 1, 7, '2015-02-02 16:42:58.729', 120, 120);
INSERT INTO DOSAGE(id, prescription_id, drug_id, start_date, days, quantity) VALUES (28, 1, 10, '2015-02-02 16:42:58.729', 120, 120);
INSERT INTO DOSAGE(id, prescription_id, drug_id, start_date, days, quantity) VALUES (29, 1, 11, '2015-02-02 16:42:58.729', 120, 120);
INSERT INTO DOSAGE(id, prescription_id, drug_id, start_date, days, quantity) VALUES (30, 1, 12, '2015-02-02 16:42:58.729', 120, 120);