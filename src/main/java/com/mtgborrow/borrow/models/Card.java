package com.mtgborrow.borrow.models;




import javax.persistence.*;
import java.io.Serializable;


@Entity
public class Card implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Long multiverseId;





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

    public Long getMultiverseId() {
        return multiverseId;
    }

    public void setMultiverseId(Long multiverseId) {
        this.multiverseId = multiverseId;
    }



}
