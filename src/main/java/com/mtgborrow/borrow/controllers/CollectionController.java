package com.mtgborrow.borrow.controllers;


import com.mtgborrow.borrow.models.Card;
import com.mtgborrow.borrow.services.CollectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@CrossOrigin
public class CollectionController {


    CollectionService collectionService;

    @Autowired
    public CollectionController(CollectionService collectionService){
        this.collectionService=collectionService;
    }



//    @PostMapping("/collection/add/{id}")
//    public void addCardToCollection(@PathVariable Long id, @RequestBody Card card){
//        collectionService.addCardToCollection(id, card);
//    }


    

}
