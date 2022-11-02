package com.laisleal.primeirocliente;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;

public class TelaSplashActivity extends AppCompatActivity {

    private String TAG = "APP_PRIMEIRO_CLIENTE";
    Integer tempoEspera = 1000 * 15;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_splash);
        Log.d(TAG,"onCreate: Iniciando Tela Splash");
        trocarTela();
    }
    public void trocarTela() {
        Log.d(TAG, "trocarTela: Iniciando troca de tela..");

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Log.d(TAG, "trocarTela: esperando...");
                Intent trocaDeTela = new Intent(TelaSplashActivity.this, MainActivity.class);
                startActivity(trocaDeTela);
                finish();
            }
        }, tempoEspera);

    }
}