package com.example.starbuzz;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class FoodActivity extends AppCompatActivity {
    public static final String EXTRA_FOODID = "foodid";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food);

        int foodId = (Integer) getIntent().getExtras().get(EXTRA_FOODID);
        Food food = Food.foods[foodId];

        TextView name = (TextView) findViewById(R.id.name);
        name.setText(food.getName());

        TextView description = (TextView) findViewById(R.id.description);
        description.setText(food.getDescription());

        ImageView picture = (ImageView) findViewById(R.id.picture);
        picture.setImageResource(food.getImageResourceID());
    }
}