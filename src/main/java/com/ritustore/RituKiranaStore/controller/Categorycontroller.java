package com.ritustore.RituKiranaStore.controller;

import com.ritustore.RituKiranaStore.model.Category;
import com.ritustore.RituKiranaStore.service.Categoryservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/categories")
@CrossOrigin(origins = "http://localhost:5173")
public class Categorycontroller {
    @Autowired
    Categoryservice categoryservice;
    @GetMapping
    public List<Category> getAllCategories(){
     return categoryservice.getAllCategories();
    }
}
