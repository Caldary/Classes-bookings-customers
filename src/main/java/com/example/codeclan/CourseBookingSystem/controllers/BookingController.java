package com.example.codeclan.CourseBookingSystem.controllers;

import com.example.codeclan.CourseBookingSystem.models.Booking;
import com.example.codeclan.CourseBookingSystem.models.Course;
import com.example.codeclan.CourseBookingSystem.repositories.IBookingRepository;
import com.example.codeclan.CourseBookingSystem.repositories.ICourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookingController {

    @Autowired
    IBookingRepository bookingRepository;

    @GetMapping(value ="/bookings")
    public ResponseEntity<List<Booking>> getAllBookings(){
        return new ResponseEntity<>(bookingRepository.findAll(), HttpStatus.OK);
    }

}
