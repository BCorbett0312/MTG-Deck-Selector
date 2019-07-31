package com.mtgborrow.borrow.models;


public class RequestCard {

    private Long id;
    private String name;
    private Long multiverseId;
    private Boolean isReprint;


    public RequestCard() {
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

    public Boolean getReprint() {
        return isReprint;
    }

    public void setReprint(Boolean reprint) {
        isReprint = reprint;
    }
}
