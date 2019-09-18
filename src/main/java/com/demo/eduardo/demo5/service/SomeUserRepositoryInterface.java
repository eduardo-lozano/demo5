package com.demo.eduardo.demo5.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.eduardo.demo5.entity.SomeUser;

// This one is implemented automatically by Spring when you autowire it.
public interface SomeUserRepositoryInterface extends JpaRepository<SomeUser, Long> {	// You have to put the Entity type to use (SomeUser), and the type (Long) of the primary key of that Entity.
}
