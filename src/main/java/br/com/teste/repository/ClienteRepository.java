package br.com.teste.repository;//CLASSE CRIADA


import br.com.teste.model.Cliente;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface ClienteRepository extends MongoRepository<Cliente, Integer> {

}