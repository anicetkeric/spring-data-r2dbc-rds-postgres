package com.rad.sample.springdatar2dbcrdspostgres.repositories;

import com.rad.sample.springdatar2dbcrdspostgres.entities.Book;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends ReactiveCrudRepository<Book, Long> {
}
