package com.academy.mvc_academy.service.impl;

import com.academy.mvc_academy.model.entity.Employee;
import com.academy.mvc_academy.model.repository.EmployeeRepository;
import com.academy.mvc_academy.service.EmployeeService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {
  private final EmployeeRepository employeeRepository;
  @Override
  public List<Employee> getAll() {
    return employeeRepository.findAll();
  }

  @Override
  public Employee getById(Integer id) {
    return employeeRepository.getReferenceById(id);
  }

  @Override
  public void save(Employee employee) {
    employeeRepository.save(employee);
  }
}
