package com.mtgborrow.borrow.repositories;



import com.mtgborrow.borrow.models.UserCollection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;




@Repository
public interface CollectionRepository extends JpaRepository<UserCollection, Long> {




}
