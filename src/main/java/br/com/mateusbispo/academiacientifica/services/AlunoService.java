package br.com.mateusbispo.academiacientifica.services;

import br.com.mateusbispo.academiacientifica.models.Aluno;
import br.com.mateusbispo.academiacientifica.repositories.AlunoRepository;
import br.com.mateusbispo.academiacientifica.services.contracts.AlunoServiceContract;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.logging.Logger;

@Service
public class AlunoService implements AlunoServiceContract {
    private final Logger logger = Logger.getLogger(AlunoService.class.getName());

    @Autowired
    AlunoRepository alunoRepository;

    @Override
    public Aluno saveAluno(Aluno aluno) {
        return null;
    }

    @Override
    public List<Aluno> findAll(Aluno aluno) {
        return null;
    }

    @Override
    public Optional<Aluno> findById(UUID id) {
        return Optional.empty();
    }

    @Override
    public void delete(Aluno aluno) {

    }

    @Override
    public Boolean existsByCpf(String cpf) {
        return null;
    }
}
