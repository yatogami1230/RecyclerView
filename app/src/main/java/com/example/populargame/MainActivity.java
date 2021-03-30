package com.example.populargame;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class MainActivity extends AppCompatActivity {

    RecyclerView mRecyclerView;
    Adapter myAdapter;
    SharedPreferences preferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView = findViewById(R.id.recyclerView);

        preferences = this.getSharedPreferences("My_Pref", MODE_PRIVATE);

        getMyList();
    }

    private void getMyList(){
        ArrayList<Model> models = new ArrayList<>();

        Model m = new Model();
        m.setTitle("Point Blank");
        m.setDescription("FPS Game");
        m.setImg(R.drawable.pb);
        models.add(m);

        m = new Model();
        m.setTitle("Assassins Creed");
        m.setDescription("Open World Game");
        m.setImg(R.drawable.assassins);
        models.add(m);

        m = new Model();
        m.setTitle("Call of Duty");
        m.setDescription("FPS Game");
        m.setImg(R.drawable.cod);
        models.add(m);

        m= new Model();
        m.setTitle("DOTA 2");
        m.setDescription("Strategy Game");
        m.setImg(R.drawable.dota2);
        models.add(m);

        m= new Model();
        m.setTitle("GTA V");
        m.setDescription("Open World Game");
        m.setImg(R.drawable.gtav);
        models.add(m);

        m= new Model();
        m.setTitle("Mobile Legend");
        m.setDescription("Mobile Game");
        m.setImg(R.drawable.ml);
        models.add(m);

        m= new Model();
        m.setTitle("Ninja Saga");
        m.setDescription("Mobile Game");
        m.setImg(R.drawable.ninjasaga);
        models.add(m);

        m= new Model();
        m.setTitle("Pool 8");
        m.setDescription("Mobile Game");
        m.setImg(R.drawable.pool8);
        models.add(m);

        m= new Model();
        m.setTitle("PUBG");
        m.setDescription("FPS Game");
        m.setImg(R.drawable.pubg);
        models.add(m);

        m= new Model();
        m.setTitle("Watchdog");
        m.setDescription("Open World Game");
        m.setImg(R.drawable.watchdog);
        models.add(m);

        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        myAdapter = new Adapter(this, models);
        mRecyclerView.setAdapter(myAdapter);
    }
}