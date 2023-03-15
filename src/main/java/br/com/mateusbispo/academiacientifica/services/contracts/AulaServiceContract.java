package br.com.mateusbispo.academiacientifica.services.contracts;

import br.com.mateusbispo.academiacientifica.models.Aluno;
import br.com.mateusbispo.academiacientifica.models.Aula;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface AulaServiceContract {

    Aluno saveAluno(Aula aula);
    List<Aula> findAll(Aula aula);
    Optional<Aula> findById(UUID id);
    void delete(Aula aula);

}
