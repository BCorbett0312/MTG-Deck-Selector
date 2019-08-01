package com.mtgborrow.borrow.repositories;

import com.mtgborrow.borrow.models.PhysicalCard;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PhysicalCardRepository extends JpaRepository<PhysicalCard, Long> {
}
