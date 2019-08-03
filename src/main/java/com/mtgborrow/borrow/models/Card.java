package com.mtgborrow.borrow.models;




import com.mtgborrow.borrow.datatypes.Condition;

import javax.persistence.*;
import java.io.Serializable;


@Entity
public class Card implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    private String scryfallId;

    @Enumerated(EnumType.STRING)
    @Column(name = "card_condition")
    private Condition condition;


    public Card() {
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

    public Condition getCondition() {
        return condition;
    }

    public void setCondition(Condition condition) {
        this.condition = condition;
    }

    public String getScryfallId() {
        return scryfallId;
    }

    public void setScryfallId(String scryfallId) {
        this.scryfallId = scryfallId;
    }



}
