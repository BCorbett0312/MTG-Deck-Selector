package com.mtgborrow.borrow.Services;


import com.mtgborrow.borrow.Models.Card;
import com.mtgborrow.borrow.Repositories.CardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;


@Service
public class CardService {

    CardRepository cardRepository;

    @Autowired
    public CardService(CardRepository cardRepository){
        this.cardRepository = cardRepository;
    }


    public void addCards(List<Card> toBeParsed){
        cardRepository.saveAll(toBeParsed);

    }


    public List<Card> getAllCards(){
        return cardRepository.findAll();
    }


    public void saveCard(Card card) {
        cardRepository.save(card);

    }

}
