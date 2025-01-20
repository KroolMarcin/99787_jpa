package com.jpacourse;

import com.jpacourse.persistence.entity.PatientEntity;
import com.jpacourse.persistence.repository.PatientRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class LekiTest {

    @Autowired
    private PatientRepository patientRepository;

    @Test
    public void testFindPatientsByLeki() {
        List<PatientEntity> aspirinPatients = patientRepository.findPatientsByLek("Aspirin");
        assertTrue(aspirinPatients.size() > 0, "No patients found who took Aspirin");

        List<PatientEntity> ibuprofenPatients = patientRepository.findPatientsByLek("Ibuprofen");
        assertTrue(ibuprofenPatients.size() > 0, "No patients found who took Ibuprofen");

        List<PatientEntity> paracetamolPatients = patientRepository.findPatientsByLek("Paracetamol");
        assertTrue(paracetamolPatients.size() > 0, "No patients found who took Paracetamol");
        }
}
