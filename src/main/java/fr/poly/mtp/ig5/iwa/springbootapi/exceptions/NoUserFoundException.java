package fr.poly.mtp.ig5.iwa.springbootapi.exceptions;

public class NoUserFoundException extends RuntimeException{

    public NoUserFoundException(Long id){
        super("No user found for this id: " + id);
    }


}
