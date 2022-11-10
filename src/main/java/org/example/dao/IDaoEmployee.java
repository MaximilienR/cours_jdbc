package org.example.dao;

import org.example.domain.Employee;

import java.util.List;

public interface IDaoEmployee {
    Employee getEmployee(Integer id);
    List<Employee> getAllEmployee();
    //crud
    Integer create(Employee e);
    void delete(Employee e);
    void  update(Employee e);


}
