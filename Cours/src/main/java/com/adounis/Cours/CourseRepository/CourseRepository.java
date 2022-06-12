package com.adounis.Cours.CourseRepository;

import com.adounis.Cours.Model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository  extends JpaRepository <Course, Long> {

}
