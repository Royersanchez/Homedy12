package com.example.homedy;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class pantalladeinicio extends AppCompatActivity {
    Button dolores;
    @SuppressLint("MissingInflatedId")
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pantalla_de_inicio);
        dolores=(Button)findViewById(R.id.dolores);
        dolores.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent i = new Intent(pantalladeinicio.this, Dolores.class);
                startActivity(i);
            }



        } );

    }
}
