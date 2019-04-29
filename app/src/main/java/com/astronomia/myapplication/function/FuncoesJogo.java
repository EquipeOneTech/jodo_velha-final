package com.astronomia.myapplication.function;

import android.content.Context;
import android.widget.Toast;

import com.astronomia.myapplication.PrincipalJogo;

public class FuncoesJogo {
    private static String jogador="X";
    public static int empate = 0;



    public String getJogador() {
        return jogador;
    }



    public void verificarJogada(Context ctx, int l, int c ){

        if (verificarLinha(l) == 3 || verificarColuna(c) == 3 || vericarDiagonalP() == 3 || vericarDiagonalS() == 3) {
            Toast messangeGanhador = Toast.makeText (ctx,"Jogador '"+jogador+"' Ganhou!!", Toast.LENGTH_LONG);
            messangeGanhador.show();



            limpar ();
            empate=0;
        }else if (empate==9)
        {
            Toast messangeEmpate = Toast.makeText(ctx, "Empate!!", Toast.LENGTH_LONG);
            messangeEmpate.show();
            limpar ();
            empate=0;
        }
    }



    public int verificarLinha(int l)
    {
        int cont = 0;
        for(int c=0; c<3; c++)
        {
            if(PrincipalJogo.M[l][c]==jogador)
            {
                cont++;
            }
        }
        return cont;
    }
    public int verificarColuna(int c)
    {
        int cont = 0;
        for(int l = 0; l<3; l++)
        {
            if(PrincipalJogo.M[l][c]==jogador)
            {
                cont++;
            }
        }
        return cont;
    }
    public int vericarDiagonalP()
    {
        int cont = 0;
        for(int i = 0; i<3; i++)
        {
            if(PrincipalJogo.M[i][i] == jogador)
            {
                cont++;
            }
        }
        return cont;
    }
    public int vericarDiagonalS()
    {
        int cont = 0;
        for(int i = 0; i<3; i++)
        {
            if(PrincipalJogo.M[i][2-i] == jogador)
            {
                cont++;
            }
        }
        return cont;
    }
    public void limpar()
    {

        for(int l = 0; l<3; l++)
        {
            for(int c = 0; c<3; c++)
            {
                PrincipalJogo.M[l][c]=null;
                PrincipalJogo.b[l][c].setText("");
            }
        }
    }
    public static void trocaJogador() {
        //jogador = (jogador == "X") ? "O" : "X";
        if(jogador=="X"){
            jogador="O";
        }else{
            jogador="X";
        }
    }


}

