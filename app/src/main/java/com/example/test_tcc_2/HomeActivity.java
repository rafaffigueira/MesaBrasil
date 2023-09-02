package com.example.test_tcc_2;

import android.os.Bundle;

import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Button coletaButton = findViewById(R.id.coletaButton);
        Button cadastroAlimentosButton = findViewById(R.id.cadastroAlimentosButton);
        Button cadastroRotasButton = findViewById(R.id.cadastroRotasButton);
        Button coletasFinalizadasButton = findViewById(R.id.coletasFinalizadasButton);

        int numeroInstituicoesAtendidas = 154; // Número inicial (pode ser carregado dinamicamente)
        TextView numeroInstituicoesTextView = findViewById(R.id.numeroInstituicoesTextView);
        numeroInstituicoesTextView.setText(String.valueOf(numeroInstituicoesAtendidas));


        // Configurar os listeners dos botões aqui OK
    }
}