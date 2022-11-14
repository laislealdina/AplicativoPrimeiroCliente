package com.laisleal.primeirocliente.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
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
        criarArquivoEstoque();
    }

    public void criarArquivoEstoque() {

        SharedPreferences sharedPreferences;
        String PREF_NOME = "estoque";

        SharedPreferences.Editor dados;
        String nomeProduto = "Notebook";
        int codigoProduto = 123;
        float precoProduto = 5000;
        boolean estoqueProduto = true;

        sharedPreferences = getSharedPreferences(PREF_NOME, Context.MODE_PRIVATE);
        Log.d(AppUtil.TAG, "Pasta criada!");

        dados = sharedPreferences.edit();
        dados.putString("nomeProduto", nomeProduto);
        dados.putInt("codigoProduto", codigoProduto);
        dados.putFloat("precoProduto", precoProduto);
        dados.putBoolean("estoqueProduto", estoqueProduto);

        dados.apply();

        Log.i(AppUtil.TAG, "criarArquivoEstoque - nomeProduto: " + sharedPreferences.getString("nomeProduto", "Fora de estoque"));
        Log.i(AppUtil.TAG, "criarArquivoEstoque - codigoProduto: " + sharedPreferences.getInt("codigoProduto", -1));
        Log.i(AppUtil.TAG, "criarArquivoEstoque - precoProduto: " + sharedPreferences.getFloat("precoProduto", 1.0f));
        Log.i(AppUtil.TAG, "criarArquivoEstoque - estoqueProduto: " + sharedPreferences.getBoolean("estoqueProduto", false));

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