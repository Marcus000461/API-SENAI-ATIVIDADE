package br.com.senai.clinica_veterinaria.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Size;

@Entity
public class Telefone {
    @Id
    @GeneratedValue( strategy = GenerationType.AUTO)
    private Long id;
    @Size(min=11, max= 11, message = "Numero do telefone tem que ser obrigatoriamente 11")
    private Integer numero;

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Object numero) {
        this.numero = (Integer) numero;
    }

    
}