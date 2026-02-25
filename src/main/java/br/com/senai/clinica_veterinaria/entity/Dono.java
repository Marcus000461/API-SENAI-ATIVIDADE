package br.com.senai.clinica_veterinaria.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Dono {
    @Id
    @GeneratedValue( strategy = GenerationType.AUTO)
    private Long id;
    private String nome;
    private Integer cpf;
    private Boolean status;
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Integer getCpf() {
        return cpf;
    }
    public void setCpf(Integer cpf) {
        this.cpf = cpf;
    }
    public Boolean getStatus() {
        return status;
    }
    public void setStatus(Boolean status) {
        this.status = status;
    }

    

}
