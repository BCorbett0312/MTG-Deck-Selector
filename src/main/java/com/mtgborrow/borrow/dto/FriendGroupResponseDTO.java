package com.mtgborrow.borrow.dto;

import java.util.Set;

public class FriendGroupResponseDTO {

    private Long id;
    private String name;
    private Set<UserResponseDTO> users;

    FriendGroupResponseDTO(){

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<UserResponseDTO> getUsers() {
        return users;
    }

    public void setUsers(Set<UserResponseDTO> users) {
        this.users = users;
    }
}
