package ru.netology.jdbc;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DBService {
    DBRepository repository;

    public DBService(DBRepository repository) {
        this.repository = repository;
    }

    public List<String> getProducts(String name) {
        return repository.getProductName(name);
    }
}
