package edu.sabanciuniv.schoolrestproject.initializer;

import edu.sabanciuniv.schoolrestproject.model.Course;
import edu.sabanciuniv.schoolrestproject.model.Proffessor;
import edu.sabanciuniv.schoolrestproject.repository.CourseRepository;
import edu.sabanciuniv.schoolrestproject.repository.ProffessorRepository;
import edu.sabanciuniv.schoolrestproject.repository.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class TestDataInitializer implements CommandLineRunner {

    private CourseRepository courseRepository;
    private ProffessorRepository proffessorRepository;
    private StudentRepository studentRepository;

    public TestDataInitializer(CourseRepository courseRepository, ProffessorRepository proffessorRepository, StudentRepository studentRepository) {
        this.courseRepository = courseRepository;
        this.proffessorRepository = proffessorRepository;
        this.studentRepository = studentRepository;
    }

    @Override
    @Transactional
    public void run(String... args) throws Exception {

        Proffessor proffessor1 = new Proffessor("Alastor", "Moody", "alastor.moody@hogwarts.edu");
        Proffessor proffessor2 = new Proffessor("Severus", "Snape", "severus.snape@hogwarts.edu");
        Proffessor proffessor3 = new Proffessor("Filius", "Flitwick", "filius.flitwick@hogwarts.edu");

        Course course1 = new Course("Defence Against the Dark Arts", proffessor1);
        Course course2 = new Course("Potions", proffessor2);
        Course course3 = new Course("Charms", proffessor3);
        Course course4 = new Course("Dark Arts", proffessor1);

        proffessorRepository.save(proffessor1);
        proffessorRepository.save(proffessor2);
        proffessorRepository.save(proffessor3);

        courseRepository.save(course1);
        courseRepository.save(course2);
        courseRepository.save(course3);
        courseRepository.save(course4);



    }
}
