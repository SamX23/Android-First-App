package com.samdev.submission;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class DetailActivity extends AppCompatActivity {
    public static String det = "det";
    public static String photo;
    public static String nama = "nama";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_activity);

        String title = getIntent().getStringExtra(nama);
        setTitle(title);

        ImageView imgView = findViewById(R.id.gambar);
        int imgTampil = getIntent().getIntExtra(photo, 0);
        imgView.setImageResource(imgTampil);

        TextView namaDataLayout = findViewById(R.id.nama_tempat);
        String getNamaTempat = getIntent().getStringExtra(nama);
        namaDataLayout.setText(getNamaTempat);

        TextView deskDataLayout = findViewById(R.id.desk_tempat);
        String getDeskTempat = getIntent().getStringExtra(det);
        deskDataLayout.setText(getDeskTempat);


    }


    /*@Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu2, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.kembali) {
            System.exit(0);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
     */

}

