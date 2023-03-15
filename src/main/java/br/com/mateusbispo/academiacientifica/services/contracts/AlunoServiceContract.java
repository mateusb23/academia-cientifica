package br.com.mateusbispo.academiacientifica.services.contracts;

import br.com.mateusbispo.academiacientifica.dtos.AlunoDto;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface AlunoServiceContract {

    AlunoDto saveAluno(AlunoDto alunoDto);

    List<AlunoDto> findAll();

    Optional<AlunoDto> findById(UUID id);

    void delete(UUID id);

    Boolean existsByCpf(String cpf);

}
