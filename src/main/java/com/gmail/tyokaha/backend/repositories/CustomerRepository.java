package com.gmail.tyokaha.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gmail.tyokaha.backend.data.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
