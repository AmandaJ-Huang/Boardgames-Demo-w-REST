package com.bgg.xmlapi.demo.controllers;

import com.bgg.xmlapi.demo.entities.Boardgames;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.bgg.xmlapi.demo.services.BoardgamesService;

import java.util.List;

@RestController
public class BoardgamesController {
    private BoardgamesService service;

    @Autowired
    public BoardgamesController(BoardgamesService service) {
        this.service = service;
    }

    @RequestMapping (value = "/create", method = RequestMethod.POST)
    public ResponseEntity<Boardgames> create(@RequestBody Boardgames bg) {
        return new ResponseEntity<>(service.create(bg), HttpStatus.CREATED);
    }

    @RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
    public ResponseEntity<Boardgames> findById(@PathVariable Long id) {
        return new ResponseEntity<>(service.findById(id), HttpStatus.OK);
    }

    @RequestMapping(value = "/getAll", method = RequestMethod.GET)
    public ResponseEntity<List<Boardgames>> findAll() {
        return new ResponseEntity<>(service.findAll(), HttpStatus.OK);
    }

    @RequestMapping(value = "/update/{id}", method = RequestMethod.PUT)
    public ResponseEntity<Boardgames> updateById(@PathVariable Long id, @RequestBody Boardgames newBGData) {
        return new ResponseEntity<>(service.update(id, newBGData), HttpStatus.OK);
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<Boardgames> deleteById(@PathVariable Long id) {
        return new ResponseEntity<>(service.deleteById(id), HttpStatus.OK);
    }
}
