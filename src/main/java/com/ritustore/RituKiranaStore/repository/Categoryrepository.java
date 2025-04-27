package com.ritustore.RituKiranaStore.repository;

import com.ritustore.RituKiranaStore.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Categoryrepository extends JpaRepository<Category,Long> {
}
