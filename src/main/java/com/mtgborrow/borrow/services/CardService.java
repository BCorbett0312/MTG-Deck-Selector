package com.mtgborrow.borrow.services;



import com.mtgborrow.borrow.dto.CardDTO;
import com.mtgborrow.borrow.models.Card;
import com.mtgborrow.borrow.models.FriendGroup;
import com.mtgborrow.borrow.models.User;
import com.mtgborrow.borrow.repositories.CardRepository;
import com.mtgborrow.borrow.repositories.FriendGroupRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


@Service
public class CardService {

    private UserService userService;
    private CardRepository cardRepository;
    private ModelMapper modelMapper;
    private FriendGroupService friendGroupService;

    @Autowired
    public CardService(CardRepository cardRepository, UserService userService, ModelMapper modelMapper,
                       FriendGroupService friendGroupService){
        this.cardRepository = cardRepository;
        this.userService = userService;
        this.modelMapper = modelMapper;
        this.friendGroupService = friendGroupService;
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
        return toReturn.stream()
                .sorted(Comparator.comparing(CardDTO::getName))
                .collect(Collectors.toList());
    }

    public List<CardDTO> getGroupCards(Long groupId, User loggedIn){
        List<CardDTO> toReturn = new ArrayList<>();
        FriendGroup fromDatabase = friendGroupService.getGroupById(groupId);
        fromDatabase.getUsers().remove(loggedIn);
        for (User user: fromDatabase.getUsers()) {
            for (Card card : user.getCards()) {
                toReturn.add(modelMapper.map(card, CardDTO.class));
            }
        }
        return toReturn.stream()
                .sorted(Comparator.comparing(CardDTO::getName))
                .collect(Collectors.toList());
    }


}
