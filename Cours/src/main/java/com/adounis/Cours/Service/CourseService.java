package com.adounis.Cours.Service;

import com.adounis.Cours.CourseRepository.CourseRepository;
import com.adounis.Cours.Model.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseService {

    @Autowired
    private CourseRepository  courseRepository;

    private static List<Course> courses = new ArrayList<>();
    private static long idCounter = 0;

    static {
        courses.add(new Course( null, "in28minutes", "Learn Full stack with Spring Boot and Angular"));
        courses.add(new Course(null, "in28minutes", "Learn Full stack with Spring Boot and React"));
        courses.add(new Course(null, "in28minutes", "Master Microservices with Spring Boot and Spring Cloud"));
        courses.add(new Course(null, "in28minutes",
                "Deploy Spring Boot Microservices to Cloud with Docker and Kubernetes"));
    }

    public void saveCourse(){
        courseRepository.saveAll(courses);
    }
    public List<Course> findAll() {
        return courseRepository.findAll();
    }

}
