package com.example.starbuzz;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class DrinkCategoryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drink_category);

        ArrayAdapter<Drink> listAdaptor = new ArrayAdapter<>(
            this, android.R.layout.simple_list_item_1, Drink.drinks);
        ListView listDrinks = (ListView) findViewById(R.id.list_drinks);
        listDrinks.setAdapter(listAdaptor);

        AdapterView.OnItemClickListener itemClickListener =
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> listDrinks, View itemView, int position, long id) {
                       Intent intent = new Intent(DrinkCategoryActivity.this,
                               DrinkActivity.class);
                       //takes the information from the DrinkActivity and brings is to the next activity
                       intent.putExtra(DrinkActivity.EXTRA_DRINKID, (int) id);
                       startActivity(intent);
                    }
                };
        listDrinks.setOnItemClickListener(itemClickListener);
    }
}