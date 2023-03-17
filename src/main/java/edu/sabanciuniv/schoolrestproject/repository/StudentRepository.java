package edu.sabanciuniv.schoolrestproject.repository;
import edu.sabanciuniv.schoolrestproject.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
}