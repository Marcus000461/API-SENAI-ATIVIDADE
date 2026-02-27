package br.com.senai.clinica_veterinaria.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.senai.clinica_veterinaria.entity.Consulta;
import br.com.senai.clinica_veterinaria.exception.Response;
import br.com.senai.clinica_veterinaria.repository.ConsultaRepository;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/Consulta")
public class ConsultaController {
    
    @Autowired
    private ConsultaRepository repository;

    @PostMapping
    public Consulta criaConsulta(@Valid @RequestBody Consulta entity){
        Consulta saved = repository.save(entity);
        return saved;

    }

     @GetMapping
    public List<Consulta> retornaTodos() {
        return repository.findAll();
    }

    @PutMapping("/{id}")
    public Response atualizaConsulta(@PathVariable Long id, @RequestBody Consulta entity){
       

    if (!repository.existsById(id)) {
            return new Response(404, "Consulta não encontrada");
        }
        
        Consulta consulta = repository.findById(id).get();
        

     repository.save(consulta);

        return new Response(200, "Consulta Atualizada");
    }

    @DeleteMapping("/{id}")
    public Response deleteConsulta(@PathVariable Long id){
        if (!repository.existsById(id)) {
            return new Response(404, "Não encontrado");
        }
        
            repository.deleteById(id);

        
        
          return new Response(204, "Consulta deletada");
    }

}
