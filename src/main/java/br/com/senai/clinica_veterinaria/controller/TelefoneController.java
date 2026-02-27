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

import br.com.senai.clinica_veterinaria.entity.Telefone;
import br.com.senai.clinica_veterinaria.exception.Response;
import br.com.senai.clinica_veterinaria.repository.TelefoneRepository;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/telefone")

public class TelefoneController {
    @Autowired
    private TelefoneRepository repository;

    @PostMapping //
    public Response adicionatelefone(@RequestBody Telefone telefone) {
        repository.save(telefone);
        return new Response(201, "Não encontrado");

    }

    @GetMapping
    public List<Telefone> retornaTodos() {
        return repository.findAll();
    }

    @PutMapping("/{id}")
    public Response Atualizatelefone(@Valid @PathVariable Long id, @RequestBody Telefone entity){
       
        
        if (!repository.existsById(id)){
            return new  Response(404, "Não encontrado");
        }
        
        Telefone telefone = repository.findById(id).get();
        if(entity.getNumero() != null){
            telefone.setNumero(entity.getNumero());
        }
        repository.save(telefone);
        return null;
    }

     @DeleteMapping("/{id}")
    public Response deletetelefone(@PathVariable Long id) {
        if (!repository.existsById(id)) {
            return new Response(404, "telefone não encontrado");
        }
        return new Response(404, "telefone não encontrado");
        

    
    }
}

