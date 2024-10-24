package com.example.starbuzz;

import androidx.annotation.NonNull;

public class Drink
{
    private String name;
    private String description;
    private int ImageResourceID;

    public static final Drink[] drinks =
            {
                 new Drink("Chai Latte", "description", R.drawable.chailatte),
                 new Drink("Hot Latte", "description", R.drawable.hotlatte)
            };

    public Drink(String name, String description, int imageResourceID) {
        this.name = name;
        this.description = description;
        this.ImageResourceID = imageResourceID;

    }

    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }

    public int getImageResourceID() {
        return ImageResourceID;
    }

    @NonNull
    public String toString()
    {
        return this.name;
    }
}
