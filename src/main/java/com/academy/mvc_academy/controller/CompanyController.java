package com.academy.mvc_academy.controller;

import com.academy.mvc_academy.model.entity.Employee;
import com.academy.mvc_academy.service.EmployeeService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequiredArgsConstructor
public class CompanyController {
  private final EmployeeService employeeService;

  @GetMapping(value = "/employees")
  public String getAll(Model model) {
    List<Employee> employees = employeeService.getAll();
    model.addAttribute("employees", employees);

    return "employee";
  }

  @GetMapping(value = "/employee")
  public String getEmployee(@RequestParam Integer id, Model model) {
    Employee employee = employeeService.getById(id);
    model.addAttribute("employee", employee);
    return "employeeDetails";
  }
}
