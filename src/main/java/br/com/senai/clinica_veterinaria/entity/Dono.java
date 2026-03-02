package br.com.senai.clinica_veterinaria.entity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
public class Dono {
    @Id
    @GeneratedValue( strategy = GenerationType.AUTO)
    private Long id;

    @OneToMany(mappedBy = "dono")
    private List<Telefone> telefones;

    @NotBlank
    private String nome;
    @Size(min=3, max= 11, message = "O cpf tem que ter obrigatoriamente 11 caracteres")
    @Column(unique = true)
    private String cpf;
    @NotBlank
    private Boolean status;
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public Boolean getStatus() {
        return status;
    }
    public void setStatus(Boolean status) {
        this.status = status;
    }
    public static String getCpf() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getCpf'");
    }
  
    

}
