package com.mtgborrow.borrow.services;


import com.mtgborrow.borrow.models.Card;
import com.mtgborrow.borrow.models.RequestCard;
import com.mtgborrow.borrow.repositories.CardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;


@Service
public class CardService {

    CardRepository cardRepository;

    @Autowired
    public CardService(CardRepository cardRepository){
        this.cardRepository = cardRepository;
    }

    public void addCards(List<RequestCard> toBeParsed){

        Predicate<RequestCard> hasMultiverseId = rc -> rc.getMultiverseId() != null;
        Predicate<RequestCard> isReprint = rc -> rc.getReprint() == null;

        List<Card> toBePersisted = new ArrayList<>();
        List<RequestCard> toBeConverted = toBeParsed.stream()
                .filter(hasMultiverseId.and(isReprint).and(distinctByKey(rc -> rc.getName())))
                .collect(Collectors.toList());

        for(RequestCard card: toBeConverted){
            toBePersisted.add(convertFromRequestCard(card));
        }

        persistCards(checkAgainstDatabase(toBePersisted));
    }

    public List<Card> getAllCards(){
        return cardRepository.findAll();
    }



    public Card convertFromRequestCard(RequestCard cardToConvert){
        Card converted = new Card();
        converted.setName(cardToConvert.getName());
        converted.setMultiverseId(cardToConvert.getMultiverseId());
        return converted;
    }

    public void persistCards(List<Card> toBePersisted){
        cardRepository.saveAll(toBePersisted);
    }


    public static <T> Predicate<T> distinctByKey(Function<? super T, ?> keyExtractor) {
        Map<Object, Boolean> seen = new ConcurrentHashMap<>();
        return t -> seen.putIfAbsent(keyExtractor.apply(t), Boolean.TRUE) == null;
    }


    public List<Card> checkAgainstDatabase(List<Card> toCheck){
        List<Card> result = new LinkedList<>();
        for(Card card: toCheck){
            if(cardRepository.getCardByName(card.getName())==null){
                result.add(card);
            }
        }
        return result;
    }


}
