package com.doganmesut;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by ryuk on 15.01.2017.
 */

@RestController
@RequestMapping("/word")
public class WordController {

    @Autowired
    private UserService userService;

    @Autowired
    private DictionaryService dictionaryService;

    @Autowired
    private WordService wordService;

    @RequestMapping(value = "/save",method = RequestMethod.POST)
    public User save(@RequestParam String email, @RequestParam String word, @RequestParam String meaning){

        User user = userService.findByEmail(email);

        if (user==null){
            User newUser = new User();
            newUser.setEmail(email);
            Dictionary newDictionary = new Dictionary();
            dictionaryService.save(newDictionary);
            Word newWord = new Word();
            newWord.setWord(word);
            newWord.setMeaning(meaning);
            wordService.save(newWord);
            newDictionary.getWords().add(newWord);
            dictionaryService.save(newDictionary);
            newUser.setDictionary(newDictionary);
            userService.save(newUser);

        }
        else {
            user= userService.findByEmail(email);
            Word newWord = new Word();
            newWord.setWord(word);
            newWord.setMeaning(meaning);
            wordService.save(newWord);
            user.getDictionary().getWords().add(newWord);
            dictionaryService.save(user.getDictionary());
        }
        return user;
    }
}
