package br.com.mateusbispo.academiacientifica.services;

import br.com.mateusbispo.academiacientifica.controllers.AlunoController;
import br.com.mateusbispo.academiacientifica.dtos.AlunoDto;
import br.com.mateusbispo.academiacientifica.exceptions.ResourceNotFoundException;
import br.com.mateusbispo.academiacientifica.repositories.AlunoRepository;
import br.com.mateusbispo.academiacientifica.services.contracts.AlunoServiceContract;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.mateusbispo.academiacientifica.mapper.DozerMapper;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.logging.Logger;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

@Service
public class AlunoService implements AlunoServiceContract {
    private final Logger logger = Logger.getLogger(AlunoService.class.getName());

    @Autowired
    AlunoRepository alunoRepository;

    public List<AlunoDto> findAll() {

        logger.info("Finding all students!");

        var alunos = DozerMapper.parseListObjects(alunoRepository.findAll(), AlunoDto.class);
        alunos.forEach(p -> p.add(linkTo(methodOn(AlunoController.class).findById(p.getKey())).withSelfRel()));

        return alunos;
    }

    @Override
    public AlunoDto saveAluno(AlunoDto alunoDto) {
        return null;
    }

    @Override
    public List<AlunoDto> findAll(AlunoDto alunoDto) {
        return null;
    }

    public Optional<AlunoDto> findById(UUID id) {

        logger.info("Finding one student!");

        var entity = alunoRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("No records found for this ID!"));
        var dto = DozerMapper.parseObject(entity, AlunoDto.class);
        dto.add(linkTo(methodOn(AlunoController.class).findById(id)).withSelfRel());

        return Optional.of(dto);
    }

    @Override
    public void delete(AlunoDto alunoDto) {

    }

    @Override
    public Boolean existsByCpf(String cpf) {
        return null;
    }

}
