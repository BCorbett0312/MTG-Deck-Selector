package com.mtgborrow.borrow.Repositories;

import com.mtgborrow.borrow.Models.CardInDatabase;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CardInDatabaseRepository extends JpaRepository<CardInDatabase, Integer> {


}
