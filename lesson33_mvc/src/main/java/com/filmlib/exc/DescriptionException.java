package com.filmlib.exc;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class DescriptionException extends RuntimeException {
    public DescriptionException(String text) {
        super(text);
    }
}
