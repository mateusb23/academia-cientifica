package br.com.mateusbispo.academiacientifica.repositories;

import br.com.mateusbispo.academiacientifica.models.Pagamento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface PagamentoRepository extends JpaRepository<Pagamento, UUID> {
}
