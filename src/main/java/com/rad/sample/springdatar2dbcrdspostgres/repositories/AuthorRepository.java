package com.rad.sample.springdatar2dbcrdspostgres.repositories;

import com.rad.sample.springdatar2dbcrdspostgres.entities.Author;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepository extends ReactiveCrudRepository<Author, Long> {
}
