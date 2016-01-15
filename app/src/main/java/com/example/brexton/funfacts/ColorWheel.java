package com.example.brexton.funfacts;

import android.graphics.Color;

import java.util.Random;

/**
 * Created by Brexton on 1/11/16.
 */
public class ColorWheel {

    private String[] mColors = {
            "#1BFFFF",
            "#FBB03B",
            "#FCEE21",
            "#ED1E79",
    };

    public int getColor() {
        String color;

        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(mColors.length);
        color = mColors[randomNumber];
        int colorAsInt = Color.parseColor(color);

        return colorAsInt;
    }
}