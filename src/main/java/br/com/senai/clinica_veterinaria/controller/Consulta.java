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

import br.com.senai.clinica_veterinaria.exception.Response;
import br.com.senai.clinica_veterinaria.repository.ConsultaRepository;


@RestController
@RequestMapping("/Clinica")
public class Consulta {
    
    @Autowired
     private ConsultaRepository repository;
    
    @PostMapping //
    public Consulta adicionaConsulta(@RequestBody Consulta pessoa ){
        Consulta saved  = repository.save(pessoa);
        return saved;
}

      @GetMapping
    public List<Consulta> retornaTodos(){
        return repository.findAll();
    }

     @PutMapping("/{id}")
    public Response AtualizaConsulta(@PathVariable Long id, @RequestBody Consulta entity){
        //private LocalDateTime data_hora

        if (!repository.existsById(id)){
            return new  Response(404, "Não encontrado");
        }
        
        Consulta consulta = repository.findById(id).get();
         if(entity.getNome() != null){



        
        repository.save(consulta);
        return null;
    }


}