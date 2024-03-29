package com.holtnet.javafacts;

import android.graphics.Color;

import java.util.Random;

/**
 * Created by jholt on 11/4/2014.
 */
public class colorWheel {
    // This object contains mColors.

    public String mColors[] = {
            "#39add1", // light blue
            "#3079ab", // dark blue
            "#c25975", // mauve
            "#e15258", // red
            "#f9845b", // orange
            "#838cc7", // lavender
            "#7d669e", // purple
            "#53bbb4", // aqua
            "#51b46d", // green
            "#e0ab18", // mustard
            "#637a91", // dark gray
            "#f092b0", // pink
            "#b7c0c7"  // light gray
    };

    public int getColor() {

        String color = "";
        // Randomly select a color
        Random randomGenerator = new Random();  // Construct a new random number generator
        int randomNumber = randomGenerator.nextInt(mColors.length);
        color = mColors[randomNumber];
        // convert color choice to an int by parsing.
        int colorAsInt = Color.parseColor(color);

        return colorAsInt;
    }


}
