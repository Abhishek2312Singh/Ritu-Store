package com.ritustore.RituKiranaStore.repository;

import com.ritustore.RituKiranaStore.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Productrepository extends JpaRepository<Product,Long> {
    List<Product> findByCategoryId(Long categoryId);
}
