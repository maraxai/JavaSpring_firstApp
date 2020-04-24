package com.maraxai.firstapp.controllers;

import com.maraxai.firstapp.repositories.StudentRepository;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StudentController {

  // create private constant of type StudentRepository
  private final StudentRepository studentRepository;

  // constructor, inject studentRepository into controller
  public StudentController(StudentRepository studentRepository) {
    this.studentRepository = studentRepository;
  }

  // map the method getStudents to the URI /students with the annotation @RequestMapping
  @RequestMapping("/students")
  public String getStudents(Model model) {
    model.addAttribute("students", studentRepository.findAll());
    return "students";
  }


}