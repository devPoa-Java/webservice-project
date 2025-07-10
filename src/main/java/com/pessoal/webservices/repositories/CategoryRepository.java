package com.pessoal.webservices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pessoal.webservices.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
