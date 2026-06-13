package com.example.MovieDekho.controller;

import com.example.MovieDekho.entity.Show;
import com.example.MovieDekho.service.ShowService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/shows")
@RequiredArgsConstructor
public class ShowController {
    private final ShowService showService;

    @PostMapping("/post")
    public ResponseEntity<Show> addShow( @RequestBody Show show){
        return ResponseEntity.ok(showService.addShow(show));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Show> getShowById(@PathVariable Long id){
        return ResponseEntity.ok(showService.getShowById(id));
    }

    @GetMapping
    public ResponseEntity<List<Show>> getAllShow(){
        return ResponseEntity.ok(showService.getAllShow());
    }






}
