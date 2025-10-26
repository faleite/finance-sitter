package com.faleite.finance_sitter.repository;

import com.faleite.finance_sitter.model.User;
import jakarta.validation.constraints.NotEmpty;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    Optional<UserDetails> findUsersByEmail(String username);
    boolean existsByEmail(@NotEmpty(message = "Email is required") String email);
}
