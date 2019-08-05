package com.mtgborrow.borrow.controllers;



import com.mtgborrow.borrow.models.User;
import com.mtgborrow.borrow.models.Card;
import com.mtgborrow.borrow.services.CardService;
import com.mtgborrow.borrow.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@CrossOrigin
public class CardController {



    CardService cardService;
    UserService userService;

    @Autowired
    public CardController(CardService cardService, UserService userService){
        this.cardService = cardService;
        this.userService = userService;
    }


//    @PostMapping("/cards/bulk")
//    public void addCards(HttpServletRequest req, @RequestBody List<Card> toBePersisted){
//        User user = userService.whoami(req);
//        user.setCards(toBePersisted);
//        userService.save(user);
//    }

    @PostMapping("/cards")
    public void addCards(HttpServletRequest req, @RequestBody Card toBePersisted){
        User user = userService.whoami(req);
        user.getCards().add(toBePersisted);
        userService.save(user);
    }


    @GetMapping("/cards")
    @ResponseStatus(HttpStatus.OK)
    public List<Card> getAllCards(HttpServletRequest req){
        User loggedIn = userService.whoami(req);
        return loggedIn.getCards();
    }
}
