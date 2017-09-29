package com.shahabyounas.board;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by Shahab on 7/8/2017.
 */
@Entity
public class Message {

    @Id
    private String id;

    private String author;

    private String title;

    private String body;

    public Message(){
        this("no user exist");
    }
    public Message(String s){
       this.setId("The user does not exit");
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }



    @Override
    public String toString() {
        return getId() + "/n" +getAuthor() + "/n" + getTitle() +"/n" + getBody();
    }
}
