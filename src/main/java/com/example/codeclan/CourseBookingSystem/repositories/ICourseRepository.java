package com.example.codeclan.CourseBookingSystem.repositories;

import com.example.codeclan.CourseBookingSystem.models.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ICourseRepository extends JpaRepository<Course, Long> {

//    Get all courses with a given rating
    List<Course> findByStarRating(Integer starRating);

}
