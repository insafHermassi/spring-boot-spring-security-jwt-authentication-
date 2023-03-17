package com.NST.springjwt.repository;

import java.util.Optional;

import com.NST.springjwt.models.ERole;
import com.NST.springjwt.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
  Optional<Role> findByName(ERole name);
}
