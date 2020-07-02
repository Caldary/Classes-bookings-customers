package com.example.codeclan.CourseBookingSystem.controllers;

import com.example.codeclan.CourseBookingSystem.models.Course;
import com.example.codeclan.CourseBookingSystem.models.Customer;
import com.example.codeclan.CourseBookingSystem.repositories.ICourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CourseController {

    @Autowired
    ICourseRepository iCourseRepository;

    @GetMapping(value ="/courses")
    public ResponseEntity<List<Course>> findCoursesByStarRating(
            @RequestParam(name = "starRating", required = false) Integer starRating)
    {
        // Get by star rating
        if (starRating != null) {
            return new ResponseEntity<>(iCourseRepository.findByStarRating(starRating), HttpStatus.OK);
        }
        //  Get courses
            return new ResponseEntity<>(iCourseRepository.findAll(), HttpStatus.OK);
    }

}
