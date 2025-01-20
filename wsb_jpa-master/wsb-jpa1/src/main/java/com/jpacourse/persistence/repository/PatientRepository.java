package com.jpacourse.persistence.repository;

import com.jpacourse.persistence.entity.PatientEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PatientRepository extends JpaRepository<PatientEntity, Long> {

    @Query("SELECT p FROM PatientEntity p JOIN p.leki l WHERE l.name = :medicationName")
    List<PatientEntity> findPatientsByLek(String medicationName);
}
