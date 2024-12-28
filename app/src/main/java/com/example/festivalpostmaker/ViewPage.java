package com.example.festivalpostmaker;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ViewPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_view_page);

        ImageView post = findViewById(R.id.post);
        ImageButton back = findViewById(R.id.backButton);

        back.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View view) {
                                        Intent intent = new Intent(ViewPage.this, HomePage.class);
                                        startActivity(intent);
                                    }
                                });
        Intent intent = getIntent();
        int image = intent.getIntExtra("image", 0);

        if (image != 0) {
            post.setImageResource(image);
        } else {
            post.setImageResource(R.drawable.defaultimage);
        }
    }

}
