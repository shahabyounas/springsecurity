package com.shahabyounas.board;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Shahab on 7/8/2017.
 */
@Service
public class MessageService {;
   public static final Logger logger= LoggerFactory.getLogger(MessageService.class);

   @Autowired
   MessageRepository messageRepository;

   public  Message  getMessageById(String id) {

         Message message=  messageRepository.findMessagesById(id);
         if(message != null)
             return message;
         else
             return  new Message();

   }

   public void addMessage(Message message) {
         messageRepository.save(message);
   }

    public void deletMessageById(String id) {

          messageRepository.delete(id);


    }

    public void updateMessageInfo(Message message) {
       messageRepository.save(message);
    }
}
