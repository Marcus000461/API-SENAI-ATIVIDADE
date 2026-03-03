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
    public Response adicionaDono(@RequestBody Dono dono) {

        boolean cpfJaExiste = repository.existsByCpf(dono.getCpf());

        if (cpfJaExiste) {
            return new Response(409, "Já existe esse Cpf");
        }

        repository.save(dono);
        return new Response(201, "Dono adicionadocom sucesso");

    }

    @GetMapping
    public List<Dono> retornaTodos() {
        return repository.findAll();
    }

    @PutMapping("/{id}")
    public Response AtualizaDono(@Valid @PathVariable Long id, @RequestBody Dono entity) {

        if (!repository.existsById(id)) {
            return new Response(404, "Não encontrado");
        }

        Dono dono = repository.findById(id).get();
        if (entity.getNome() != null) {
            dono.setNome(entity.getNome());
        }

        if (entity.getCpf() != null) {
            dono.setCpf(entity.getCpf());
        }

        if (entity.getStatus() != null) {
            dono.setStatus(entity.getStatus());
        }

        repository.save(dono);
          return new Response(404, "Não encontrado");
    }

    @DeleteMapping("/[id")
    public Response deletaDono( @PathVariable Long id){
        if (!repository.existsById(id)){
            return new Response(404,  "Dono não encontrdao");
        }
        repository.deleteById(id);
        return new Response(404, "Dono deletado com sucesso");
    }
}
