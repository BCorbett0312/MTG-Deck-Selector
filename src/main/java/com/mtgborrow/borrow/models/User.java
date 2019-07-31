package com.mtgborrow.borrow.models;




import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;


@Entity
@Table(name = "user")
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Long id;


    @NotNull
    @Size(max = 50)
    @Column(name = "password")
    private String password;


    @NotNull
    @Size(max = 50)
    @Column(name = "username")
    private String username;

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "owner")
    @JsonManagedReference
    private UserCollection userCollection;


    public User() {
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public UserCollection getUserCollection() {
        return userCollection;
    }

    public void setUserCollection(UserCollection userCollection) {
        this.userCollection = userCollection;
    }


}
