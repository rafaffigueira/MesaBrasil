package com.example.test_tcc_2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

public class NovoUsuarioActivity extends AppCompatActivity {

    private EditText usuarioEditText;
    private EditText senhaEditText;
    private EditText cpfCnpjEditText;
    private EditText razaoSocialEditText;
    private EditText enderecoEditText;
    private EditText numeroEditText;
    private EditText cepEditText;
    private EditText cidadeEditText;
    private EditText telefoneEditText;
    private EditText emailEditText;
    private Spinner tipoCadastroSpinner;
    private Button cadastrarButton;
    private EditText nomeEditText;
    private EditText cnpjCpfEditText;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_novo_usuario);

        nomeEditText = findViewById(R.id.nomeEditText);
        cnpjCpfEditText = findViewById(R.id.cnpjCpfEditText);

        usuarioEditText = findViewById(R.id.usuarioEditText);
        senhaEditText = findViewById(R.id.senhaEditText);
        cpfCnpjEditText = findViewById(R.id.cnpjCpfEditText);
        razaoSocialEditText = findViewById(R.id.razaoSocialEditText);
        enderecoEditText = findViewById(R.id.enderecoEditText);
        numeroEditText = findViewById(R.id.numeroEditText);
        cepEditText = findViewById(R.id.cepEditText);
        cidadeEditText = findViewById(R.id.cidadeEditText);
        telefoneEditText = findViewById(R.id.telefoneEditText);
        emailEditText = findViewById(R.id.emailEditText);

        tipoCadastroSpinner = findViewById(R.id.tipoCadastroSpinner);
        cadastrarButton = findViewById(R.id.cadastrarButton);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.tipo_cadastro_options, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        tipoCadastroSpinner.setAdapter(adapter);

        tipoCadastroSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String selectedOption = parent.getItemAtPosition(position).toString();
                updateFieldsVisibility(selectedOption);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });

        cadastrarButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // processar o cadastro aqui ,e enviar  os dados para um servidor

                Intent intent = new Intent(NovoUsuarioActivity.this, HomeActivity.class);
                startActivity(intent);
            }
        });
    }

    private void updateFieldsVisibility(String selectedOption) {
        if (selectedOption.equals("Instituição")) {
            // Mostrar campos específicos para Mesa Brasil
            cpfCnpjEditText.setVisibility(View.VISIBLE);
            telefoneEditText.setVisibility(View.VISIBLE);
            emailEditText.setVisibility(View.VISIBLE);

            // Esconder campos de Instituição e Motorista
            enderecoEditText.setVisibility(View.GONE);
            numeroEditText.setVisibility(View.GONE);
            cepEditText.setVisibility(View.GONE);
            cidadeEditText.setVisibility(View.GONE);
        } else if (selectedOption.equals("Mesa Brasil")) {
            // Mostrar campos específicos para Instituição
            cpfCnpjEditText.setVisibility(View.VISIBLE);
            enderecoEditText.setVisibility(View.VISIBLE);
            numeroEditText.setVisibility(View.VISIBLE);
            cepEditText.setVisibility(View.VISIBLE);
            cidadeEditText.setVisibility(View.VISIBLE);
            telefoneEditText.setVisibility(View.VISIBLE);
            emailEditText.setVisibility(View.VISIBLE);
        } else if (selectedOption.equals("Motorista")) {
            // Mostrar campos específicos para Motorista
            telefoneEditText.setVisibility(View.VISIBLE);
            cpfCnpjEditText.setVisibility(View.VISIBLE);

            // Esconder campos de Mesa Brasil e Instituição
            enderecoEditText.setVisibility(View.GONE);
            numeroEditText.setVisibility(View.GONE);
            cepEditText.setVisibility(View.GONE);
            cidadeEditText.setVisibility(View.GONE);
            emailEditText.setVisibility(View.GONE);
        }
    }
}
