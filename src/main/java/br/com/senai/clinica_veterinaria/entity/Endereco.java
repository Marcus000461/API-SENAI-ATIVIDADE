package br.com.senai.clinica_veterinaria.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Endereco {
    @Id
    @GeneratedValue( strategy = GenerationType.AUTO)
    private Long id;
    private Integer cpf;
    private Integer logradouro;
    private String localidade;
    private Integer uf;
    private String bairro;
    private Integer numero;
    private String complemento;
    private String referencia;
    private Boolean principal;
    public Integer getCpf() {
        return cpf;
    }
    public void setCpf(Integer cpf) {
        this.cpf = cpf;
    }
    public Integer getLogradouro() {
        return logradouro;
    }
    public void setLogradouro(Integer logradouro) {
        this.logradouro = logradouro;
    }
    public String getLocalidade() {
        return localidade;
    }
    public void setLocalidade(String localidade) {
        this.localidade = localidade;
    }
    public Integer getUf() {
        return uf;
    }
    public void setUf(Integer uf) {
        this.uf = uf;
    }
    public String getBairro() {
        return bairro;
    }
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
    public Integer getNumero() {
        return numero;
    }
    public void setNumero(Integer numero) {
        this.numero = numero;
    }
    public String getComplemento() {
        return complemento;
    }
    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }
    public String getReferencia() {
        return referencia;
    }
    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }
    public Boolean getPrincipal() {
        return principal;
    }
    public void setPrincipal(Boolean principal) {
        this.principal = principal;
    }

   

}
