package tech.getarrays.employeemanager.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import net.bytebuddy.dynamic.DynamicType.Builder.FieldDefinition.Optional;
import tech.getarrays.employeemanager.model.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Long>{

    void deleteEmployeeById(Long id);

    Optional<Employee> findEmployeeById(Long id);
    
}
