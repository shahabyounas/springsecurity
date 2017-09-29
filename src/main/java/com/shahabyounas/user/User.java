package com.shahabyounas.user;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by Shahab on 7/9/2017.
 */
@Entity
public class User {

    @Id
    String id;

    String name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
