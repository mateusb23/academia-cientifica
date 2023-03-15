package br.com.mateusbispo.academiacientifica.services.contracts;

import br.com.mateusbispo.academiacientifica.models.Aula;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface CrudServiceContract<T> {

    T save(T Object);
    List<T> findAll(T obj);
    Optional<T> findById(UUID id);
    void delete(T obj);

}
