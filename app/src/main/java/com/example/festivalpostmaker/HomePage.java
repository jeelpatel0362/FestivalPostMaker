package com.example.festivalpostmaker;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class HomePage extends AppCompatActivity {

    private LinearLayout festival1, festival2, festival3, festival4, festival5;
    private LinearLayout day1,day2,day3,day4,day5;
    private LinearLayout pic1,pic2,pic3,pic4,pic5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_home_page);
        initBinding();
        viewImage();

    }
    public void initBinding(){
        festival1 = findViewById(R.id.festival1);
        festival2 = findViewById(R.id.festival2);
        festival3 = findViewById(R.id.festival3);
        festival4 = findViewById(R.id.festival4);
        festival5 = findViewById(R.id.festival5);

        day1 = findViewById(R.id.day1);
        day2 = findViewById(R.id.day2);
        day3 = findViewById(R.id.day3);
        day4 = findViewById(R.id.day4);
        day5 = findViewById(R.id.day5);

        pic1 = findViewById(R.id.pic1);
        pic2 = findViewById(R.id.pic2);
        pic3 = findViewById(R.id.pic3);
        pic4 = findViewById(R.id.pic4);
        pic5 = findViewById(R.id.pic5);

    }

    public void viewImage(){
        festival1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomePage.this, ViewPage.class);
                intent.putExtra("image",R.drawable.image1);
                startActivity(intent);
            }
        });
        festival2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomePage.this, ViewPage.class);
                intent.putExtra("image",R.drawable.image3);
                startActivity(intent);
            }
        });
        festival3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomePage.this, ViewPage.class);
                intent.putExtra("image",R.drawable.image4);
                startActivity(intent);
            }
        });
        festival4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomePage.this, ViewPage.class);
                intent.putExtra("image",R.drawable.image2);
                startActivity(intent);
            }
        });
        festival5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomePage.this, ViewPage.class);
                intent.putExtra("image",R.drawable.image5);
                startActivity(intent);
            }
        });

        day1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomePage.this, ViewPage.class);
                intent.putExtra("image",R.drawable.day1);
                startActivity(intent);
            }
        });
        day2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomePage.this, ViewPage.class);
                intent.putExtra("image",R.drawable.day2);
                startActivity(intent);
            }
        });
        day3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomePage.this, ViewPage.class);
                intent.putExtra("image",R.drawable.day3);
                startActivity(intent);
            }
        });
        day4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomePage.this, ViewPage.class);
                intent.putExtra("image",R.drawable.day4);
                startActivity(intent);
            }
        });
        day5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomePage.this, ViewPage.class);
                intent.putExtra("image",R.drawable.day5);
                startActivity(intent);
            }
        });

        pic1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomePage.this, ViewPage.class);
                intent.putExtra("image",R.drawable.pic1);
                startActivity(intent);
            }
        });
        pic2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomePage.this, ViewPage.class);
                intent.putExtra("image",R.drawable.pic2);
                startActivity(intent);
            }
        });
        pic3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomePage.this, ViewPage.class);
                intent.putExtra("image",R.drawable.pic3);
                startActivity(intent);
            }
        });
        pic4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomePage.this, ViewPage.class);
                intent.putExtra("image",R.drawable.pic4);
                startActivity(intent);
            }
        });
        pic5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomePage.this, ViewPage.class);
                intent.putExtra("image",R.drawable.pic5);
                startActivity(intent);
            }
        });
    }
}