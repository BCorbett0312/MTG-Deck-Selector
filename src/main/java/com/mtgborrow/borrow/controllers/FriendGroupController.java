package com.mtgborrow.borrow.controllers;

import com.mtgborrow.borrow.dto.FriendGroupResponseDTO;
import com.mtgborrow.borrow.models.FriendGroup;
import com.mtgborrow.borrow.dto.FriendGroupDataDTO;
import com.mtgborrow.borrow.models.User;
import com.mtgborrow.borrow.services.FriendGroupService;
import com.mtgborrow.borrow.services.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

import java.util.HashSet;
import java.util.Set;


@RestController
@CrossOrigin
public class FriendGroupController {

    FriendGroupService friendGroupService;
    UserService userService;
    ModelMapper modelMapper;

    @Autowired
    FriendGroupController(FriendGroupService friendGroupService, UserService userService, ModelMapper modelMapper){
        this.friendGroupService = friendGroupService;
        this.userService = userService;
        this.modelMapper = modelMapper;
    }




    @PostMapping("/group")
    public void createNewGroup(HttpServletRequest req, @RequestBody FriendGroupDataDTO requestGroup){
        User user = userService.whoami(req);
        if(friendGroupService.getByName(requestGroup.getName()) == null) {
            user.getGroups().add(friendGroupService.convertDtoToFriendGroup(requestGroup));
            userService.save(user);
        }
    }

    @GetMapping("/group")
    @ResponseStatus(HttpStatus.OK)
    public Set<FriendGroupResponseDTO> getAllCards(HttpServletRequest req){
        Set <FriendGroup> toReturn = userService.whoami(req).getGroups();
        Set <FriendGroupResponseDTO> result = new HashSet<>();
        for (FriendGroup group: toReturn) {
            result.add(modelMapper.map(group, FriendGroupResponseDTO.class));
        }
        return result;
    }


}
