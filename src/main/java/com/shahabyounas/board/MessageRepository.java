package com.shahabyounas.board;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Shahab on 7/9/2017.
 */
@Repository
public interface MessageRepository extends CrudRepository<Message,String> {

      Message findMessagesById(String id);
     // void  deleteMessageById(String id);

}
