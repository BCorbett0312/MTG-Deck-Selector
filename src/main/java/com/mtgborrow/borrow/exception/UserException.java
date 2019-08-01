package com.mtgborrow.borrow.exception;

public class UserException extends Exception{

    public UserException(String errorMessage){
        super(errorMessage);
    }

    public UserException(String errorMessage, Exception e){
        super(errorMessage, e);
    }

}
