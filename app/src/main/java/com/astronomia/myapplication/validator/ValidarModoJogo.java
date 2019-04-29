package com.astronomia.myapplication.validator;

import android.content.Context;

import com.astronomia.myapplication.modos_de_jogo.Dificil;
import com.astronomia.myapplication.modos_de_jogo.Facil;
import com.astronomia.myapplication.modos_de_jogo.ParaDois;

public class ValidarModoJogo {

    /**Validador que indica modo do jogo.*/
    private Integer validador = null;
    private Context context;

    final Facil facil = new Facil (context);

    public ValidarModoJogo(Context context){
        this.context = context;
    }
    public ValidarModoJogo(){}


    public void setValidador(Integer validador) {
        this.validador = validador;
    }

    /**Método que faz validação e executa o modo de jogo.*/
    public void definindoModoJogo(int linha, int coluna){

        switch (validador){
            case 0:
                facil.jogoFacil();
                break;
            case 1:
                ParaDois.jogoParaDois ();
                break;
            case 2:
                Dificil.jogoDificil (context, linha, coluna);
            break;
        }
    }

}
