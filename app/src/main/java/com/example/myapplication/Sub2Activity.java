package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Sub2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sub_activity2);

        Button mainBtn = findViewById(R.id.mainBtn);
        mainBtn.setOnClickListener(v -> {
            Intent intent = new Intent(getApplicationContext(), MainActivity.class);
            startActivity(intent);
        });

        findViewById(R.id.hello1Btn).setOnClickListener(v -> {
            Intent intent = new Intent(getApplicationContext(), Sub1Activity.class);
            startActivity(intent);
        });
    }
}
