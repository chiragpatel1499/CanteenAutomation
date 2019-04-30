package com.example.cp.user;

import android.app.Application;

import com.google.firebase.database.FirebaseDatabase;

public class MyApp extends Application{
    @Override
    public void onCreate() {
        super.onCreate();
        FirebaseDatabase.getInstance().setPersistenceEnabled(true);
    }
}
