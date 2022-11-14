package com.laisleal.primeirocliente.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.laisleal.primeirocliente.R;

public class MainActivity extends AppCompatActivity {

    private String TAG = "APP_PRIMEIRO_CLIENTE";
    private TextView txtView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate: Iniciando tela Main");

        Bundle bundle = getIntent().getExtras();

        Log.d(TAG, "onCreate- Nome do cliente: " + bundle.getString("nome"));
        Log.d(TAG, "onCreate- Nome do cliente: " + bundle.getString("telefone"));

        txtView = findViewById(R.id.textView);
        txtView.setText(" Bem-vindo " + bundle.getString("nome"));
    }
}