package com.mtgborrow.borrow.services;

import com.mtgborrow.borrow.models.FriendGroup;
import com.mtgborrow.borrow.dto.FriendGroupDTO;
import com.mtgborrow.borrow.models.User;
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


    public FriendGroup createNewGroup(Long id, FriendGroupDTO group){
        FriendGroup newGroup = new FriendGroup();
        User toSave = userRepository.getById(id);
        newGroup.setName(group.getName());
        newGroup.getUsers().add(toSave);
        toSave.getGroups().add(newGroup);
        userRepository.save(toSave);

        return friendGroupRepository.save(newGroup);

    }










}
