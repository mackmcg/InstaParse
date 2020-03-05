package com.example.instaparse;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("codepath-parstagram-mac")
                .clientKey("parstagramMac")  // set explicitly unless clientKey is explicitly configured on Parse server
                .server("https://codepath-parstagram-mac.herokuapp.com/parse").build());
    }
}
