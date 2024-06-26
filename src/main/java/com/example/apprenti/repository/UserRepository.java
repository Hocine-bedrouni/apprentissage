package com.example.apprenti.repository;

import com.example.apprenti.entity.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<AppUser, Long> {

    Optional<AppUser> findByName(String name);

    Optional<AppUser> findByFirstName(String firstName);

    Optional<AppUser> findById(Long userId);
}
