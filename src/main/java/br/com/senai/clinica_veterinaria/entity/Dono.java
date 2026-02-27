package br.com.senai.clinica_veterinaria.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
public class Dono {
    @Id
    @GeneratedValue( strategy = GenerationType.AUTO)
    private Long id;
    @NotBlank
    private String nome;
    @Size(min=3, max= 11, message = "O cpf tem que ter obrigatoriamente 11 caracteres")
    private Integer cpf;
    @NotBlank
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
    public void setEspecie(Integer cpf2) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setAnimal'");
    }

    

}
