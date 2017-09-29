package com.shahabyounas.board;


import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;
import java.util.Map;

/**
 * Created by Shahab on 7/8/2017.
 *  //For multiple endpoints in request mapping
 // @RequestMapping(value = {"/" ,"/okay","/nookay"})
 // the endpoint can be seprately stored in static variable
 //public static final String message="/message";
 */
@RestController
public class MessageController {

    private static final org.slf4j.Logger logger= LoggerFactory.getLogger(MessageController.class);

    @Autowired
    MessageService messageService;

//    @RequestMapping(value = {"/"})
//    public String  getMessage(){
//        return "Well come to dashboard";
//    }

    @RequestMapping("/message/{id}")
    public Message getMessageById(@PathVariable String id){
           return messageService.getMessageById(id);
    }

    @RequestMapping (method = RequestMethod.POST  ,value = "/message")
    public void addMessage(@RequestBody Message message){
          messageService.addMessage(message);

    }

    @RequestMapping (method = RequestMethod.DELETE, value = "/message/{id}")
    public void  deleteMessageById(@PathVariable String id){
             messageService.deletMessageById(id);
    }

    @RequestMapping (method = RequestMethod.PUT , value = "/message/{id}")
    public void updateMessageInfo(@RequestBody Message message){
           messageService.updateMessageInfo(message);
    }





}
