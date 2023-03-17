package edu.sabanciuniv.schoolrestproject.repository;

import edu.sabanciuniv.schoolrestproject.model.Proffessor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProffessorRepository extends JpaRepository<Proffessor, Long> {
}