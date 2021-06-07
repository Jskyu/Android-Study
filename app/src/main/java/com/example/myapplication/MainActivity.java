package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn1 = findViewById(R.id.btn1);
        btn1.setOnClickListener(v -> {
            Intent intent = new Intent(getApplicationContext(), Sub1Activity.class);
            startActivity(intent);
        });

        Button btn2 = findViewById(R.id.btn2);
        btn2.setOnClickListener(v -> {
            Intent intent = new Intent(getApplicationContext(), Sub2Activity.class);
            startActivity(intent);
        });

        Button btn3 = findViewById(R.id.btn3);
        btn3.setOnClickListener(v -> {
            TextView text = findViewById(R.id.mainText);
            if (text.getText().equals("text change")) {
                text.setText("Hello World!!");
            } else {
                text.setText("text change");
            }
        });
    }
}