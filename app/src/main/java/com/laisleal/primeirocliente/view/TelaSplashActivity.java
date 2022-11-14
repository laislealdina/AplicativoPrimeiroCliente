package com.laisleal.primeirocliente.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;

import com.laisleal.primeirocliente.R;
import com.laisleal.primeirocliente.model.Cliente;

public class TelaSplashActivity extends AppCompatActivity {

    private String TAG = "APP_PRIMEIRO_CLIENTE";
    Integer tempoEspera = 1000 * 15;
    private Cliente objCliente;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_splash);
        Log.d(TAG,"onCreate: Iniciando Tela Splash");
        trocarTela();
    }
    public void trocarTela() {
        Log.d(TAG, "trocarTela: Iniciando troca de tela..");

        objCliente = new Cliente("Douglas",
                                  "douglas@gmail.com",
                                "(21)26117517",
                                   35,
                                    true);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Log.d(TAG, "trocarTela: esperando...");
                Intent trocaDeTela = new Intent(TelaSplashActivity.this, MainActivity.class);

                Bundle bundle = new Bundle();
                bundle.putString("nome", objCliente.getNome());
                bundle.putString("telefone", objCliente.getTelefone());
                trocaDeTela.putExtras(bundle);

                startActivity(trocaDeTela);
                finish();
            }
        }, tempoEspera);

    }
}