package br.com.mateusbispo.academiacientifica.controllers;

import br.com.mateusbispo.academiacientifica.dtos.AlunoDto;
import br.com.mateusbispo.academiacientifica.services.AlunoService;
import br.com.mateusbispo.academiacientifica.util.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/aluno")
public class AlunoController {

    @Autowired
    private AlunoService service;

    @GetMapping(produces = { MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
    public List<AlunoDto> findAll() {
        return service.findAll();
    }

    @CrossOrigin(origins = "http://localhost:8080")
    @GetMapping(value = "/{id}",
            produces = { MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
    public Optional<AlunoDto> findById(@PathVariable(value = "id") UUID id) {
        return service.findById(id);
    }
}
