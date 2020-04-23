package com.maraxai.firstapp.repositories;

import com.maraxai.firstapp.domain.Course;
import org.springframework.data.repository.CrudRepository;

public interface CourseRepository extends CrudRepository<Course, Long> {
}