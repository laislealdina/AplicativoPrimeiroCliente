package com.laisleal.primeirocliente.model;

import android.util.Log;

import com.laisleal.primeirocliente.api.AppUtil;
import com.laisleal.primeirocliente.controller.ICrud;

public class Produto implements ICrud {

    private String nome;
    private String fornecedor;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(String fornecedor) {
        this.fornecedor = fornecedor;
    }

    @Override
    public void incluir() {
        Log.i(AppUtil.TAG, "Incluir Produto.");
    }

    @Override
    public void alterar() {
        Log.i(AppUtil.TAG, "Alterar Produto");
    }

    @Override
    public void deletar() {
        Log.i(AppUtil.TAG, "Deletar produto.");
    }

    @Override
    public void listar() {
        Log.i(AppUtil.TAG, "Listar produto.");
    }
}
