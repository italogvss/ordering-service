package com.italogvss.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.italogvss.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

	
}
