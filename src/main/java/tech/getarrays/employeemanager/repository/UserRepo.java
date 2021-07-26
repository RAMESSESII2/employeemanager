package tech.getarrays.employeemanager.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import tech.getarrays.employeemanager.model.User;

public interface  UserRepo extends JpaRepository<User, Long> {
    
}
