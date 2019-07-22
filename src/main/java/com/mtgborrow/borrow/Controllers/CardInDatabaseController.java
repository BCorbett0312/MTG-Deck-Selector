package com.mtgborrow.borrow.Controllers;


import com.mtgborrow.borrow.Models.Card;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
public class CardInDatabaseController {



//    CardInDatabaseService cardInDatabaseService;
//
//    @Autowired
//    CardInDatabaseController(CardInDatabaseService cardInDatabaseService){
//        this.cardInDatabaseService = cardInDatabaseService;
//    }
//
//
//    @PostMapping("/addcards")
//    public void addCards(@RequestBody List<Card> toBePersisted){
//        cardInDatabaseService.addCards(toBePersisted);
//    }

}
