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
import java.util.List;
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
        friendGroupService.createNewGroup(requestGroup, user);
    }

    @GetMapping("/group")
    @ResponseStatus(HttpStatus.OK)
    public Set<FriendGroupResponseDTO> getAllGroups(HttpServletRequest req){
        User user = userService.whoami(req);
        return friendGroupService.getAllGroups(user);
    }

    @PostMapping("/group/invite")
    @ResponseStatus(HttpStatus.OK)
    public void addUserToGroup(HttpServletRequest req, @RequestParam String groupName, @RequestParam String userName){
        User user = userService.whoami(req);
        friendGroupService.addUserToGroup(user, groupName, userName);
    }


}
