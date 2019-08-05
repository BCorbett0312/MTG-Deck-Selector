package com.mtgborrow.borrow.services;



import com.mtgborrow.borrow.dto.CardDTO;
import com.mtgborrow.borrow.models.Card;
import com.mtgborrow.borrow.repositories.CardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;




@Service
public class CardService {

    private CardRepository cardRepository;

    @Autowired
    public CardService(CardRepository cardRepository){
        this.cardRepository = cardRepository;
    }


    public Card convertDtoToCard(CardDTO card){
        Card result = new Card();
        result.setName(card.getName());
        return result;
    }

}
