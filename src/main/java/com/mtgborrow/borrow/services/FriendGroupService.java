package com.mtgborrow.borrow.services;

import com.mtgborrow.borrow.dto.FriendGroupResponseDTO;
import com.mtgborrow.borrow.models.FriendGroup;
import com.mtgborrow.borrow.dto.FriendGroupDataDTO;
import com.mtgborrow.borrow.models.User;
import com.mtgborrow.borrow.repositories.FriendGroupRepository;
import com.mtgborrow.borrow.repositories.UserRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class FriendGroupService {

    FriendGroupRepository friendGroupRepository;
    UserRepository userRepository;
    ModelMapper modelMapper;


    @Autowired
    FriendGroupService(FriendGroupRepository friendGroupRepository, UserRepository userRepository, ModelMapper modelMapper){
        this.friendGroupRepository = friendGroupRepository;
        this.userRepository = userRepository;
        this.modelMapper = modelMapper;
    }


    public void createNewGroup(FriendGroupDataDTO requestGroup, User user){
        if(friendGroupRepository.getByName(requestGroup.getName()) == null){
            user.getGroups().add(modelMapper.map(requestGroup, FriendGroup.class));
            userRepository.save(user);
        }

    }

    public Set<FriendGroupResponseDTO> getAllGroups(User user){
        Set<FriendGroup> toConvert = user.getGroups();
        Set<FriendGroupResponseDTO> result = new HashSet<>();
        for(FriendGroup group: toConvert){
            result.add(modelMapper.map(group, FriendGroupResponseDTO.class));
        }
        return result;
    }






}
