package fr.poly.mtp.ig5.iwa.springbootapi.advices;

import fr.poly.mtp.ig5.iwa.springbootapi.exceptions.NoUserFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class NoUserFoundAdvice {

    @ResponseBody
    @ExceptionHandler(NoUserFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public String NoUserFoundAdvice(NoUserFoundException ex){
        return ex.getMessage();
    }
}
