INSERT INTO address (id, address_line1, address_line2, city, postal_code)
VALUES 
(1, 'Street 1', 'Apartment 2', 'City A', '11111'),
(2, 'Street 3', 'Apartment 4', 'City B', '22222');

INSERT INTO doctor (id, first_name, last_name, telephone_number, email, doctor_number, specialization, address_id)
VALUES 
(1, 'Jacek', 'Jawor', '123456789', 'jacek.jawor@example.com', 'DOC123', 'SURGEON', 1);

INSERT INTO patient (id, first_name, last_name, telephone_number, email, patient_number, date_of_birth, address_id)
VALUES 
(1, 'Michu', 'Pichu', '987654321', 'michu.pichu@example.com', 'PAT456', '1990-01-01', 2);

INSERT INTO medical_treatment (id, description, type)
VALUES 
(1, 'Ultrasound examination', 'USG'),
(2, 'Electrocardiogram', 'EKG');

INSERT INTO visit (id, description, time, doctor_id, patient_id)
VALUES 
(1, 'General consultation', '2023-12-01T10:00:00', 1, 1);

INSERT INTO visit_treatments (visit_id, treatment_id)
VALUES 
(1, 1),
(1, 2);
