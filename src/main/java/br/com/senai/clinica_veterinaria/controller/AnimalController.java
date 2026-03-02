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

import br.com.senai.clinica_veterinaria.entity.Animal;
import br.com.senai.clinica_veterinaria.exception.Response;
import br.com.senai.clinica_veterinaria.repository.AnimalRepository;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/animal")
public class AnimalController {

    @Autowired
    private AnimalRepository repository;

    @PostMapping 
    public Animal adicionaAnimal(@Valid @RequestBody Animal cao) {
        Animal saved = repository.save(cao);
        return saved;

    }

    @GetMapping
    public List<Animal> retornaTodos() {
        return repository.findAll();
    }

    @PutMapping("/{id}")
    public Response AtualizaAnimal(@PathVariable Long id, @RequestBody Animal entity) {
        // private String nome;
        // private String especie;
        // private String raca;
        // private Integer idade;
        // private String infor_medicas;
        // private Boolean status;
        if (!repository.existsById(id)) { 
            return new Response(404, "Não encontrado");//O servidor não pode encontrar o recurso solicitado. No navegador, isso significa que o URL não é reconhecido. Em uma API, isso também pode significar que o endpoint é válido, mas o próprio recurso não existe. //

        }

        Animal animal = repository.findById(id).get();
        if (entity.getNome() != null) {
            animal.setNome(entity.getNome());
        }

        if (entity.getEspecie() != null) {
            animal.setEspecie(entity.getEspecie());
        }

        if (entity.getRaca() != null) {
            animal.setRaca(entity.getRaca());
        }

        if (entity.getIdade() != null) {
            animal.setIdade(entity.getIdade());
        }

        if (entity.getInfor_medicas() != null) {
            animal.setInfor_medicas(entity.getInfor_medicas());
        }

        if (entity.getStatus() != null) {
            animal.setStatus(entity.getStatus());
        }

        repository.save(animal);
        return null;
    }

    @DeleteMapping("/{id}")
    public Response deleteAnimal(@PathVariable Long id) {
        if (!repository.existsById(id)) {
            return new Response(409, "Animal não encontrado");//Esta resposta será enviada quando uma requisição conflitar com o estado atual do servidor.//
        }
        return new Response(204, "Animal deletado");//Não há conteúdo para enviar para esta solicitação, mas os cabeçalhos podem ser úteis. O agente do usuário pode atualizar seus cabeçalhos em cache para este recurso com os novos.//

    }
}
