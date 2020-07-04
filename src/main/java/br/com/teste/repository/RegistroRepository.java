package br.com.teste.repository;



import br.com.teste.model.Registro;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegistroRepository extends MongoRepository<Registro, Integer> {
}
