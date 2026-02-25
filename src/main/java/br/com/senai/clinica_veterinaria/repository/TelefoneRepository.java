package br.com.senai.clinica_veterinaria.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.senai.clinica_veterinaria.controller.Telefone;

public interface TelefoneRepository extends JpaRepository<Telefone, Long> {
    
}
