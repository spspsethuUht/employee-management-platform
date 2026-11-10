package com.company.employee;

import com.company.employee.models.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    EmployeeService service;

    @PostMapping
    public Employee addEmployee(@RequestBody Employee employee) {

        return service.saveEmployee(employee);

    }

    @GetMapping("/{id}")
    public Employee getEmployeeById(@PathVariable Long id) {

        return service.getEmployeeById(id);

    }

    @GetMapping
    public List<Employee> getEmployees() {
        return service.getAllEmployees();
    }

    @PutMapping("/{id}")
    public Employee updateEmployee(
            @PathVariable Long id,
            @RequestBody Employee employee) {
            return service.updateEmployee(id, employee);
    }

    @DeleteMapping("/{id}")
    public String deleteEmployee(@PathVariable Long id) {
        service.deleteEmployee(id);
        return "Employee Deleted";
    }
}
