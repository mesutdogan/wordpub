package com.doganmesut;

import java.util.List;

/**
 * @author Mesut Dogan <doganmesut01@gmail.com>
 * @version 0.0.1
 */
public interface AppService<T> {
    T save(T t);
    void delete(String id);
    T findOne(String id);
    List<T> findAll();
}
