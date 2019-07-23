package com.mtgborrow.borrow.Controllers;



import com.mtgborrow.borrow.Models.Card;
import com.mtgborrow.borrow.Services.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class CardController {


    @Autowired
    CardService cardService;


    public CardController(CardService cardService){
        this.cardService = cardService;
    }


    @PostMapping("/addcards")
    public void addCards(@RequestBody List<Card> toBePersisted){
        cardService.addCards(toBePersisted);
    }

    @GetMapping("/cards")
    public List<Card> getAllCards(){
        return cardService.getAllCards();
    }

}
