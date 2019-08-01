package com.mtgborrow.borrow.services;

import com.mtgborrow.borrow.models.Card;
import com.mtgborrow.borrow.models.PhysicalCard;
import com.mtgborrow.borrow.models.User;
import com.mtgborrow.borrow.models.UserCollection;
import com.mtgborrow.borrow.repositories.CollectionRepository;
import com.mtgborrow.borrow.repositories.PhysicalCardRepository;
import com.mtgborrow.borrow.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CollectionService {


    CollectionRepository collectionRepository;
    UserRepository userRepository;
    PhysicalCardRepository physicalCardRepository;


    @Autowired
    public CollectionService(CollectionRepository collectionRepository,
                             UserRepository userRepository,
                             PhysicalCardRepository physicalCardRepository){
        this.collectionRepository=collectionRepository;
        this.userRepository = userRepository;
        this.physicalCardRepository = physicalCardRepository;
    }


    public UserCollection addCardToCollection(Long id, Card card){
        PhysicalCard toAdd = new PhysicalCard();
        toAdd.setCard(card);
        toAdd.setUserCollection(getCollectionByUserId(id));
        this.physicalCardRepository.save(toAdd);
        return getCollectionByUserId(id);



    }

    public UserCollection createNewCollectionForUser(User user){
        UserCollection newCollection = new UserCollection();

        newCollection.setOwner(user);

        return collectionRepository.save(newCollection);
    }


    public UserCollection getCollectionByUserId(Long id){
        return userRepository.getById(id).getUserCollection();
    }

//    public List<UserCollection> getCollectionById(Long id){
//        return collectionRepository.getUserCollectionById(id);
//    }





}
