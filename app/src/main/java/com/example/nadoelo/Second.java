package com.example.nadoelo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class Second extends Activity{

    private Button settings, Exit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);


        settings = (Button) findViewById(R.id.button_settings);
    }

    public void Settings (View view){
        Intent intent = new Intent(Second.this,Third.class);
        startActivity(intent);
    }
}
