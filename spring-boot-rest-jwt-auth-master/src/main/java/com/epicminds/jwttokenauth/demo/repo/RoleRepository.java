package com.epicminds.jwttokenauth.demo.repo;

import com.epicminds.jwttokenauth.demo.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
	Role findByName(String name);
}
