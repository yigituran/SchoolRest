package edu.sabanciuniv.schoolrestproject.repository;

import edu.sabanciuniv.schoolrestproject.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {
}