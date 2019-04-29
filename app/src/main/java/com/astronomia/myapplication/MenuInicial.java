package com.astronomia.myapplication;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.astronomia.myapplication.validator.ValidarModoJogo;

public class MenuInicial extends AppCompatActivity {
    private Button bt1, onePlayer,btDificil, sairJogo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_menu_inicial);



        bt1 = (Button)findViewById (R.id.bt1);
        sairJogo = (Button)findViewById (R.id.sair2);
        onePlayer = (Button)findViewById (R.id.bt2);
        btDificil = (Button)findViewById (R.id.dificil);
        final Intent telaJogo = new Intent (this,PrincipalJogo.class);

        final ValidarModoJogo modoJogo = new ValidarModoJogo();

        /**
        Obs: Validação de Modo de jogo:
        * 0 = Facil
        * 1 = Para dois
        * 2 = Dificil
        */

        /**Método que executa Modo Facil*/
        onePlayer.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                modoJogo.setValidador (0);
                startActivity (telaJogo);
            }
        });

        /**Método que executa modo Para dois*/
        bt1.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                modoJogo.setValidador (1);
                startActivity (telaJogo);
            }
        });

        /**Método que executa Modo Dificil*/
        btDificil.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                modoJogo.setValidador (2);
                startActivity (telaJogo);
            }
        });

        /**Método que executa Sair do jogo*/
        sairJogo.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                finish ();
            }
        });

    }
}
