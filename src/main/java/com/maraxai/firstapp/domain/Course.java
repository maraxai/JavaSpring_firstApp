package com.maraxai.firstapp.domain;

import java.util.Set;

public class Course {

  private Long id;
  private String courseId;
  private String course;
  private String courseTitle;
  private String courseDescription;
  /* delcare courses as an interface 'Set' of type 'Student'
     A set contains only unique values, no order guaranteed
  */
  private Set<Student> students;

  // empty constructor, needed for Hibernate to handle the JPA
  public Course() {
  }

  // constructor
  public Course(String course, String courseTitle, String courseDescription) {
    this.course = course;
    this.courseTitle = courseTitle;
    this.courseDescription = courseDescription;
  }

}