package br.com.senai.clinica_veterinaria.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Animal {
    @Id
    @GeneratedValue( strategy = GenerationType.AUTO)
    private Long id;
    private String nome;
    private String especie;
    private String raca;
    private Integer idade;
    private String infor_medicas;
    private Boolean status;
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEspecie() {
        return especie;
    }
    public void setEspecie(String especie) {
        this.especie = especie;
    }
    public String getRaca() {
        return raca;
    }
    public void setRaca(String raca) {
        this.raca = raca;
    }
    public Integer getIdade() {
        return idade;
    }
    public void setIdade(Integer idade) {
        this.idade = idade;
    }
    public String getInfor_medicas() {
        return infor_medicas;
    }
    public void setInfor_medicas(String infor_medicas) {
        this.infor_medicas = infor_medicas;
    }
    public Boolean getStatus() {
        return status;
    }
    public void setStatus(Boolean status) {
        this.status = status;
    }

} 
