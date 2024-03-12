package br.com.lucas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.lucas.model.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {

}
