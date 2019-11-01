package com.sayyid.myapplication.adapter;


import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.sayyid.myapplication.R;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class DetailDroneAdapter extends AppCompatActivity {

    ImageView imgPhoto;
    TextView tvName, tvDetails;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.item_detail_drone);
        imgPhoto = findViewById(R.id.img_item_photo);
        tvName = findViewById(R.id.tv_item_name);
        tvDetails = findViewById(R.id.tv_item_details);

        getDetailData();
    }

    private void getDetailData(){
        Intent intent = getIntent();
        Glide.with(this)
                .load(intent.getIntExtra("droneImage", 0))
                .into(imgPhoto);
        tvName.setText(intent.getStringExtra("droneName"));
        tvDetails.setText(intent.getStringExtra("droneDetail"));
    }
}
