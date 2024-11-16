package com.monsters.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
@AllArgsConstructor
public class MonsterException {

    private String message;
    private Throwable throwable;
    private HttpStatus status;

}