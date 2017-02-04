package com.doganmesut.dictionary;

import com.doganmesut.word.Word;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by ryuk on 24.01.2017.
 */

@Document
public class Dictionary {

    @Id
    private String id = String.valueOf(new ObjectId());

    @DBRef
    private Set<Word> words=  new HashSet<>();

    public Set<Word> getWords() {
        return words;
    }

    public void setWords(Set<Word> words) {
        this.words = words;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    private Date createDate;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
