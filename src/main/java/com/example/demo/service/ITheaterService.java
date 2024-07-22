package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.entity.Showtime;
import com.example.demo.entity.Theater;

public interface  ITheaterService {

	List<Theater> findAll();
    Optional<Theater> findById(Integer id);
    Theater save(Theater theater);
    void deleteById(Integer id);
}
