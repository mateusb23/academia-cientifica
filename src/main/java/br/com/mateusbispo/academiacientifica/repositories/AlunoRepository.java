package br.com.mateusbispo.academiacientifica.repositories;

import br.com.mateusbispo.academiacientifica.models.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface AlunoRepository extends JpaRepository<Aluno, UUID> {

    boolean existsByCpf(String cpf);
}
