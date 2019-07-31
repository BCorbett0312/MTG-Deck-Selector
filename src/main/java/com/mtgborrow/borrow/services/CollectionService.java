package com.mtgborrow.borrow.services;

import com.mtgborrow.borrow.models.Card;
import com.mtgborrow.borrow.models.PhysicalCard;
import com.mtgborrow.borrow.models.UserCollection;
import com.mtgborrow.borrow.repositories.CollectionRepository;
import com.mtgborrow.borrow.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CollectionService {


    CollectionRepository collectionRepository;
    UserRepository userRepository;


    @Autowired
    public CollectionService(CollectionRepository collectionRepository, UserRepository userRepository){
        this.collectionRepository=collectionRepository;
        this.userRepository = userRepository;
    }


//    public List<UserCollection> getCollectionById(Long id){
//        return collectionRepository.getUserCollectionById(id);
//    }





}
