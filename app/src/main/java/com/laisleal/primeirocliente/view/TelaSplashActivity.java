package com.laisleal.primeirocliente.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.widget.TextView;

import com.laisleal.primeirocliente.R;
import com.laisleal.primeirocliente.controller.ClienteController;
import com.laisleal.primeirocliente.core.AppUtil;
import com.laisleal.primeirocliente.model.Cliente;

public class TelaSplashActivity extends AppCompatActivity {

    Integer tempoEspera = 1000 * 15;
    private Cliente objCliente;
    private TextView txtVersao;
    private ClienteController clienteController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_splash);
        Log.d(AppUtil.TAG,"onCreate: Iniciando Tela Splash");

        txtVersao = findViewById(R.id.txtVersao);
        txtVersao.setText(AppUtil.versaoDoAplicativo());
        clienteController = new ClienteController();

        trocarTela();
    }
    public void trocarTela() {
        Log.d(AppUtil.TAG, "trocarTela: Iniciando troca de tela..");

        objCliente = new Cliente("Douglas",
                                  "douglas@gmail.com",
                                "(21)26117517",
                                   35,
                                    true);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Log.d(AppUtil.TAG, "trocarTela: esperando...");
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