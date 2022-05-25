package com.example.padroesdeprojetospring.model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository // Opcional
public interface ClienteRepository extends CrudRepository<Cliente, Long> {

}
