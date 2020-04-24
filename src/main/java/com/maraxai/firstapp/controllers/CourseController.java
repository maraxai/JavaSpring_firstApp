package com.maraxai.firstapp.controllers;

import com.maraxai.firstapp.repositories.CourseRepository;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CourseController {

  // create private constant of type CourseRepository
  private final CourseRepository courseRepository;

  // constructor, inject courseRepository into controller
  public CourseController(CourseRepository courseRepository) {
    this.courseRepository = courseRepository;
  }

  // map the method getCourses() to the URI '/courses' with the annotation @RequestMapping  
  @RequestMapping("/courses")
  public String getCourses(Model model) {
    model.addAttribute("courses", courseRepository.findAll());
    return "courses";
  }


}