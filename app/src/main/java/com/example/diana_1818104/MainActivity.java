package com.example.diana_1818104;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profilee);
        btn = findViewById(R.id.btn_Layout);
        btn.setOnClickListener((View.OnClickListener) this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {

            case (R.id.btn_Layout):
                Intent intent = new Intent(MainActivity.this,activity_profilee.class);
                startActivity(intent);
                break;
        }
    }
}