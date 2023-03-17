package edu.sabanciuniv.schoolrestproject.controller;

import edu.sabanciuniv.schoolrestproject.model.Proffessor;
import edu.sabanciuniv.schoolrestproject.repository.ProffessorRepository;
import edu.sabanciuniv.schoolrestproject.service.ProffessorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/proffessors")
public class ProffessorController {

    @Autowired
    private ProffessorService proffessorService;
    @PostMapping
    public ResponseEntity<Proffessor> createProffessor(@RequestBody Proffessor proffessor) {
        Proffessor savedProffessor = proffessorService.save(proffessor);
        return new ResponseEntity<>(savedProffessor, HttpStatus.CREATED);
    }
    @GetMapping
    public List<Proffessor> getAllProffessors() {
        return proffessorService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Proffessor> getProffessorById(@PathVariable Long id) {
        Optional<Proffessor> proffessor = proffessorService.findById(id);
        return proffessor.map(value -> new ResponseEntity<>(value, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Proffessor> updateProffessor(@PathVariable Long id, @RequestBody Proffessor proffessor) {
        Optional<Proffessor> existingProffessor = proffessorService.findById(id);
        if (existingProffessor.isPresent()) {
            proffessor.setId(id);
            proffessorService.update(proffessor);
            return new ResponseEntity<>(proffessor, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteProffessorById(@PathVariable Long id) {
        Optional<Proffessor> instructor = proffessorService.findById(id);
        if (instructor.isPresent()) {
            proffessorService.deleteById(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }


}
