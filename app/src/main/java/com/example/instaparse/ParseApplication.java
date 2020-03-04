package com.example.instaparse;

import android.app.Application;

import com.parse.Parse;

public class ParseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("codepath-parstagram-mac")
                .clientKey("parstagramMac")  // set explicitly unless clientKey is explicitly configured on Parse server
                .server("https://codepath-parstagram-mac.herokuapp.com/parse").build());
    }
}
