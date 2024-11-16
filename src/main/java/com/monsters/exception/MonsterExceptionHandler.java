package com.monsters.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class MonsterExceptionHandler {

    @ExceptionHandler(value = {MonsterNotFoundException.class})
    public ResponseEntity<Object> handlerMonsterNotFoundException(MonsterNotFoundException ex){
        MonsterException monsterException = new MonsterException(ex.getMessage(), ex.getCause(), HttpStatus.NOT_FOUND);

        return new ResponseEntity<>(monsterException, HttpStatus.NOT_FOUND);
    }
}
