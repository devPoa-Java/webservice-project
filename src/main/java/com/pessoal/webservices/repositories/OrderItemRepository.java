package com.pessoal.webservices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pessoal.webservices.entities.OrderItem;
import com.pessoal.webservices.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK>{

}
