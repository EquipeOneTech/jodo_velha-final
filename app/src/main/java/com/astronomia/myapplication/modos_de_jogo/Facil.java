package com.astronomia.myapplication.modos_de_jogo;

import android.content.Context;

import com.astronomia.myapplication.PrincipalJogo;
import com.astronomia.myapplication.function.FuncoesJogo;

import java.util.Random;

public class Facil {


    private Context context;

    static FuncoesJogo funcao = new FuncoesJogo ();

    public Facil(Context context){
        this.context = context;
    }

    public void jogoFacil(){
        funcao.trocaJogador ();

        boolean validar = false;
        while (validar==false){

            Random l = new Random();
            Random c = new Random();

            int linha = l.nextInt(3);
            int coluna = c.nextInt (3);

            if(PrincipalJogo.M[linha][coluna]==null) {
                PrincipalJogo.M[linha][coluna] = funcao.getJogador();
                PrincipalJogo.b[linha][coluna].setText(funcao.getJogador ());
                funcao.verificarJogada (context, linha, coluna);
                funcao.trocaJogador ();
                FuncoesJogo.empate++;
                validar = true;
            }
        }
    }
}
