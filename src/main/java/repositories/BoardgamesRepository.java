package repositories;

import entities.Boardgames;
import org.springframework.data.repository.CrudRepository;

public interface BoardgamesRepository extends CrudRepository<Boardgames, Long> {
}
