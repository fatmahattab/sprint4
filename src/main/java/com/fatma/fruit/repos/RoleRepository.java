package com.fatma.fruit.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fatma.fruit.entities.Role;


public interface RoleRepository extends JpaRepository<Role, Long> {

	Role findByRole(String role);
	
}
