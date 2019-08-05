package com.mtgborrow.borrow.controllers;



import com.mtgborrow.borrow.dto.CardDTO;
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



    private CardService cardService;
    private UserService userService;

    @Autowired
    public CardController(CardService cardService, UserService userService){
        this.cardService = cardService;
        this.userService = userService;
    }


    @PostMapping("/cards")
    public void addCards(HttpServletRequest req, @RequestBody CardDTO toBePersisted){
        User user = userService.whoami(req);
        user.getCards().add(cardService.convertDtoToCard(toBePersisted));
        userService.save(user);
    }


    @GetMapping("/cards")
    @ResponseStatus(HttpStatus.OK)
    public List<Card> getAllCards(HttpServletRequest req){
        User loggedIn = userService.whoami(req);
        return loggedIn.getCards();
    }
}
