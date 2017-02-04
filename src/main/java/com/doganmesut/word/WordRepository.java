package com.doganmesut.word;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by ryuk on 29.01.2017.
 */

@Repository
public interface WordRepository extends MongoRepository<Word, String> {
}
