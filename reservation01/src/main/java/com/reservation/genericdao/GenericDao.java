package com.reservation.genericdao;

import java.util.Map;

public interface GenericDao<T, PK> {
    long countAll(Map<String, Object> params);

    T create(T t);

    void delete(PK id);

    T find(PK id);

    T update(T t); 
}
