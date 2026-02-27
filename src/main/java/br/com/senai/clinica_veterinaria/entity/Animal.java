package br.com.senai.clinica_veterinaria.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;

@Entity
public class Animal {
    @Id
    @GeneratedValue( strategy = GenerationType.AUTO)
    private Long id;
    
    @NotBlank (message = "nome não pode ser vazio")
    private String nome;
    @NotBlank
    private String especie;
    @NotBlank
    private String raca;
    @Positive
    private Integer idade;
    @Size( message = "Informações devem conter no maximo 200 caracteres")
    private String infor_medicas;
    @NotBlank
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
