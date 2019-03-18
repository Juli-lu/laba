package com.example.nadoelo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Third extends AppCompatActivity {

    private Button back;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        back = (Button) findViewById(R.id.button_back);
    }

    public void Back (View view) {
        Intent intent = new Intent(Third.this, Second.class);
        startActivity(intent);
    }
}
