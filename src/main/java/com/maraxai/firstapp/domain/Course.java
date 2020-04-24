package com.maraxai.firstapp.domain;

import java.util.HashSet;
import java.util.Set;

public class Course {

  // declare fields
  private Long id;
  private String course;
  private String courseTitle;
  private String courseDescription;
  
  // create a Hashset and assign it to the field courses with the interface 'Set' of type 'Course'
    private Set<Student> students = new HashSet<>();

    
  /*
    CONSTRUCTORS, we use constructor overloading
  */

  // empty constructor, needed for Hibernate to handle the JPA
  public Course() { }

  // constructor
  public Course(String course, String courseTitle, String courseDescription) {
    this.course = course;
    this.courseTitle = courseTitle;
    this.courseDescription = courseDescription;
  }

  /*
    SETTERS/MUTATORS
  */
  public void setId(Long id) {
    this.id = id;
  }

  public void setCourse(String course) {
    this.course = course;
  }

  public void setCourseTitle(String courseTitle) {
    this.courseTitle = courseTitle;
  }

  public void setCourseDescription(String courseDescription) {
    this.courseDescription = courseDescription;
  }

  public void setStudents(Set<Student> students) {
    this.students = students;
  }

  /*
    GETTERS/ACCESSORS
  */
  public Long getId() {
    return id;
  }

  public String getCourse() {
    return course;
  }

  public String getCourseTitle() {
    return courseTitle;
  }

  public String getCourseDescription() {
    return courseDescription;
  }

  public Set<Student> getStudents() {
    return students;
  }

}