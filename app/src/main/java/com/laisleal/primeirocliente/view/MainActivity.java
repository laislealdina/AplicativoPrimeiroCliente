package com.laisleal.primeirocliente.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.laisleal.primeirocliente.R;
import com.laisleal.primeirocliente.core.AppUtil;

public class MainActivity extends AppCompatActivity {

    private TextView txtView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(AppUtil.TAG, "onCreate: Iniciando tela Main");

        Bundle bundle = getIntent().getExtras();

        Log.d(AppUtil.TAG, "onCreate- Nome do cliente: " + bundle.getString("nome"));
        Log.d(AppUtil.TAG, "onCreate- Nome do cliente: " + bundle.getString("telefone"));

        txtView = findViewById(R.id.textView);
        txtView.setText(" Bem-vindo " + bundle.getString("nome"));
    }
}