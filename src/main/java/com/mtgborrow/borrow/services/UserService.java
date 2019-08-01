package com.mtgborrow.borrow.services;

import com.mtgborrow.borrow.exception.UserException;
import com.mtgborrow.borrow.models.RequestUser;
import com.mtgborrow.borrow.models.User;
import com.mtgborrow.borrow.models.UserCollection;
import com.mtgborrow.borrow.repositories.CollectionRepository;
import com.mtgborrow.borrow.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;

@Service
public class UserService {


    UserRepository userRepository;
    CollectionService collectionService;

    @Autowired
    public UserService(UserRepository userRepository, CollectionService collectionService) {
        this.userRepository = userRepository;
        this.collectionService = collectionService;
    }


    public User createNewUser(RequestUser requestUser){
        User creatingCollection = parseFromRequest(requestUser);


        return collectionService.createNewCollectionForUser(userRepository.save(creatingCollection)).getOwner();
    }

    public User persistInitialUser(User user){
        return this.userRepository.save(user);
    }

    public User getUserById(Long id){
        return this.userRepository.getById(id);
    }

    public User parseFromRequest(RequestUser requestUser){
        User newUser = new User();
        newUser.setPassword(requestUser.getPassword());
        newUser.setUsername(requestUser.getUsername());

        return newUser;
    }






}
