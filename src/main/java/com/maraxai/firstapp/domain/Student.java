package com.maraxai.firstapp.domain;

import java.util.Set;

public class Student {

  // fields
  private Long id;
  private String firstName;
  private String lastName;

  //declare courses as an interface 'Set' of type 'Course'
  private Set<Course> courses;

  /*
    CONSTRUCTORS, we use constructor overloading
  */

  // empty constructor, needed for Hibernate to handle the JPA
  public Student() {
  }

  // constructor
  public Student(String firstName, String lastName) {
    this.firstName = firstName;
    this.lastName = lastName;
  }

  /*
    SETTERS
  */
  public void setId(Long id) {
    this.id = id;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public void setCourses(Set<Course> courses) {
    this.courses = courses;
  }

  /*
    GETTERS
  */
  public Long getId() {
    return id;
  }

  public String getFirstName() {
    return firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public Set<Course> getCourses() {
    return courses;
  }


}