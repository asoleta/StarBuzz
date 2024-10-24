package com.example.starbuzz;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class StoreActivity extends AppCompatActivity {
    public static final String EXTRA_STOREID = "storeid";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_store);

        int storeId = (Integer) getIntent().getExtras().get(EXTRA_STOREID);
        Store store = Store.stores[storeId];

        TextView name = (TextView) findViewById(R.id.name);
        name.setText(store.getName());

        TextView description = (TextView) findViewById(R.id.description);
        description.setText(store.getDescription());

        ImageView picture = (ImageView) findViewById(R.id.picture);
        picture.setImageResource(store.getImageResourceID());
    }
}