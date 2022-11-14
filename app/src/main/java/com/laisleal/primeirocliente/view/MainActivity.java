package com.laisleal.primeirocliente.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.laisleal.primeirocliente.R;

public class MainActivity extends AppCompatActivity {

    private String TAG = "APP_PRIMEIRO_CLIENTE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate: Iniciando tela Main");
    }
}