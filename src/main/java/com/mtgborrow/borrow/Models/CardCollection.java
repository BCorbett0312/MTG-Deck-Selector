package com.mtgborrow.borrow.Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CardCollection {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;




}
