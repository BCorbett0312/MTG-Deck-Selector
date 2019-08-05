package com.mtgborrow.borrow.controllers;

import com.mtgborrow.borrow.models.FriendGroup;
import com.mtgborrow.borrow.models.RequestGroup;
import com.mtgborrow.borrow.services.FriendGroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@CrossOrigin
public class FriendGroupController {

    FriendGroupService friendGroupService;

    @Autowired
    FriendGroupController(FriendGroupService friendGroupService){
        this.friendGroupService = friendGroupService;
    }




    @PostMapping("/group/{id}")
    public FriendGroup createNewGroup(@RequestBody RequestGroup requestGroup, @PathVariable Long id){
        return this.friendGroupService.createNewGroup(id, requestGroup);
    }




}
