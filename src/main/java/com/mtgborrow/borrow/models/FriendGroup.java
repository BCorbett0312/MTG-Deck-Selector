package com.mtgborrow.borrow.models;

import javax.persistence.*;


import java.util.HashSet;

import java.util.Set;


@Entity
public class FriendGroup {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "friend_group_id")
    private Long id;
    private String name;
//    private Set<User> members = new HashSet<>();



    public FriendGroup() {
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
}
