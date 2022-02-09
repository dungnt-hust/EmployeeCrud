package com.example.employeecrud.controller;

import com.example.employeecrud.model.Employee;
import com.example.employeecrud.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    private IEmployeeService iEmployeeService;
    //Test
    @GetMapping("/")
    public String test(){
        return "timeday";
    }


    //API add
    @PostMapping("/add")
    public Employee addEmployee(@RequestBody Employee employee){
        return iEmployeeService.addEmployee(employee);
    }

    //API update
    @PostMapping("/update")
    public Employee updateEmployee(@RequestParam("id") Long id, @RequestBody Employee employee){
        return iEmployeeService.updateEmployee(id, employee);
    }

    //API delete
    @DeleteMapping("/delete/{id}")
    public boolean deleteEmployee(@PathVariable("id") Long id){
        return iEmployeeService.deleteEmployee(id);
    }

    //API LIST
    @GetMapping("/list")
    public List<Employee> getAllEmployee(){
        return iEmployeeService.getAllEmpoyee();
    }
}
