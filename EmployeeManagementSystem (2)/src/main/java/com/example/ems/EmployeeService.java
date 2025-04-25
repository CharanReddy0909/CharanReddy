package com.example.ems;

import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class EmployeeService {
    private final EmployeeRepository repo;

    public EmployeeService(EmployeeRepository repo) {
        this.repo = repo;
    }

    public List<Employee> listAll() { return repo.findAll(); }
    public Employee save(Employee e) { return repo.save(e); }
    public void delete(Long id) { repo.deleteById(id); }
}