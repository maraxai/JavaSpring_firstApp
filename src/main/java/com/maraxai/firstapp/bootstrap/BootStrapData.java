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
    Student fran = new Student("Fran", "Troy");
    Course oop = new Course( "CS202", "OOP", "Object-Oriented Programming");
    Course intro = new Course("SC101", "Intro", "Introduction to Computer Science");
    bob.getCourses().add(oop);
    bob.getCourses().add(intro);
    gil.getCourses().add(intro);
    oop.getStudents().add(bob);
    intro.getStudents().add(gil);
    intro.getStudents().add(bob);
    
    studentRepository.save(bob);
    studentRepository.save(gil);
    courseRepository.save(oop);
    courseRepository.save(intro);

    

    System.out.println("Started in Bootstrap");
    System.out.println("Number of Courses: " + courseRepository.count());
    System.out.println("Number of Students: " + studentRepository.count());
    
  }
}