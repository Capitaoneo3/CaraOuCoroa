package com.example.caraoucoroa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Activity_resultado extends AppCompatActivity {
    private Button buttonVoltar;

    private ImageView imagemResultado;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        imagemResultado=findViewById(R.id.imageResultado);
        buttonVoltar=findViewById(R.id.buttonVoltar);

        buttonVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ac_Resultado = new Intent(getApplicationContext(), Activity_resultado.class );

                finish();

            }
        });


        //recuperar dados
        Bundle dados = getIntent().getExtras();
        int numero = dados.getInt("numero");

        if( numero ==0 ){
            imagemResultado.setImageResource(R.drawable.moeda_cara);
            //cara
        }else{
            imagemResultado.setImageResource(R.drawable.moeda_coroa);
            //coroa
        }

    }
}