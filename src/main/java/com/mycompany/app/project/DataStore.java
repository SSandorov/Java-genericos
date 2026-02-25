package com.mycompany.app.project;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class DataStore<T, K> {
    private final List<T> dataList = new ArrayList<>();
    private final Map<K, T> dataMap = new HashMap<>();

    public boolean add(K key, T item) {
        //* Utility class Objects
        //! Devuelve un null pointer exception, asi que debemos manejarlo
        Objects.requireNonNull(key, "La clave no puede ser nula");
        Objects.requireNonNull(item, "Elemento no puede ser nulo");
        
        if (dataMap.containsKey(key)) {
            return false;
        }

        dataList.add(item);

        dataMap.put(key, item);

        return true;
    }

    public T remove(K key) {
        Objects.requireNonNull(key, "La clave no puede ser nula");

        T item = dataMap.remove(key);
        if (item != null) {
            dataList.remove(item);
        }

        return item;
    }

    public T find(K key) {
        Objects.requireNonNull(key, "La clave no puede ser nula");

        return dataMap.get(key);
    }

    public List<T> getAll() {
        //* Utility class Collections
        return Collections.unmodifiableList(dataList);
    }
}
