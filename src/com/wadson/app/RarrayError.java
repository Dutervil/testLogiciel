package com.wadson.app;

import java.util.HashMap;
import java.util.Map;

public class RarrayError extends Exception {
    static String message = "la capacite doit être strictement positive.";
    public RarrayError(){
        super(message);
    }




}
