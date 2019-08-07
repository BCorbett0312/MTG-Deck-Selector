package com.mtgborrow.borrow.services;

import com.mtgborrow.borrow.models.FriendGroup;
import com.mtgborrow.borrow.dto.FriendGroupDataDTO;
import com.mtgborrow.borrow.repositories.FriendGroupRepository;
import com.mtgborrow.borrow.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FriendGroupService {

    FriendGroupRepository friendGroupRepository;
    UserRepository userRepository;


    @Autowired
    FriendGroupService(FriendGroupRepository friendGroupRepository, UserRepository userRepository){
        this.friendGroupRepository = friendGroupRepository;
        this.userRepository = userRepository;
    }


    public FriendGroup convertDtoToFriendGroup(FriendGroupDataDTO group){
        FriendGroup toPersist = new FriendGroup();
        toPersist.setName(group.getName());
        return toPersist;
    }

    public FriendGroup getByName(String name){
        return friendGroupRepository.getByName(name);
    }










}
