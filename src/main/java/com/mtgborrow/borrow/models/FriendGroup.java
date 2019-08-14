package com.mtgborrow.borrow.models;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import javax.persistence.*;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;


@Entity
public class FriendGroup {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "friend_group_id", unique = true, length = 100)
    private Long id;
    private String name;


    @ManyToMany(fetch = FetchType.LAZY,
                cascade = {CascadeType.PERSIST,
                CascadeType.MERGE},
                mappedBy = "groups")
    @JsonIgnoreProperties("groups")
    private Set<User> users = new TreeSet<>(Comparator.comparing(User::getUsername));






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

    public Set<User> getUsers() {
        return users;
    }

    public void setUsers(Set<User> users) {
        this.users = users;
    }
}
