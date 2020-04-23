package com.maraxai.firstapp.repositories;

import com.maraxai.firstapp.domain.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student, Long>{
}