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

import br.com.senai.clinica_veterinaria.entity.Endereco;
import br.com.senai.clinica_veterinaria.exception.Response;
import br.com.senai.clinica_veterinaria.repository.EnderecoRepository;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/endereco")
public class EnderecoController {
    
    @Autowired
    private EnderecoRepository repository;
    
    @PostMapping //
    public Response adicionaEndereco(@Valid @RequestBody Endereco endereco ){
        repository.save(endereco);
          return new  Response(201, "Não encontrado");

    }

    @GetMapping
    public List<Endereco> retornaTodos(){
        return repository.findAll();
    }

    @PutMapping("/{id}")
    public Response Atualizaendereco(@PathVariable Long id, @RequestBody Endereco entity){
        //private Long id;
        //private Integer cpf;
        //private Integer logradouro;
        //private String localidade;
        //private Integer uf;
        //private String bairro;
        //private Integer numero;
        //private String complemento;
        //private String referencia;
        //private Boolean principal;
        
        if (!repository.existsById(id)){
            return new  Response(404, "Não encontrado");
        }
        
        Endereco endereco = repository.findById(id).get();
        if(entity.getCpf() != null){
            endereco.setCpf(entity.getCpf());
        }
        
         if(entity.getLogradouro() !=null){
            endereco.setLogradouro(entity.getLogradouro());
        }

         if(entity.getLocalidade() !=null){
            endereco.setLocalidade(entity.getLocalidade());
        }

        if(entity.getUf() !=null){
            endereco.setUf(entity.getUf());
        }

           if(entity.getBairro() !=null){
            endereco.setBairro(entity.getBairro());
        }

         if(entity.getNumero() !=null){
            endereco.setNumero(entity.getNumero());
        }

         if(entity.getComplemento() !=null){
            endereco.setComplemento(entity.getComplemento());
        }

         if(entity.getReferencia() !=null){
            endereco.setReferencia(entity.getComplemento());
        }

          if(entity.getPrincipal() !=null){
            endereco.setPrincipal(entity.getPrincipal());
        }





        repository.save(endereco);
        return null;
    }

     @DeleteMapping("/{id}")
    public Response deleteendereco(@PathVariable Long id) {
        if (!repository.existsById(id)) {
            return new Response(404, "endereco não encontrado");
        }
        return null;

    
    }
}


