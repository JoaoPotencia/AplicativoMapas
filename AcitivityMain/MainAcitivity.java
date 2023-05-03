package com.example.appmapas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import android.widget.TextView;


import com.github.chrisbanes.photoview.PhotoView;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;


public class MainActivity extends AppCompatActivity {

    public TextInputEditText idestadinho;
    public TextView nome;
    public TextView idpopulacao;
    public TextView idarea;
    public TextView ididh;
    public TextView idmunicipios;
    public PhotoView IDmapa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nome = findViewById(R.id.nome);

        idestadinho = findViewById(R.id.entrada);

        idpopulacao = findViewById(R.id.idpopulacao);
        idarea = findViewById(R.id.idarea);
        ididh = findViewById(R.id.ididh);
        idmunicipios = findViewById(R.id.idmunicipios);

        IDmapa = findViewById(R.id.IDmapa);

    }
    public void btn(View view){

        String estado = idestadinho.getText().toString();

        estado = estado.toLowerCase();

        if (estado.equals("pr")){

            nome.setText("Paraná");
            nome.setVisibility(View.VISIBLE);

            IDmapa.setImageResource(R.drawable.mapapr);
            IDmapa.setVisibility(View.VISIBLE);

            idpopulacao.setText("População: 11.597.484.");
            idarea.setText("Área Territorial: 199.298,981 km²");
            ididh.setText("IDH: 0,749.");
            idmunicipios.setText("Municipios: 284.");

            idpopulacao.setVisibility(View.VISIBLE);
            idarea.setVisibility(View.VISIBLE);
            ididh.setVisibility(View.VISIBLE);
            idmunicipios.setVisibility(View.VISIBLE);


        }
        else if (estado.equals("sc")){

            nome.setText("Santa Catarina");
            nome.setVisibility(View.VISIBLE);

            IDmapa.setImageResource(R.drawable.mapasc);
            IDmapa.setVisibility(View.VISIBLE);

            idpopulacao.setText("População: 7.338.473. ");
            idarea.setText("Área Territorial: 95.730,690 km² ");
            ididh.setText("IDH: 0,744. ");
            idmunicipios.setText("Municipios: 295.");

            idpopulacao.setVisibility(View.VISIBLE);
            idarea.setVisibility(View.VISIBLE);
            ididh.setVisibility(View.VISIBLE);
            idmunicipios.setVisibility(View.VISIBLE);

        }
        else if (estado.equals("rs")){

            nome.setText("Rio Grande do Sul");
            nome.setVisibility(View.VISIBLE);

            IDmapa.setImageResource(R.drawable.mapars);
            IDmapa.setVisibility(View.VISIBLE);


            idpopulacao.setText("População: 11.466.630.");
            idarea.setText("Área Territorial: 281.707.151 km²");
            ididh.setText("IDH: 0,746. ");
            idmunicipios.setText("Municipios: 497.");

            idpopulacao.setVisibility(View.VISIBLE);
            idarea.setVisibility(View.VISIBLE);
            ididh.setVisibility(View.VISIBLE);
            idmunicipios.setVisibility(View.VISIBLE);

        }
        else{
            nome.setText("erro, verifique se digitou corretamente!!");
            nome.setVisibility(View.VISIBLE);
        }
    }
}
