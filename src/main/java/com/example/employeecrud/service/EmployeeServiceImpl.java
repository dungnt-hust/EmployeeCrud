package com.example.employeecrud.service;

import com.example.employeecrud.model.Employee;
import com.example.employeecrud.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements IEmployeeService{
    @Autowired
    private EmployeeRepository employeeRepository;
    public EmployeeServiceImpl() {
        super();
    }
    @Override
    public Employee addEmployee(Employee employee) {
        if(employee != null){
            return employeeRepository.save(employee);
        }
        return null;
    }

    @Override
    public Employee updateEmployee(Long id, Employee employee) {
        if(employee != null){
            Employee employee1 = employeeRepository.getById(id);

            employee1.setName(employee.getName());

            employee1.setAddress(employee.getAddress());

            return employeeRepository.save(employee1);
        }
        return null;
    }

    @Override
    public boolean deleteEmployee(Long id) {
        if(id >= 1){
            Employee employee = employeeRepository.getById(id);
            employeeRepository.delete(employee);
            return true;
        }
        return false;
    }

    @Override
    public List<Employee> getAllEmpoyee() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee getEmployee(Long id) {
        return employeeRepository.getById(id);
    }
}
