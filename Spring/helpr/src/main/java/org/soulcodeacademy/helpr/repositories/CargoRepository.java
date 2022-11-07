package org.soulcodeacademy.helpr.repositories;
// Repositoriy é um recusrso quue per ite manipular a entidade no banco de dados
//CRUD

import org.soulcodeacademy.helpr.domain.Cargo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository //indica que a interface é um repository
public interface CargoRepository extends CrudRepository<Cargo, Integer> { //Entidade e PK
}
//indicar qual entidade vai ser gerenciada e qual PK
// O spring gera uma classe dinamica com base em nossa interface CargoRepository