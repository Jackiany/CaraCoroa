package com.example.caracoroa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class ResultadoAtctivity extends AppCompatActivity {

    private ImageView imageResultado;
    private Button btnVoltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado_atctivity);

        imageResultado = findViewById(R.id.imageResultado);
        btnVoltar = findViewById(R.id.btnVoltar);

        btnVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                finish();
            }
        });

        //Recuperando dados
        Bundle dados = getIntent().getExtras();
        int numero = dados.getInt("numero");

        // Se o numero for igual igual a zero irá exibir CARA se não é coroa
        if ( numero == 0 ){ //Cara
            imageResultado.setImageResource(R.drawable.moeda_cara);

        }else { //Coroa
            imageResultado.setImageResource(R.drawable.moeda_coroa);

        }
    }
}