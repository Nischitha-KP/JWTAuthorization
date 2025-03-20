package com.example.JPAAuthentication.repository;

import com.example.JPAAuthentication.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByRolename(String rolename);
}
