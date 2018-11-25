package com.example.anaplb.appalpha;

import android.content.Intent;

import com.example.anaplb.appalpha.tratamento.TratandoPalavra;

import java.util.ArrayList;

public class CuidandoDeTudo {
    Escolhendo escolhendo;
    TratandoPalavra tratando;

    public CuidandoDeTudo(ArrayList<String> palavras, ArrayList<Integer> audios, ArrayList<Integer> imgs) {
        escolhendo = new Escolhendo(palavras, audios, imgs);
        tratando = new TratandoPalavra(escolhendo.palavra());
        tratando.setUnderscore();
    }

    public Intent colocandoEmIntent(Intent it) {

        it.putExtra("palavra", getPalavra());
        it.putExtra("under", getUnderscore());
        it.putExtra("img", getImagem());
        it.putExtra("som", getSom());

        return it;
    }

    public String getPalavra() {
        return escolhendo.palavra();
    }

    private String getUnderscore() {
        return tratando.getUnderscore();
    }

    private Integer getImagem() {
        return escolhendo.imagem();
    }

    private Integer getSom() {
        return escolhendo.audio();
    }
}
