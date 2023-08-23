package com.example.test_tcc_2;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

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

        // Configurar os listeners dos botões aqui OK
    }
}
