package com.samdev.submission;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class AboutMe extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about_me);
        String title = " About Me";
        setTitle(title);
    }
}
