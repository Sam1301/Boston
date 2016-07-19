package com.example.sam.boston;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // set the activity UI
        setContentView(R.layout.activity_main);

        // find category mall TextView and set listener on it to call corresponding activity
        TextView mallsTextView = (TextView) findViewById(R.id.malls_text_view);
        mallsTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // explicit intent to start MallsActivity
                Intent intent = new Intent(MainActivity.this, MallsActivity.class);
                startActivity(intent);
            }
        });
        // find category offices TextView and set listener on it to call corresponding activity
        TextView officesTextView = (TextView) findViewById(R.id.offices_text_view);
        officesTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // explicit intent to start OfficesActivity
                Intent intent = new Intent(MainActivity.this, OfficesActivity.class);
                startActivity(intent);
            }
        });
        // find category colleges TextView and set listener on it to call corresponding activity
        TextView collegesTextView = (TextView) findViewById(R.id.colleges_text_view);
        collegesTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // explicit intent to start CollegesActivity
                Intent intent = new Intent(MainActivity.this, CollegesActivity.class);
                startActivity(intent);
            }
        });
        // find category restaurants TextView and set listener on it to call corresponding activity
        TextView restaurantsTextView = (TextView) findViewById(R.id.restaurant_text_view);
        restaurantsTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // explicit intent to start RestaurantsActivity
                Intent intent = new Intent(MainActivity.this, RestaurantsActivity.class);
                startActivity(intent);
            }
        });
    }
}
