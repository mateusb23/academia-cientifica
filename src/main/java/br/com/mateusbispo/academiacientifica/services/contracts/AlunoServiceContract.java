package br.com.mateusbispo.academiacientifica.services.contracts;

import br.com.mateusbispo.academiacientifica.models.Aluno;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface AlunoServiceContract {

    Aluno saveAluno(Aluno aluno);
    List<Aluno> findAll(Aluno aluno);
    Optional<Aluno> findById(UUID id);
    void delete(Aluno aluno);
    Boolean existsByCpf(String cpf);

}
