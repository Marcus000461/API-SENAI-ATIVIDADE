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

import br.com.senai.clinica_veterinaria.entity.Veterinario;
import br.com.senai.clinica_veterinaria.exception.Response;
import br.com.senai.clinica_veterinaria.repository.VeterinarioRepository;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/veterinario")

public class VeterinarioController {
    public class TelefoneController {
    @Autowired
    private VeterinarioRepository repository;

    @PostMapping //
    public Response adicionatelefone(@RequestBody Veterinario veterinario) {
        repository.save(veterinario);
        return new Response(201, "Não encontrado");

    }

    @GetMapping
    public List<Veterinario> retornaTodos() {
        return repository.findAll();
    }

    @PutMapping("/{id}")
    public Response Atualizatelefone( @Valid @PathVariable Long id, @RequestBody Veterinario entity){
       
        
        if (!repository.existsById(id)){
            return new  Response(404, "Não encontrado");
        }
        
        Veterinario veterinario = repository.findById(id).get();
        if(entity.getCrmv() != null){
            veterinario.setCrmv(entity.getCrmv());
        }

         if(entity.getEspecialização() != null){
            veterinario.setEspecialização(entity.getEspecialização());
        }

         if(entity.getCrmv() != null){
            veterinario.setCrmv(entity.getCrmv());
        }

         if(entity.getJornada() != null){
            veterinario.setJornada(entity.getJornada());
        }

        repository.save(veterinario);
        return null;
    }

     @DeleteMapping("/{id}")
    public Response deleteveterinario(@PathVariable Long id) {
        if (!repository.existsById(id)) {
            return new Response(404, "Veterinario não encontrado");
        }
        return new Response(404, "Veterinario não encontrado");
        

    
    }
}


}
