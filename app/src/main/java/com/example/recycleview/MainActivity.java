package com.example.recycleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

import adapter.ListTugasAdapter;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvTugas;
    private ArrayList<Tugas> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvTugas = findViewById(R.id.rv_heroes);
        rvTugas.setHasFixedSize(true);

        list.addAll(DataTugas.getListData());
        showRecyclerList();
    }

    private void showRecyclerList(){
        rvTugas.setLayoutManager(new LinearLayoutManager(this));
        ListTugasAdapter listTugasAdapter = new ListTugasAdapter(list);
        rvTugas.setAdapter(listTugasAdapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        setMode(item.getItemId());
        return super.onOptionsItemSelected(item);
    }

    public void setMode(int selectedMode) {
        switch (selectedMode) {
            case R.id.action_list:
                break;

            case R.id.action_grid:
                break;

            case R.id.action_cardview:
                break;
        }
    }
}