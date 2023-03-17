package edu.sabanciuniv.schoolrestproject.service;

import edu.sabanciuniv.schoolrestproject.model.Proffessor;
import edu.sabanciuniv.schoolrestproject.repository.ProffessorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class ProffessorService {


    @Autowired
    private ProffessorRepository ProffessorRepository;

    public Proffessor save(Proffessor instructor) {
        return ProffessorRepository.save(instructor);
    }

    public List<Proffessor> findAll() {
        return ProffessorRepository.findAll();
    }

    public Optional<Proffessor> findById(Long id) {
        return ProffessorRepository.findById(id);
    }

    public void update(Proffessor instructor) {
        ProffessorRepository.save(instructor);
    }

    public void deleteById(Long id) {
        ProffessorRepository.deleteById(id);
    }

}


