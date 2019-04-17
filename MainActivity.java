package com.ab.calculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button bu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bu=(Button) findViewById(R.id.button);
    }

    public void forward(View view) {
        Intent intent = new Intent(this,calc.class);
        startActivity(intent);
        finish();

    }
}
