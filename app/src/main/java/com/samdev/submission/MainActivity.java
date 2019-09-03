package com.samdev.submission;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvPlace;
    private ArrayList<Place> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String title = "Tempat Wisata Sekitar Cianjur";
        setTitle(title);

        rvPlace = findViewById(R.id.place_list);
        rvPlace.setHasFixedSize(true);

        list.addAll(PlaceData.getListData());
        showRecyclerList();
    }

    private void showRecyclerList() {
        rvPlace.setLayoutManager(new LinearLayoutManager(this));
        ListPlaceAdapter listPlaceAdapter = new ListPlaceAdapter(list);
        rvPlace.setAdapter(listPlaceAdapter);

        listPlaceAdapter.setOnItemClickCallback(new ListPlaceAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(Place data) {
                Intent pindahActiv= new Intent(MainActivity.this, DetailActivity.class);
                pindahActiv.putExtra(DetailActivity.nama, data.getName());
                pindahActiv.putExtra(DetailActivity.det, data.getFrom());
                pindahActiv.putExtra(DetailActivity.photo, data.getPhoto());
                startActivity(pindahActiv);
                placeChoice(data);
            }

        });
    }

    private void placeChoice(Place place) {
        Toast.makeText(this, "Kamu akan berlibur ke " + place.getName(), Toast.LENGTH_SHORT).show();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.item_about) {
            Intent intent = new Intent(this, AboutMe.class);
            this.startActivity(intent);
            return true;
        }
        if (id == R.id.logout) {
            finishActivity();
        }
        return super.onOptionsItemSelected(item);
    }

    private void finishActivity() {
        System.exit(0);
    }
}