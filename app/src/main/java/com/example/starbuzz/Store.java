package com.example.starbuzz;

import androidx.annotation.NonNull;

public class Store
{
    private String name;
    private String description;
    private int ImageResourceID;

    public static final Store[] stores =
            {
                 new Store("Egg, Pesto & Mozzarella Sandwich", "description", R.drawable.bacon),
                 new Store("Bacon, Sausage & Egg Wrap", "description", R.drawable.pesto)
            };

    public Store(String name, String description, int imageResourceID) {
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