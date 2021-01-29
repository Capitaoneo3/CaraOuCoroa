package com.example.caraoucoroa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private Button buttonJogar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonJogar=findViewById(R.id.buttonJogar);

        buttonJogar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent ac_Resultado = new Intent(getApplicationContext(), Activity_resultado.class );
                int numero =(int) new Random().nextInt();

                startActivity(ac_Resultado) ;

            }
        });
    }
}