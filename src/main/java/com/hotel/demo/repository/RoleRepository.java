package com.hotel.demo.repository;

import com.hotel.demo.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role,Long> {
    Optional<Role> findByName(String role);


    boolean existsByName(String role);
}
