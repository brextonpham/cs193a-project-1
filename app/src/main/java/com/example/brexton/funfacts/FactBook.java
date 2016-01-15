package com.example.brexton.funfacts;

import java.util.Random;

/**
 * Created by Brexton on 1/11/16.
 */
public class FactBook {

    private String[] mFacts = {
            "Brexton Pham <3 Derin",
            "Derin <3 Brexton Pham",
            "Derin & Brexton 4ever",
            "We r cute."};

    public String getFact() {
        String fact = "";

        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(mFacts.length);
        fact = mFacts[randomNumber];

        return fact;
    }
}





