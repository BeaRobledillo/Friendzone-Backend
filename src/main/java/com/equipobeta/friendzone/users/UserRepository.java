package com.equipobeta.friendzone.users;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository <User, Long> {
    Optional<User> findByUsername(String username);
    // Optional<User> findById(Long Id);
    Boolean existsByUsername(String username);
    Boolean existsByEmail(String email);
    User getByUsername (String username);
}

