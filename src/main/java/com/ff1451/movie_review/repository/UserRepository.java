package com.ff1451.movie_review.repository;

import com.ff1451.movie_review.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email);
    boolean existsByEmail(String email);
    //Optional<User> findByEmailAndPassword(String email, String password);
}
