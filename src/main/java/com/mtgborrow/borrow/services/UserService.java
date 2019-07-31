package com.mtgborrow.borrow.services;

import com.mtgborrow.borrow.models.User;
import com.mtgborrow.borrow.models.UserCollection;
import com.mtgborrow.borrow.repositories.CollectionRepository;
import com.mtgborrow.borrow.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {


    UserRepository userRepository;
    CollectionRepository collectionRepository;

    @Autowired
    public UserService(UserRepository userRepository, CollectionRepository collectionRepository) {
        this.userRepository = userRepository;
        this.collectionRepository = collectionRepository;
    }


    public User createNewUser(User user){
        User creatingCollection = this.persistInitialUser(user);
        UserCollection newCollection = new UserCollection();
        newCollection.setOwner(creatingCollection);
        collectionRepository.save(newCollection);
        return creatingCollection;
    }

    public User persistInitialUser(User user){
        return this.userRepository.save(user);
    }

    public User getUserById(Long id){
        return this.userRepository.getById(id);
    }
}
