package com.maraxai.firstapp.domain;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

// declare this for Hibernate as an entity by annotating it with @Entity
@Entity
public class Course {

  // make this persistence field the primary key of the entity with the annotation @Id
  // @generatedValue declares this field as a value that is generated by the database
  @Id 
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;
  
  private String course;
  private String courseTitle;
  private String courseDescription;
  /* 
    create a HashSet and assign it to the property courses with the interface 'Set' of type 'Student'
    inform Hibernate about the Many-to-Many relationship through the annotation
    create a join table with the foreign keys of ids
  */
  @ManyToMany
  @JoinTable(
    name="student_course",
    joinColumns= @JoinColumn(name="student_id"), 
    inverseJoinColumns = @JoinColumn(name="course_id"))
  private Set<Student> students = new HashSet<>();

  /*
    CONSTRUCTORS
  */
  // empty constructor, needed for Hibernate to handle the JPA
  public Course() {
  }

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

  // Override the methods equals(), hashCode() and toString()
  @Override
  public int hashCode() {
    return id != null ? id.hashCode() : 0;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    Course course = (Course) o;

    return id != null ? id.equals(course.id) : course.id == null;
  }

  @Override
  public String toString() {
    return "Course{" +
      "id=" + id +
      ", course=' " + course + "\' " +
      ", courseTitle=' " + courseTitle + "\' " +
      ", courseDescription=' " + courseDescription + "\' " +
    '}';
  }

}