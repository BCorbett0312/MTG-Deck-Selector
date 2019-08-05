package com.mtgborrow.borrow.datatypes;

public enum  Condition {
    NM("Near Mint"), LP("Lightly Played"), HP("Heavily Played"), MP("Moderately Played"), DM("Damaged");

    private String value;

    Condition(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}

