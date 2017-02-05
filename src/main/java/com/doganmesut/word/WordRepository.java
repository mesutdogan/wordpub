package com.doganmesut.word;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Mesut Dogan <doganmesut01@gmail.com>
 * @version 0.0.1
 */

@Repository
public interface WordRepository extends MongoRepository<Word, String> {
}
