package com.mtgborrow.borrow.dto;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.mtgborrow.borrow.models.Card;

import java.util.List;
import java.util.Set;

public class UserResponseDTO {

  private Integer id;

  private String username;

  private String email;

  private List<CardDTO> cards;

  @JsonIgnoreProperties("users")
  private Set<FriendGroupResponseDTO> groups;



  public UserResponseDTO() {
  }

  public List<CardDTO> getCards() {
    return cards;
  }

  public void setCards(List<CardDTO> cards) {
    this.cards = cards;
  }

  public Set<FriendGroupResponseDTO> getGroups() {
    return groups;
  }

  public void setGroups(Set<FriendGroupResponseDTO> groups) {
    this.groups = groups;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }



}
