package com.ritustore.RituKiranaStore.service;

import com.ritustore.RituKiranaStore.model.Product;
import com.ritustore.RituKiranaStore.repository.Productrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Productservice {
    @Autowired
    Productrepository productrepository;

    public List<Product> getAllProducts(){
        return productrepository.findAll();
    }
    public List<Product> getProductByCategpry(Long categoryId){
        return productrepository.findByCategoryId(categoryId);
    }
}
