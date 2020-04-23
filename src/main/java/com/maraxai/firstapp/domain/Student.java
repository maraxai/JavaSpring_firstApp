package com.maraxai.firstapp.domain;

import java.util.Set;

public class Student {

  // fields
  private Long id;
  private String firstName;
  private String lastName;
  /* delcare courses as an interface 'Set' of type 'Course'
     A set contains only unique values, no order guaranteed
  */
  private Set<Course> courses;

  // empty constructor, needed for Hibernate to handle the JPA
  public Student() {
  }

  // constructor
  public Student(String firstName, String lastName) {
    this.firstName = firstName;
    this.lastName = lastName;
  }

  // setters
  public void setId(Long id) {
    this.id = id;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  // getters
  public Long getId() {
    return id;
  }

  public String getFirstName() {
    return firstName;
  }

  public String getLastName() {
    return lastName;
  }


}