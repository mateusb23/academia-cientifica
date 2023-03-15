package br.com.mateusbispo.academiacientifica.repositories;

import br.com.mateusbispo.academiacientifica.models.Modulo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ModuloRepository extends JpaRepository<Modulo, UUID> {
}
