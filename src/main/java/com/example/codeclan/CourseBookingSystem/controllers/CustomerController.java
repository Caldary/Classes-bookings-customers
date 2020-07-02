package com.example.codeclan.CourseBookingSystem.controllers;

import com.example.codeclan.CourseBookingSystem.models.Customer;
import com.example.codeclan.CourseBookingSystem.repositories.ICustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CustomerController {

    @Autowired
    ICustomerRepository iCustomerRepository;

    @GetMapping(value ="/customers")
    public ResponseEntity<List<Customer>> getAllCustomersByBookingsCourseId(
            @RequestParam(name = "course_id", required = false)Long course_id){
        if (course_id != null){
            return new ResponseEntity<>(iCustomerRepository.findCustomersByBookingsCourseId(course_id), HttpStatus.OK);
        }
        return new ResponseEntity<>(iCustomerRepository.findAll(), HttpStatus.OK);
    }




}
