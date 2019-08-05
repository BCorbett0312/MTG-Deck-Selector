package com.mtgborrow.borrow.repositories;

import com.mtgborrow.borrow.models.Card;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CardRepository extends JpaRepository<Card, Long> {


}
