package com.filmlib.exc;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class NameException extends RuntimeException{
    public NameException(String text){
        super(text);

    }
}
