package com.example.a1718129_recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private KeluargaAdapter adapter;
    private ArrayList<Keluarga> keluargaArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addData();

        recyclerView = (RecyclerView)findViewById(R.id.recyclerview);

        adapter = new KeluargaAdapter(keluargaArrayList);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);

        recyclerView.setLayoutManager(layoutManager);

        recyclerView.setAdapter(adapter);
    }

    private void addData() {
        keluargaArrayList = new ArrayList<>();
        keluargaArrayList.add(new Keluarga("Yulianto", "Ayah", R.drawable.ayah));
        keluargaArrayList.add(new Keluarga("Suryani", "Ibu", R.drawable.ibu));
        keluargaArrayList.add(new Keluarga("Daniel Eka Wijaya", "Anak ke-1", R.drawable.daniel));
        keluargaArrayList.add(new Keluarga("Elya Surya Nugraha", "Anak ke-2", R.drawable.elya));
        keluargaArrayList.add(new Keluarga("Martha Three Rahayu", "Anak ke-3", R.drawable.martha));
    }
}
