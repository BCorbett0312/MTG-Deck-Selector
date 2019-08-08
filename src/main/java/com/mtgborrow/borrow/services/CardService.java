package com.mtgborrow.borrow.services;



import com.mtgborrow.borrow.dto.CardDTO;
import com.mtgborrow.borrow.models.Card;
import com.mtgborrow.borrow.models.User;
import com.mtgborrow.borrow.repositories.CardRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class CardService {

    private UserService userService;
    private CardRepository cardRepository;
    private ModelMapper modelMapper;

    @Autowired
    public CardService(CardRepository cardRepository, UserService userService, ModelMapper modelMapper){
        this.cardRepository = cardRepository;
        this.userService = userService;
        this.modelMapper = modelMapper;
    }


    public void saveCard(User user, CardDTO card){
        user.getCards().add(modelMapper.map(card, Card.class));
        userService.save(user);
    }

    public List<CardDTO> getCards(User user){
        List<CardDTO> toReturn = new ArrayList<>();
        for (Card card: user.getCards()){
            toReturn.add(modelMapper.map(card, CardDTO.class));
        }
        return toReturn;
    }


}
