package ReceptJava24.Recept.repositories;

import ReceptJava24.Recept.models.Recept;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ReceptRepository extends MongoRepository<Recept, String> {
}
