package com.example.android.gorakhpurtourism.feature;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //All the View can get interact with the user
        /*Creating the TextView Object of the Four Category so that we can jump to other Activity with the help of Intent*/
        TextView mPopularSite = (TextView)findViewById(R.id.text_popular_sites);
        TextView mPlaceFun = (TextView)findViewById(R.id.text_place_fun);
        TextView mHotelRestaurant = (TextView)findViewById(R.id.text_hotel_restaurants);
        TextView mFact = (TextView)findViewById(R.id.text_facts);
        /*Calling Click Action on the TextView as all the View can handle the click action
        * Making new instance inside the method whose data type is OnClickListener
        * Overriding the onClick method do specific action that developer want*/
        mPopularSite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*Passing MainActivity as context, it allow this class to access some application-specific resource and classes
                and other high level activity such launching Activity, broadcasting, and more*/
                Intent intent = new Intent(MainActivity.this,PopularSite.class);
                startActivity(intent);
            }
        });

        mPopularSite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,PopularSite.class);
                startActivity(intent);
            }
        });

        mPlaceFun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,PlaceFun.class);
                startActivity(intent);
            }
        });

        mHotelRestaurant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,HotelRestaurent.class);
                startActivity(intent);
            }
        });

        mFact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Fact.class);
                startActivity(intent);
            }
        });
    }
}
