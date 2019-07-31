package com.mtgborrow.borrow.models;



import javax.persistence.*;

@Entity
public class PhysicalCard {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "physical_card_id")
    private Long id;


//    private Card card;
//    private User borrower;
//    private UserCollection userCollection;


    public PhysicalCard() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

//    public Card getCard() {
//        return card;
//    }
//
//    public void setCard(Card card) {
//        this.card = card;
//    }

//    public User getBorrower() {
//        return borrower;
//    }
//
//    public void setBorrower(User borrower) {
//        this.borrower = borrower;
//    }
}
