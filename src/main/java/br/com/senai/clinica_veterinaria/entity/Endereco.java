package br.com.senai.clinica_veterinaria.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
public class Endereco {
    @Id
    @GeneratedValue( strategy = GenerationType.AUTO)
    private Long id;
    @Size(min=3, max= 11)
    private Integer cep;
    @Size(min=8, max= 8, message = "O cep tem que ter obrigatoriamente 8 caracteres")
    private Integer logradouro;
    @NotBlank
    @Size(min=8, max= 100, message = "O logradouro pode variar e ter varias diferenciações")
    private String localidade;
     @NotBlank
    @Size(min=8, max= 50, message = "A localidade pode variar e ter varias diferenciações")
    private Integer uf;
    @Size(min=2, max= 2, message = "A Uf tem apenas dois caracteres")
    private String bairro;
    @NotBlank
    private Integer numero;
    @Size(min=2, max= 5, message = "Numeros da casa pode variar conforme o bairro")
    private String complemento;
    @Size(min=10, max= 20, message = "O complemento vai variar conforme onde a pessoa morar")
    private String referencia;
     @Size(max=100)
    private Boolean principal;
    @NotBlank

    public Integer getCpf() {
        return cep;
    }
    public void setCpf(Integer cpf) {
        this.cep = cpf;
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
    public @Size(max = 100) Boolean getPrincipal() {
        return principal;
    }
    public void setPrincipal(@Size(max = 100) Boolean principal) {
        this.principal = principal;
    }
    public void setPrincipal(Object getPrincipal) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setPrincipal'");
    }

   

}
