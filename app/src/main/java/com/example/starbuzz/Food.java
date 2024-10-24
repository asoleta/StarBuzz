package com.example.starbuzz;

import androidx.annotation.NonNull;

public class Food
{
    private String name;
    private String description;
    private int ImageResourceID;

    public static final Food[] foods =
            {
                 new Food("Egg, Pesto & Mozzarella Sandwich", "description", R.drawable.bacon),
                 new Food("Bacon, Sausage & Egg Wrap", "description", R.drawable.pesto)
            };

    public Food(String name, String description, int imageResourceID) {
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
