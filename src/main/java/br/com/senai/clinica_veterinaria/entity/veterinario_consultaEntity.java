package br.com.senai.clinica_veterinaria.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class veterinario_consultaEntity {
      @Id
      @GeneratedValue( strategy = GenerationType.IDENTITY)

      private String obs_medicas;

    public String getObs_medicas() {
        return obs_medicas;
    }

    public void setObs_medicas(String obs_medicas) {
        this.obs_medicas = obs_medicas;
    }


}
