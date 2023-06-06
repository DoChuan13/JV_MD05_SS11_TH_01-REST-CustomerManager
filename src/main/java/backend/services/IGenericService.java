package backend.services;

import java.util.Optional;

public interface IGenericService<T> {
    Iterable<T> findAll();

    T save(T t);

    Optional<T> findById(Long id);

    void deleteById(Long id);
}
