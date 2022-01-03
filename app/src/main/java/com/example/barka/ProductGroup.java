package com.example.barka;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ProductGroup extends AppCompatActivity implements PostAdapter.PostClicked{

    TextView tvSelCategory;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_group);

        tvSelCategory = findViewById(R.id.tvSelCategory);
        int index = getIntent().getIntExtra("index",0);
         tvSelCategory.setText(ApplicationClass.appCategories.get(index).getCategory());

    }

    @Override
    public void onPostClicked(int index) {
        Intent intent = new Intent(ProductGroup.this,com.example.barka.DetailActivity.class);
        intent.putExtra("index",index);
        startActivity(intent);
    }
}