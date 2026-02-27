package br.com.senai.clinica_veterinaria.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.senai.clinica_veterinaria.entity.Dono;
import br.com.senai.clinica_veterinaria.exception.Response;
import br.com.senai.clinica_veterinaria.repository.DonoRepository;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/dono")
public class DonoController {
    
   @Autowired
   private DonoRepository repository;
    
     @PostMapping //
    public Dono adicionaDono(@RequestBody Dono dono ){
        Dono saved  = repository.save(dono);
        return saved;

    }

      @GetMapping
    public List<Dono> retornaTodos(){
        return repository.findAll();
    }

     @PutMapping("/{id}")
      public Response AtualizaDono( @Valid @PathVariable Long id, @RequestBody Dono entity){
        //private Long id;
        //private String nome;
        //private Integer cpf;
        //private Boolean status; 
       
        
        if (!repository.existsById(id)){
            return new  Response(404, "Não encontrado");
        }
        
        Dono dono = repository.findById(id).get();
        if(entity.getNome() != null){
            dono.setNome(entity.getNome());
        }
        
         if(entity.getCpf() !=null){
            dono.setCpf(entity.getCpf());
        }

         if(entity.getStatus() !=null){
            dono.setStatus(entity.getStatus());
        }

        repository.save(dono);
        return null;
    }





}
