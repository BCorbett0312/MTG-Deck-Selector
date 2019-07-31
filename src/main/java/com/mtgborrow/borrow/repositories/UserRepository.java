package com.mtgborrow.borrow.repositories;

import com.mtgborrow.borrow.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    public User getById(Long id);

}
