package com.example.reclyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private Adaptador adaptador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.Recycler);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        List<Item> datos = new ArrayList<>();
        datos.add(new Item("Charizard", R.drawable.charizard));
        datos.add(new Item("Bulbasour", R.drawable.bulbasour));
        datos.add(new Item("Blastoise", R.drawable.blastoise));
        adaptador = new Adaptador(datos, this);
        recyclerView.setAdapter(adaptador);
    }
}