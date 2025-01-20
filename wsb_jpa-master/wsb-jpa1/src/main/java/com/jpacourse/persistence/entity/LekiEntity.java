package com.jpacourse.persistence.entity;

import javax.persistence.*;

@Entity
@Table(name = "LEKI")
public class LekiEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @ManyToOne
    @JoinColumn(name = "patient_id")
    private PatientEntity patient;

    public LekiEntity() {}

    public LekiEntity(String name, PatientEntity patient) {
        this.name = name;
        this.patient = patient;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PatientEntity getPatient() {
        return patient;
    }

    public void setPatient(PatientEntity patient) {
        this.patient = patient;
    }
}
