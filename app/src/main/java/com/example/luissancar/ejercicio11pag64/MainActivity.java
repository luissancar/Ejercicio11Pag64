package com.example.luissancar.ejercicio11pag64;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void acercaDe(View view){
        Intent i=new Intent(this,AcercaDe.class);
        startActivity(i);
    }
}
