package com.example.employeecrud.service;

import com.example.employeecrud.model.Employee;

import java.util.List;

public interface IEmployeeService {
    //them moi nhan vien
    public Employee addEmployee(Employee employee);

    //chinh sua thong tin
    public Employee updateEmployee(Long id, Employee employee);

    //xoa nhan vien
    public boolean deleteEmployee(Long id);

    // lay ra danh sach
    public List<Employee> getAllEmpoyee();

    //lay thong tin 1 nhan vien
    public Employee getEmployee(Long id);
}
