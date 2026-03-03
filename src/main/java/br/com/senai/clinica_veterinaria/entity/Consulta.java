package br.com.senai.clinica_veterinaria.entity;

import java.time.LocalDateTime;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;


@Entity
public class Consulta {
    @Id
    @GeneratedValue( strategy = GenerationType.AUTO)
    private Long id;



    @OneToMany(mappedBy = "consulta")
    private List<VeterinarioConsulta> veterinarioConsultas;

    
    private LocalDateTime data_hora;

    @ManyToOne
    @JoinColumn( name = "fk_animal")
    private Animal animal;



    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public LocalDateTime getData_hora() {
        return data_hora;
    }
    public void setData_hora(LocalDateTime data_hora) {
        this.data_hora = data_hora;
    }
    public Animal getAnimal() {
        return animal;
    }
    public void setAnimal(Animal animal) {
        this.animal = animal;
    }
  
    
    

    
}
