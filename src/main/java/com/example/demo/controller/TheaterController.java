package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Theater;
import com.example.demo.service.ITheaterService;

@RestController
@RequestMapping("/api/theaters")
public class TheaterController {

	@Autowired
    private ITheaterService theaterService;

    @GetMapping("/alltheater")
    public List<Theater> getAllTheaters() {
        return theaterService.findAll();
    }

    @GetMapping("/theater/{id}")
    public ResponseEntity<Theater> getTheaterById(@PathVariable Integer id) {
        Optional<Theater> theater = theaterService.findById(id);
        return theater.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping("/addtheater")
    public Theater createTheater(@RequestBody Theater theater) {
        return theaterService.save(theater);
    }

    @PutMapping("/edittheater/{id}")
    public ResponseEntity<Theater> updateTheater(@PathVariable Integer id, @RequestBody Theater theaterDetails) {
        Optional<Theater> theater = theaterService.findById(id);
        if (theater.isPresent()) {
            Theater existingTheater = theater.get();
            existingTheater.setName(theaterDetails.getName());
            existingTheater.setLocation(theaterDetails.getLocation());
            existingTheater.setCapacity(theaterDetails.getCapacity());
            return ResponseEntity.ok(theaterService.save(existingTheater));
        }
        return ResponseEntity.notFound().build();
    }

    @DeleteMapping("/deletetheater/{id}")
    public ResponseEntity<Void> deleteTheater(@PathVariable Integer id) {
        theaterService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
