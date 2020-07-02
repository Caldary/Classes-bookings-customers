package com.example.codeclan.CourseBookingSystem.components;

import com.example.codeclan.CourseBookingSystem.models.Booking;
import com.example.codeclan.CourseBookingSystem.models.Course;
import com.example.codeclan.CourseBookingSystem.models.Customer;
import com.example.codeclan.CourseBookingSystem.repositories.IBookingRepository;
import com.example.codeclan.CourseBookingSystem.repositories.ICourseRepository;
import com.example.codeclan.CourseBookingSystem.repositories.ICustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {
    @Autowired
    IBookingRepository iBookingRepository;

    @Autowired
    ICustomerRepository iCustomerRepository;

    @Autowired
    ICourseRepository iCourseRepository;

    public DataLoader(){
    }

    @Override
    public void run(ApplicationArguments args) {

        Course course1 = new Course("Java", "Edinburgh", 5);
        iCourseRepository.save(course1);

        Course course2 = new Course("Ruby", "Glasgow", 1);
        iCourseRepository.save(course2);

        Course course3 = new Course("JavaScript", "Inverness", 3);
        iCourseRepository.save(course3);

        Course course4 = new Course("Python", "Edinburgh", 4);
        iCourseRepository.save(course4);
        Course course5 = new Course("Php", "London", 3);
        iCourseRepository.save(course5);

        Course course6 = new Course("Css", "Aberdeen", 11);
        iCourseRepository.save(course6);

        Customer customer1 = new Customer("Alan", "Edinburgh", 31);
        iCustomerRepository.save(customer1);
        Customer customer2 = new Customer("Paulo", "Joburg", 32);
        iCustomerRepository.save(customer2);

        Customer customer3 = new Customer("Iron Man", "New York", 45);
        iCustomerRepository.save(customer3);

        Booking booking1 = new Booking("January", customer1, course1);
        iBookingRepository.save(booking1);

        Booking booking2 = new Booking("April", customer1, course2);
        iBookingRepository.save(booking2);

        Booking booking3 = new Booking("June", customer2, course2);
        iBookingRepository.save(booking3);

        Booking booking4 = new Booking("July", customer3, course3);
        iBookingRepository.save(booking4);

        Booking booking5 = new Booking("January", customer3, course5);
        iBookingRepository.save(booking5);


    }
}
