package com.fatma.fruit.repos;


import org.springframework.data.jpa.repository.JpaRepository;

import com.fatma.fruit.entities.User;


public interface UserRepository extends JpaRepository<User, Long> {

		User findByUsername(String username);

}
