package com.example.android.gorakhpurtourism.feature;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class TourAdapter extends ArrayAdapter<Detail> {

    public TourAdapter(Context context, ArrayList<Detail> list){
        super(context,0,list);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView=convertView;
        if(listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.common_category_layout, parent, false);
        }
        //we need the position of the View on which we want to present the
        Detail mDetail= getItem(position);
        TextView tv1= (TextView)listItemView.findViewById(R.id.text_place_name);
        TextView tv2= (TextView)listItemView.findViewById(R.id.text_description);
        tv1.setText(mDetail.getmLocationName());
        tv2.setText(mDetail.getmDescription());
        ImageView iv1 = (ImageView)listItemView.findViewById(R.id.image_represent_location);
        iv1.setImageResource(mDetail.getmImageId());
        ImageView iv2 = (ImageView)listItemView.findViewById(R.id.image_map);
        iv2.setImageResource(R.drawable.baseline_directions_white_24dp);
        return listItemView;
    }
}
