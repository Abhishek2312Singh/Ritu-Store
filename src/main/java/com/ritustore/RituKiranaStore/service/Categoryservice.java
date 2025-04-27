package com.ritustore.RituKiranaStore.service;

import com.ritustore.RituKiranaStore.model.Category;
import com.ritustore.RituKiranaStore.repository.Categoryrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Categoryservice {
    @Autowired
    Categoryrepository categoryrepository;

    public List<Category> getAllCategories() {
        return categoryrepository.findAll();
    }
}
