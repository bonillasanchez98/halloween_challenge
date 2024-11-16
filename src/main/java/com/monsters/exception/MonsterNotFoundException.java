package com.monsters.exception;

public class MonsterNotFoundException extends RuntimeException{

    public MonsterNotFoundException(String message) {
        super(message);
    }

    public MonsterNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
