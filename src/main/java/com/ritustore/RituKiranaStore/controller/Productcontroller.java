package com.ritustore.RituKiranaStore.controller;

import com.ritustore.RituKiranaStore.model.Product;
import com.ritustore.RituKiranaStore.repository.Productrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/product")
    @CrossOrigin(origins = "http://localhost:5173")
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
