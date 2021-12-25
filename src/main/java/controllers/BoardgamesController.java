package controllers;

import entities.Boardgames;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import services.BoardgamesService;

import java.util.List;

@Controller
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
