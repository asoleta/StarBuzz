package com.example.starbuzz;

import androidx.annotation.NonNull;

public class Store
{
    private String name;
    private String description;
    private int ImageResourceID;

    public static final Store[] stores =
            {
                 new Store("Lehigh Street, Allentown", "description", R.drawable.lehighstarbucks),
                 new Store("Center Valley, Promenade Shops", "description", R.drawable.starbucks2)
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
