package com.phoenix.expense.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.phoenix.expense.model.Category;

public interface CategoryRepository  extends JpaRepository<Category, Long>{
	Category findByName(String name);
}
