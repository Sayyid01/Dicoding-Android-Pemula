package com.sayyid.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.sayyid.myapplication.adapter.DetailDroneAdapter;
import com.sayyid.myapplication.adapter.ListDroneAdapter;
import com.sayyid.myapplication.model.Drone;
import com.sayyid.myapplication.model.DroneData;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvDrone;
    private ArrayList<Drone> arrDrone  = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvDrone = findViewById(R.id.rv_drone);
        rvDrone.setHasFixedSize(true);

        arrDrone.addAll(DroneData.getListData());
        showRecyclerList();
    }

    private void showRecyclerList(){
        rvDrone.setLayoutManager(new LinearLayoutManager(this));
        ListDroneAdapter listDroneAdapter = new ListDroneAdapter(arrDrone);
        rvDrone.setAdapter(listDroneAdapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        clickedMenuAction(item.getItemId());
        return super.onOptionsItemSelected(item);
    }
    private void clickedMenuAction(int selectedMenu){
        if (selectedMenu == R.id.action_about) {
            Intent intent = new Intent(this, AboutActivity.class);
            startActivity(intent);
        }
    }
}
