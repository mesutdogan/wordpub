package com.doganmesut.dictionary;

import com.doganmesut.AppService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Mesut Dogan <doganmesut01@gmail.com>
 * @version 0.0.1
 */
@Service
public class DictionaryService implements AppService<Dictionary> {

    @Autowired
    private DictionaryRepository dictionaryRepository;

    @Override
    public Dictionary save(Dictionary dictionary) {
        return dictionaryRepository.save(dictionary);
    }

    @Override
    public void delete(String id) {
        dictionaryRepository.delete(id);
    }

    @Override
    public Dictionary findOne(String id) {
        return dictionaryRepository.findOne(id);
    }

    @Override
    public List<Dictionary> findAll() {
        return null;
    }
}
