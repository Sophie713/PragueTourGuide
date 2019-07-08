package com.example.sophie.praguetourguide.SupportClasses;

import android.support.v4.app.Fragment;

import java.util.Locale;

public class LocationObject extends Fragment {
    private String location_name;
    private int location_picture;
    private String location_description;
    private int location_speech;
    private double location_latitude;
    private double location_longitude;
    /**
     * TO DO:
     * Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(uri));
     * context.startActivity(intent);
     */
    public LocationObject(String name, int picture, String description, double latitude, double longitude, int speech) {
        this.location_name = name;
        this.location_picture = picture;
        this.location_description = description;
        this.location_speech = speech;
        this.location_latitude = latitude;
        this.location_longitude = longitude;
    }

    public LocationObject(String name, int picture, String description, double latitude, double longitude) {
        this.location_name = name;
        this.location_picture = picture;
        this.location_description = description;
        this.location_latitude = latitude;
        this.location_longitude = longitude;
    }

    public String getLocation_name() {
        return location_name;
    }

    public int getLocation_picture() {
        return location_picture;
    }

    public String getLocation_description() {
        return location_description;
    }

    public int getLocation_speech() {
        return location_speech;
    }

    public double getLocation_latitude() {
        return location_latitude;
    }

    public double getLocation_longitude() {
        return location_longitude;
    }
}
