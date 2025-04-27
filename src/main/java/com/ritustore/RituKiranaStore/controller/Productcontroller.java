package com.ritustore.RituKiranaStore.controller;

import com.ritustore.RituKiranaStore.model.Product;
import com.ritustore.RituKiranaStore.repository.Productrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/product")
public class Productcontroller {

    @Autowired
    Productrepository productrepository;

    @GetMapping
    public List<Product> getAllProduct(){
        return productrepository.findAll();
    }

    @GetMapping("/category/{categoryId}")
    public List<Product> getAllProductsByCategory(@PathVariable Long categoryId){
        return productrepository.findByCategoryId(categoryId);
    }
}
