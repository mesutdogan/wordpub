package com.doganmesut.user;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by ryuk on 24.01.2017.
 */

@Repository
public interface UserRepository extends MongoRepository<User,String> {
User findByEmail(String email);
}
