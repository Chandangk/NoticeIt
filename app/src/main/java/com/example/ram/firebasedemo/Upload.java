package com.example.ram.firebasedemo;


import com.google.firebase.database.IgnoreExtraProperties;

/**
 * Created by Ram on 26-03-2017.
 */
@IgnoreExtraProperties
public class Upload {
    public String name;
    public String url;

    // Default constructor required for calls to
    // DataSnapshot.getValue(User.class)
    public Upload() {
    }

    public Upload(String name, String url) {
        this.name = name;
        this.url= url;
    }

    public String getName() {
        return name;
    }

    public String getUrl() {
        return url;
    }
}
