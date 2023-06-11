package com.dispositivi.aziendali.project.sicurezza.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dispositivi.aziendali.project.sicurezza.entity.ERole;
import com.dispositivi.aziendali.project.sicurezza.entity.Role;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {
    
	Optional<Role> findByRoleName(ERole roleName);

}
