package controller;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;
import model.Employee;
@RestController
public class EmployeeController 
{
   @RequestMapping("/")
    public List<Employee> getEmployees() 
    {
      List<Employee> employeesList = new ArrayList<Employee>();
      employeesList.add(new Employee(1,"yogesh","goel","xyz@gmail.com"));
      return employeesList;
    }
}
