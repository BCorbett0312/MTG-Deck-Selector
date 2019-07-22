package com.mtgborrow.borrow.Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CardInDatabase {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private Integer multiverseId;


    public CardInDatabase() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getMultiverseId() {
        return multiverseId;
    }

    public void setMultiverseId(Integer multiverseId) {
        this.multiverseId = multiverseId;
    }
}
