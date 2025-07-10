package com.pessoal.webservices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pessoal.webservices.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
