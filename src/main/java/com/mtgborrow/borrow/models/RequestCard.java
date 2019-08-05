package com.mtgborrow.borrow.models;


public class RequestCard {

    private Long id;
    private String name;
    private String scryfallId;
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

    public String getScryfallId() {
        return scryfallId;
    }

    public void setScryfallId(String scryfallId) {
        this.scryfallId = scryfallId;
    }

    public Boolean getReprint() {
        return isReprint;
    }

    public void setReprint(Boolean reprint) {
        isReprint = reprint;
    }
}
