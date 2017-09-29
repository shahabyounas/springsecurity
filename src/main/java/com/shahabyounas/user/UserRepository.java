package com.shahabyounas.user;

import com.shahabyounas.board.Message;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Shahab on 7/9/2017.
 */
@Repository
public interface UserRepository extends CrudRepository<User,String> {


}

