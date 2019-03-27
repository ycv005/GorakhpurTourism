package com.example.android.gorakhpurtourism.feature;

public class Detail {
    private int mImageId;
    private String mLocationName;
    private String mDescription;
    private String mCommonAddress = ", Gorakhpur, Uttar Pradesh, India";
    public Detail(String name,String info, int id){
        mImageId = id;
        mLocationName = name;
        mDescription = info;
    }

    public int getmImageId() {
        return mImageId;
    }

    public String getmLocationName() {
        return mLocationName;
    }

    public String getmDescription() {
        return mDescription;
    }

    public String getmAddress() {
        return mLocationName + mCommonAddress;
    }
}
