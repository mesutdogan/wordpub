package com.doganmesut.word;

import com.doganmesut.dictionary.Dictionary;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

/**
 * @author Mesut Dogan <doganmesut01@gmail.com>
 * @version 0.0.1
 */

@Document
public class Word {

    @Id
    private String id = String.valueOf(new ObjectId());

    @Indexed(unique = true)
    private String word;

    private String meaning;

    @DBRef
    private Dictionary dictionary;

    private Date createDate = new Date();

    public Dictionary getDictionary() {
        return dictionary;
    }

    public void setDictionary(Dictionary dictionary) {
        this.dictionary = dictionary;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getMeaning() {
        return meaning;
    }

    public void setMeaning(String meaning) {
        this.meaning = meaning;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
