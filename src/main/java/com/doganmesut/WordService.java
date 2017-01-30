package com.doganmesut;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by ryuk on 26.01.2017.
 */

@Service
public class WordService implements AppService<Word> {

    @Autowired
    private WordRepository wordRepository;

    @Override
    public Word save(Word word) {
        return wordRepository.save(word);
    }

    @Override
    public void delete(String id) {

    }

    @Override
    public Word findOne(String id) {
        return null;
    }

    @Override
    public List<Word> findAll() {
        return null;
    }
}
