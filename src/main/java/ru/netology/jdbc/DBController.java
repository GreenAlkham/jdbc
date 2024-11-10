package ru.netology.jdbc;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DBController {

    DBService service;

        public DBController(DBService service) {
            this.service = service;
        }

        @GetMapping("/products/fetch-product/")
    public List <String> getQuery(@RequestParam ("name") String name){
return service.getProducts(name);
        }
    }
