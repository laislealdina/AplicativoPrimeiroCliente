package com.laisleal.primeirocliente.controller;

import android.util.Log;

import com.laisleal.primeirocliente.core.AppUtil;

public class ClienteController {

    String versaoApp;

    public ClienteController() {

        this.versaoApp = AppUtil.versaoDoAplicativo();
        Log.i(AppUtil.TAG, versaoApp);
    }
}
