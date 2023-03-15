package br.com.mateusbispo.academiacientifica.services.contracts;

import br.com.mateusbispo.academiacientifica.dtos.AlunoDto;
import br.com.mateusbispo.academiacientifica.models.Aluno;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface AlunoServiceContract {

    AlunoDto saveAluno(AlunoDto alunoDto);
    List<AlunoDto> findAll(AlunoDto alunoDto);
    Optional<AlunoDto> findById(UUID id);
    void delete(AlunoDto alunoDto);
    Boolean existsByCpf(String cpf);

}
