package br.com.senai.clinica_veterinaria.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Telefone {
    @Id
    @GeneratedValue( strategy = GenerationType.AUTO)
    private Long id;
    private Integer numero;

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    
}