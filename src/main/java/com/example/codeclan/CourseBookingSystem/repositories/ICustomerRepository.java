package com.example.codeclan.CourseBookingSystem.repositories;

import com.example.codeclan.CourseBookingSystem.models.Course;
import com.example.codeclan.CourseBookingSystem.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ICustomerRepository extends JpaRepository<Customer, Long> {

//    List<Customer> findCustomersByBookingsIdAndCourse(Long id, Course course);
}
