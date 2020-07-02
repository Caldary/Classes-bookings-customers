package com.example.codeclan.CourseBookingSystem.components;

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
    IBookingRepository bookingRepository;

    @Autowired
    ICustomerRepository customerRepository;

    @Autowired
    ICourseRepository courseRepository;

    public DataLoader(){
    }

    @Override
    public void run(ApplicationArguments args) {

        Customer customer1 = new Customer("Alan", "Edinburgh", 31);
        customerRepository.save(customer1);

        Customer customer2 = new Customer("Paulo", "Joburg", 32);
        customerRepository.save(customer2);

        Customer customer3 = new Customer("Iron Man", "New York", 45);
        customerRepository.save(customer1);
    }
}
