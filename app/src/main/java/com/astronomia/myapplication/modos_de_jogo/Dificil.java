package com.astronomia.myapplication.modos_de_jogo;

import android.content.Context;

import com.astronomia.myapplication.PrincipalJogo;
import com.astronomia.myapplication.function.FuncoesJogo;

public class Dificil {
    static FuncoesJogo funcao = new FuncoesJogo ();
    public static void jogoDificil(Context ctx, int linha, int coluna){
        /**
         * Esta classe e seus metodos estão em testes.
         * Ainda concluindo a lógica para modo Dificil*
         **/

        verificarLinha (linha);
        verificarColuna (coluna);
        vericarDiagonalP ();
        vericarDiagonalS ();
        funcao.verificarJogada (ctx, linha, coluna);

    }
    public static void verificarJogo(){

            for(int l = 0; l<3; l++)
            {
                for(int c = 0; c<3; c++)
                {
                    PrincipalJogo.M[l][c]=null;
                    PrincipalJogo.b[l][c].setText("");
                }
            }

    }

    public static int verificarLinha(int l)
    {
        int cont = 0;
        for(int c=0; c<3; c++)
        {
            if(PrincipalJogo.b[l][c].getText().equals ("X"))
            {
                cont++;
            }
        }
        return cont;
    }
    public static int verificarColuna(int c)
    {
        int cont = 0;
        for(int l = 0; l<3; l++)
        {
            if(PrincipalJogo.b[l][c].getText().equals ("X"))
            {
                cont++;
            }
        }
        return cont;
    }
    public static int vericarDiagonalP()
    {
        int cont = 0;
        for(int i = 0; i<3; i++)
        {
            if(PrincipalJogo.b[i][i].getText ().equals ("X"))
            {
                cont++;
            }
        }
        return cont;
    }
    public static int vericarDiagonalS()
    {
        int cont = 0;
        for(int i = 0; i<3; i++)
        {
            if(PrincipalJogo.b[i][2-i].getText ().equals ("X"))
            {
                cont++;
            }
        }
        return cont;
    }
}
