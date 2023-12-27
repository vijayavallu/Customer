package com.example.MyProject.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.MyProject.Model.customer;

public interface ProductRepository extends JpaRepository<customer,Integer> {

}
