package com.gtasterix.Employee.repository;

import com.gtasterix.Employee.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Employee , Integer> {
}
