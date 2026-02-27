package br.com.senai.clinica_veterinaria.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Veterinario {
      @Id
      @GeneratedValue( strategy = GenerationType.AUTO)
      private Long id;
      private String crmv;
      private String especialização;
      private Integer jornada;
      public Long getId() {
          return id;
      }
      public void setId(Long id) {
          this.id = id;
      }
      public String getCrmv() {
          return crmv;
      }
      public  void setCrmv(String crmv) {
          this.crmv = crmv;
      }
      public String getEspecialização() {
          return especialização;
      }
      public void setEspecialização(String especialização) {
          this.especialização = especialização;
      }
      public Integer getJornada() {
          return jornada;
      }
      public  void setJornada(Integer jornada) {
          this.jornada = jornada;
      }
    
 
    }