package com.hsenid.HRmanagementsystem.Model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.util.Set;

@Entity
@Table(name = "fraction")
public class Fraction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "frc_id")
    private int fractionId;
    @NotEmpty
    @Column(name = "frc_name")
    private  String fractionName;

    @OneToMany(mappedBy = "fraction", cascade = {CascadeType.MERGE})
    private Set<Employee> employees;


    public int getFractionId() {
        return fractionId;
    }

    public void setFractionId(int fractionId) {
        this.fractionId = fractionId;
    }

    public String getFractionName() {
        return fractionName;
    }

    public void setFractionName(String fractionName) {
        this.fractionName = fractionName;
    }

//    public void setEmployees(Set<Employee> employees) {
//        this.employees = employees;
//    }
}
