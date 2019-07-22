package com.mtgborrow.borrow.Controllers;


import com.mtgborrow.borrow.Models.Card;
import com.mtgborrow.borrow.Models.CardInDatabase;
import com.mtgborrow.borrow.Services.CardInDatabaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class CardInDatabaseController {


    @Autowired
    CardInDatabaseService cardInDatabaseService;


    public CardInDatabaseController(CardInDatabaseService cardInDatabaseService){
        this.cardInDatabaseService = cardInDatabaseService;
    }


    @PostMapping("/addcards")
    public void addCards(@RequestBody Card[] toBePersisted){
        cardInDatabaseService.addCards(toBePersisted);
    }

    @GetMapping("/cards")
    public List<CardInDatabase> getAllCards(){
        return cardInDatabaseService.getAllCards();
    }

}
