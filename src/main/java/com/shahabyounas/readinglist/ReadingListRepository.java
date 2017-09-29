package com.shahabyounas.readinglist;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Shahab on 7/23/2017.
 */
@Repository
public interface ReadingListRepository extends JpaRepository<Book,Long> {

      List<Book> findByReader(Reader reader);
}
