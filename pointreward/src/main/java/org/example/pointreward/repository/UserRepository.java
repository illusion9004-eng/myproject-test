package org.example.pointreward.repository;

import org.example.pointreward.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    // username 중복 확인 findByUsername
    Optional<User> findByUsername(String username);

    // username 중복 확인existsByUsername
    boolean existsByUsername(String username);

}


