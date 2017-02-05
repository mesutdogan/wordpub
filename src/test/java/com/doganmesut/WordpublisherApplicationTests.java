package com.doganmesut;

import com.doganmesut.user.User;
import com.doganmesut.user.UserService;
import com.doganmesut.word.Word;
import com.doganmesut.word.WordService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

@RunWith(SpringRunner.class)
@SpringBootTest
public class WordpublisherApplicationTests {

    @Autowired
    private UserService userService;

    @Autowired
    private WordService wordService;

    List<Word> words;

    @Test
    public void contextLoads() {
        User user = new User();
        user.setEmail("doganmesut01@gmail.com");
        user.setFullName("Mesut Doğan");
        user = userService.save(user);
        Assert.assertTrue(user != null);
    }

    @Test
    public void testCompareWithCreateDateJava7Way() {

        Collections.sort(words, new Comparator<Word>() {
            @Override
            public int compare(Word o1, Word o2) {
                return o1.getWord().compareTo(o2.getWord());
            }
        });
        for (Word word : words) {
            System.out.println(word.getWord());
        }
    }

    @Test
    public void testCompareWithCreateDateJava8Way() {

        Collections.sort(words, ((Word o1, Word o2) -> o1.getWord().compareTo(o2.getWord())));
        words.forEach(word -> System.out.println(word));
    }

    @Before
    public void setUp() {
        words = new ArrayList<>();
        Word word1 = new Word();
        word1.setWord("what");
        Word word2 = new Word();
        word2.setWord("are");
        Word word3 = new Word();
        word3.setWord("you");
        Word word4 = new Word();
        word4.setWord("boy?");

        words.add(word1);
        words.add(word2);
        words.add(word3);
        words.add(word4);
    }

    @Test
    public void printAllFirstChar() {

        Consumer<Word> consumer = word -> System.out.println(word.getWord().charAt(0));
        words.forEach(consumer);
        printFirstChar(words.get(0), consumer);
    }

    public void printFirstChar(Word word, Consumer<Word> wordConsumer) {
        wordConsumer.accept(word);
    }
}
