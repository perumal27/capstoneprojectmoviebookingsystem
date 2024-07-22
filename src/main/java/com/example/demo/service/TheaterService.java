package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Theater;
import com.example.demo.repo.TheaterRepository;

@Service
public class TheaterService implements ITheaterService  {
	    @Autowired
	    private TheaterRepository theaterRepository;

	    @Override
	    public List<Theater> findAll() {
	        return theaterRepository.findAll();
	    }

	    @Override
	    public Optional<Theater> findById(Integer id) {
	        return theaterRepository.findById(id);
	    }

	    @Override
	    public Theater save(Theater theater) {
	        return theaterRepository.save(theater);
	    }

	    @Override
	    public void deleteById(Integer id) {
	        theaterRepository.deleteById(id);
	    }
}
