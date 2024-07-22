package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Theater;

public interface TheaterRepository extends JpaRepository<Theater, Integer> {

}
