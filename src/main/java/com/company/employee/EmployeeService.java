package com.company.employee;

import com.company.employee.models.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository repository;

    public List<Employee> getAllEmployees() {
        return repository.findAll();
    }

    public Employee saveEmployee(Employee employee) {
        return repository.save(employee);
    }

    public Employee getEmployeeById(Long id) {
        return repository.findById(id).orElse(null);
    }

    public String deleteEmployee(Long id) {
        if(repository.existsById(id)) {
            repository.deleteById(id);
            return "Employee Deleted Successfully";
        }
        return "Employee Not Found";
    }
    public Employee updateEmployee(Long id, Employee employee) {

        Employee existingEmployee =
                repository.findById(id).orElse(null);

        if (existingEmployee != null) {

            existingEmployee.setName(
                    employee.getName());

            existingEmployee.setEmail(
                    employee.getEmail());

            existingEmployee.setDepartment(
                    employee.getDepartment());

            existingEmployee.setSalary(
                    employee.getSalary());

            return repository.save(existingEmployee);
        }

        return null;
    }


}
