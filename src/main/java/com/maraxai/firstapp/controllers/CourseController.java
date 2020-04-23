package com.maraxai.firstapp.controllers;

import com.maraxai.firstapp.repositories.CourseRepository;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CourseController {

  // create private constant of type CourseRepository
  private final CourseRepository courseRepository;

  // create a controller
  public CourseController(CourseRepository courseRepository) {
    this.courseRepository = courseRepository;
  }

  // annotate   
  @RequestMapping("/courses")
  public String getCourses(Model model) {
    model.addAttribute("courses", courseRepository.findAll());
    return "courses";
  }


}