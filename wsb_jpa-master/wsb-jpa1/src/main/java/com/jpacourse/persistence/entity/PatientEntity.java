package com.jpacourse.persistence.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "PATIENT")
public class PatientEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String firstName;

    @Column(nullable = false)
    private String lastName;

    @OneToMany(mappedBy = "patient")
    private List<LekiEntity> leki;

    public PatientEntity() {}

    public PatientEntity(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public List<LekiEntity> getLeki() {
        return leki;
    }

    public void setLeki(List<LekiEntity> leki) {
        this.leki = leki;
    }
}
