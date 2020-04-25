package com.maraxai.firstapp.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.maraxai.firstapp.domain.Course;
import com.maraxai.firstapp.domain.Student;
import com.maraxai.firstapp.repositories.CourseRepository;
import com.maraxai.firstapp.repositories.StudentRepository;

@Component
public class BootStrapData implements CommandLineRunner {

  // set private fields
  private final StudentRepository studentRepository;
  private final CourseRepository courseRepository;

  // constructor 
  public BootStrapData(StudentRepository studentRepository, CourseRepository courseRepository) {
    this.studentRepository = studentRepository;
    this.courseRepository = courseRepository;
  }

  @Override
  public void run(String... args) throws Exception {

    Student bob = new Student("Bob", "Wild");
    Student gil = new Student("Gil", "Mess");
    Course oop = new Course( "CS202", "OOP", "Object-Oriented Programming");
    Course intro = new Course("SC101", "Intro", "Introduction to Computer Science");
    bob.getCourses().add(intro);
    bob.getCourses().add(oop);
    gil.getCourses().add(intro);
    gil.getCourses().add(oop);
    oop.getStudents().add(bob);
    oop.getStudents().add(gil);
    intro.getStudents().add(bob);
    intro.getStudents().add(fran);
    
    studentRepository.save(bob);
    studentRepository.save(gil);
    courseRepository.save(oop);
    courseRepository.save(intro);

    System.out.println("Number of Courses: " + courseRepository.count());
    System.out.println("Number of Students: " + studentRepository.count());
    
  }
}