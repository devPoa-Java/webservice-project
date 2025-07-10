package com.pessoal.webservices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pessoal.webservices.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
