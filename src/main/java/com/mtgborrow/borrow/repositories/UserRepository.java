package com.mtgborrow.borrow.repositories;

import com.mtgborrow.borrow.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User getById(Long id);
    User findByUsername(String username);
    boolean existsByUsername(String username);
}











