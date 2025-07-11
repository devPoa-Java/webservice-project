package com.pessoal.webservices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pessoal.webservices.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
