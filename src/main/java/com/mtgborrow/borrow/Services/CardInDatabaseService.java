package com.mtgborrow.borrow.Services;

import com.mtgborrow.borrow.Models.Card;
import com.mtgborrow.borrow.Models.CardInDatabase;
import com.mtgborrow.borrow.Repositories.CardInDatabaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

@Service
public class CardInDatabaseService {

    CardInDatabaseRepository cardInDatabaseRepository;

    @Autowired
    public CardInDatabaseService(CardInDatabaseRepository cardInDatabaseRepository){
        this.cardInDatabaseRepository = cardInDatabaseRepository;
    }


    public void addCards(Card[] toBeParsed){
        Stream toparse = Arrays.stream(toBeParsed);
        toparse.forEach(card -> parseAndSave((Card)card));
    }


    public void parseAndSave(Card card){
        CardInDatabase resultCard = new CardInDatabase();

        resultCard.setName(card.getName());
        resultCard.setMultiverseId(card.getMultiverseId());

        cardInDatabaseRepository.save(resultCard);
    }

    public List<CardInDatabase> getAllCards(){
        return cardInDatabaseRepository.findAll();
    }

}
