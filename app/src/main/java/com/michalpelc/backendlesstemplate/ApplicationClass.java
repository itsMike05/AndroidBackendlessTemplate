package com.michalpelc.backendlesstemplate;

import android.app.Application;

import com.backendless.Backendless;

public class ApplicationClass extends Application {

    public final String APPLICATION_ID = "Your AppId from Backendless";
    public final String API_KEY = "Your API Key from Backendless";
    public final String SERVER_URL = "https://api.backendless.com";

    @Override
    public void onCreate() {
        super.onCreate();

        Backendless.setUrl(SERVER_URL);
        Backendless.initApp(getApplicationContext(),APPLICATION_ID, API_KEY);
    }
}
