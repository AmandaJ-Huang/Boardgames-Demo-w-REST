package com.bgg.xmlapi.demo.repositories;

import com.bgg.xmlapi.demo.entities.Boardgames;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BoardgamesRepository extends CrudRepository<Boardgames, Long> {
}
