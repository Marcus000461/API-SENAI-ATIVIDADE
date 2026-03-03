package br.com.senai.clinica_veterinaria.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.Size;

@Entity
public class Telefone {
    @Id
    @GeneratedValue( strategy = GenerationType.AUTO)
    private Long id;
    @Size(min=11, max= 11, message = "Numero do telefone tem que ser obrigatoriamente 11")
    private Integer numero;

    @ManyToOne
    @JoinColumn(name = "fk_dono")
    private Dono dono;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Dono getDono() {
        return dono;
    }

    public void setDono(Dono dono) {
        this.dono = dono;
    }

   
   
}

