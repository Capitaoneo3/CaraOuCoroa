package com.example.caraoucoroa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity_resultado extends AppCompatActivity {
    private Button buttonVoltar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        buttonVoltar=findViewById(R.id.buttonVoltar);

        buttonVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ac_Resultado = new Intent(getApplicationContext(), Activity_resultado.class );

                finish();

            }
        });
    }
}