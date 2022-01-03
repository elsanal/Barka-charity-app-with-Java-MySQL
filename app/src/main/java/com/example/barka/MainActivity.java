package com.example.barka;

import androidx.appcompat.app.AppCompatActivity ;

import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements CategoryAdapter.ItemClicked ,PostAdapter.PostClicked{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onItemClicked(int index) {
        Intent intent = new Intent(MainActivity.this,com.example.barka.ProductGroup.class);
        intent.putExtra("index",index);
        startActivity(intent);
    }

    @Override
    public void onPostClicked(int index) {
        Intent intent = new Intent(MainActivity.this,com.example.barka.DetailActivity.class);
        intent.putExtra("index",index);
        startActivity(intent);
    }
}