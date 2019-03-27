package com.example.android.gorakhpurtourism.feature;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class Fact extends AppCompatActivity {
    private ArrayList<Detail> mDetail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_layout);

        /*We need a list which store the data of our custom type
        * ArrayList is the right data structure that we need to make the list, as it's size increase and decreases depending on the size of the List*/
        mDetail = new ArrayList<Detail>();
        mDetail.add(new Detail("Gita Press","World's largest publisher of Hindu religious texts",R.drawable.gita_press));
        mDetail.add(new Detail("Gorakhpur Railway Station", "World's longest railway platform (1.35 Km)",R.drawable.gkp_railway_station));
        mDetail.add(new Detail("North Eastern Railway Zone","Headquartered at Gorakhpur",R.drawable.north_railway_zone));
        mDetail.add(new Detail("Air Force Station","Headquarter of Cobra Squadran",R.drawable.cobra_head));

        //Now we will be going for the recycler view as it consume less space as its reuses the view again and again.
        /*Recycler View consist of the ViewAdapter and Adapter
        * Adapter act as bridge and provide data to ViewAdapter from the data source by converting each data to a specific view
        * Several subclasses of the Adapter present whose work is to retrive different type of data from the source and building View for the Adapter View
        * For ex- ArrayAdapter is used for taking out data from the List/Array
        * by default ArrayAdapter covert the each data into string and place it in the TextView
        * So, we need ArrayAdapter that help us to convert our data type.Thus, we will be making a new Adapter*/
        TourAdapter adapter = new TourAdapter(Fact.this, mDetail);
        //Setting up the ViewAdapter, and due to which we can define the layout
        ListView listView = (ListView)findViewById(R.id.layout_list_item);
        listView.setBackgroundColor(Color.parseColor("#a0efeb"));
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Detail holdView = mDetail.get(position);
                String location = holdView.getmAddress();
                Uri gmmIntentUri = Uri.parse("google.navigation:q=" + location);
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                if (mapIntent.resolveActivity(getPackageManager()) != null) {
                    startActivity(mapIntent);
                }
            }
        });
    }
}
