package com.example.codeclan.CourseBookingSystem;

import com.example.codeclan.CourseBookingSystem.repositories.IBookingRepository;
import com.example.codeclan.CourseBookingSystem.repositories.ICourseRepository;
import com.example.codeclan.CourseBookingSystem.repositories.ICustomerRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CoursesBookingAppApplicationTests {

	@Autowired
	IBookingRepository bookingRepository;

	@Autowired
	ICourseRepository courseRepository;

	@Autowired
	ICustomerRepository customerRepository;

	@Test
	void contextLoads() {
	}

}
