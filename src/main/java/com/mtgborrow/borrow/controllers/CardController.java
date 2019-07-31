package com.mtgborrow.borrow.controllers;



import com.mtgborrow.borrow.models.Card;
import com.mtgborrow.borrow.models.RequestCard;
import com.mtgborrow.borrow.services.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class CardController {



    CardService cardService;

    @Autowired
    public CardController(CardService cardService){
        this.cardService = cardService;
    }


    @PostMapping("/addcards")
    public void addCards(@RequestBody List<RequestCard> toBePersisted){
        cardService.addCards(toBePersisted);
    }

    @GetMapping("/cards")
    public List<Card> getAllCards(){
        return cardService.getAllCards();
    }

}
