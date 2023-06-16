package com.graccasoft.redkokia.repository;

import com.graccasoft.redkokia.model.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    List<Employee> findAllByTenant_Id(Long tenantId);
    long countAllByTenant_Id(Long tenantId);
}