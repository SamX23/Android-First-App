package com.samdev.submission;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

public class AboutMe extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about_me);
        String title = " About Developer";
        setTitle(title);

        FloatingActionButton floatbut = findViewById(R.id.floatbut);
        floatbut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Send Whatsapp to : 089657511134", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }
}