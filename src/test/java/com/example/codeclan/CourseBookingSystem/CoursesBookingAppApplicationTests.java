package com.example.codeclan.CourseBookingSystem;

import com.example.codeclan.CourseBookingSystem.models.Course;
import com.example.codeclan.CourseBookingSystem.repositories.IBookingRepository;
import com.example.codeclan.CourseBookingSystem.repositories.ICourseRepository;
import com.example.codeclan.CourseBookingSystem.repositories.ICustomerRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class CoursesBookingAppApplicationTests {

	@Autowired
	IBookingRepository iBookingRepository;

	@Autowired
	ICourseRepository iCourseRepository;

	@Autowired
	ICustomerRepository iCustomerRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void canFindCoursesByStarRating(){
		List<Course> foundCourse = iCourseRepository.findByStarRating(11);
		assertEquals("Css", foundCourse.get(0).getName());
	}

}
