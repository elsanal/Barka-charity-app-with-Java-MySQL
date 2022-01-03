package com.example.barka;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity  {
    ImageView ivPhoto;
    TextView tvOwner, tvDescription, tvLocation, tvCat, tvFree;
    Button btnChat;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        tvCat = findViewById(R.id.tvCat);
        tvDescription = findViewById(R.id.tvDescription);
        tvFree = findViewById(R.id.tvFree);
        tvOwner = findViewById(R.id.tvOwner);
        tvLocation = findViewById(R.id.tvLocation);
        btnChat = findViewById(R.id.btnChat);
        ivPhoto = findViewById(R.id.ivPhoto);

        btnChat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        int index = getIntent().getIntExtra("index",0);
        tvOwner.setText("Owner : "+ ApplicationClass.appPosts.get(index).getOwner());
        tvCat.setText("Category : "+ApplicationClass.appPosts.get(index).getCategory());
        tvLocation.setText("Location : "+ApplicationClass.appPosts.get(index).getLocation());
        tvDescription.setText(ApplicationClass.appPosts.get(index).getDescription());

        if(ApplicationClass.appPosts.get(index).getFree()){
            tvFree.setText("Free : Yes");
        }else{
            tvFree.setText("Free : No");
        }

    }

}