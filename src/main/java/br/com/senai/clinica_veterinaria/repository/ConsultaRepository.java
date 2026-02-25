package br.com.senai.clinica_veterinaria.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.senai.clinica_veterinaria.controller.Consulta;

public interface ConsultaRepository extends JpaRepository< Consulta, Long>{
    
}
