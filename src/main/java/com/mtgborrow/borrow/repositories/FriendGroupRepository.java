package com.mtgborrow.borrow.repositories;

import com.mtgborrow.borrow.models.FriendGroup;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface FriendGroupRepository extends JpaRepository <FriendGroup, Long> {
    FriendGroup getByName(String name);

}
