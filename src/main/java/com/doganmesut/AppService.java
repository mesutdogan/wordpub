package com.doganmesut;

import java.util.List;

/**
 * Created by ryuk on 24.01.2017.
 */
public interface AppService<T> {
    T save(T t);
    void delete(String id);
    T findOne(String id);
    List<T> findAll();
}
