package com.doganmesut.word;

import com.doganmesut.AppService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Mesut Dogan <doganmesut01@gmail.com>
 * @version 0.0.1
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
        wordRepository.delete(id);
    }

    @Override
    public Word findOne(String id) {
        return wordRepository.findOne(id);
    }

    @Override
    public List<Word> findAll() {
        return wordRepository.findAll();
    }
}
