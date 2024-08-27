package com.lidis.springboot.thymeleafdemo.dao;

import com.lidis.springboot.thymeleafdemo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    // that's it ... no need to write any code LOL!

    // add method to sort by last name
    List<Employee> findAllByOrderByLastNameAsc();
}
