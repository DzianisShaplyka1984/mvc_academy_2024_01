package com.academy.mvc_academy.service;

import com.academy.mvc_academy.model.entity.Employee;
import java.util.List;

public interface EmployeeService {
  List<Employee> getAll();

  Employee getById(Integer id);

  void save(Employee employee);
}
