package br.com.senai.clinica_veterinaria.entity;

import java.sql.Timestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class consultaEntity {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Long id;
    private Timestamp data_hora;
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public Timestamp getData_hora() {
        return data_hora;
    }
    public void setData_hora(Timestamp data_hora) {
        this.data_hora = data_hora;
    }

    
}
