package com.astronomia.myapplication;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.astronomia.myapplication.function.FuncoesJogo;
import com.astronomia.myapplication.validator.ValidarModoJogo;

public class PrincipalJogo extends AppCompatActivity {

    private Context ctx = this;

    public static Button b[][] = new Button[3][3];
    public static String M[][] = new String[3][3];
    private ImageButton btVoltar;

    static final FuncoesJogo funcao = new FuncoesJogo();
    final ValidarModoJogo validarModoJogo = new ValidarModoJogo(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_principal_jogo);




        /**Declarando botões*/
        b[0][0] = (Button) findViewById(R.id.bt00);
        b[0][1] = (Button) findViewById(R.id.bt01);
        b[0][2] = (Button) findViewById(R.id.bt02);
        b[1][0] = (Button) findViewById(R.id.bt10);
        b[1][1] = (Button) findViewById(R.id.bt11);
        b[1][2] = (Button) findViewById(R.id.bt12);
        b[2][0] = (Button) findViewById(R.id.bt20);
        b[2][1] = (Button) findViewById(R.id.bt21);
        b[2][2] = (Button) findViewById(R.id.bt22);

        btVoltar = (ImageButton)findViewById (R.id.voltar);

        btVoltar.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                funcao.limpar ();
                finish ();
            }
        });



        b[0][0].setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                if(M[0][0]==null)
                {
                    FuncoesJogo.empate++;
                    M[0][0]=funcao.getJogador();
                    b[0][0].setText(funcao.getJogador ());
                    funcao.verificarJogada(ctx, 0,0);
                    executaModoJogada (0, 0);
                }
            }
        });

        b[0][1].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(M[0][1]==null)
                {
                    FuncoesJogo.empate++;
                    M[0][1]=funcao.getJogador ();
                    b[0][1].setText(funcao.getJogador ());
                    funcao.verificarJogada(ctx,0,1);
                    executaModoJogada (0, 1);
                }

            }
        });

        b[0][2].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(M[0][2]==null)
                {
                    FuncoesJogo.empate++;
                    M[0][2]=funcao.getJogador ();
                    b[0][2].setText(funcao.getJogador ());
                    funcao.verificarJogada(ctx, 0,2);
                    executaModoJogada (0, 2);
                }
            }
        });

        b[1][0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(M[1][0]==null)
                {
                    FuncoesJogo.empate++;
                    M[1][0]=funcao.getJogador ();
                    b[1][0].setText(funcao.getJogador ());
                    funcao.verificarJogada(ctx, 1,0);
                    executaModoJogada (1, 0);
                }
            }
        });

        b[1][1].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(M[1][1]==null)
                {
                    FuncoesJogo.empate++;
                    M[1][1]=funcao.getJogador ();
                    b[1][1].setText(funcao.getJogador ());
                    funcao.verificarJogada(ctx, 1,1);
                    executaModoJogada (1, 1);
                }

            }
        });

        b[1][2].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(M[1][2]==null)
                {
                    FuncoesJogo.empate++;
                    M[1][2]=funcao.getJogador ();
                    b[1][2].setText(funcao.getJogador ());
                    funcao.verificarJogada(ctx, 1,2);
                    executaModoJogada (1, 2);
                }
            }
        });

        b[2][0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(M[2][0]==null)
                {
                    FuncoesJogo.empate++;
                    M[2][0]=funcao.getJogador ();
                    b[2][0].setText(funcao.getJogador ());
                    funcao.verificarJogada(ctx,2,0);
                    executaModoJogada (2, 0);
                }
            }
        });

        b[2][1].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(M[2][1]==null)
                {
                    FuncoesJogo.empate++;
                    M[2][1]=funcao.getJogador ();
                    b[2][1].setText(funcao.getJogador ());
                    funcao.verificarJogada(ctx, 2,1);
                    executaModoJogada (2, 1);
                }

            }
        });

        b[2][2].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(M[2][2]==null)
                {
                    FuncoesJogo.empate++;
                    M[2][2]=funcao.getJogador ();
                    b[2][2].setText(funcao.getJogador ());
                    funcao.verificarJogada(ctx, 2,2);
                    executaModoJogada (2, 2);
                }

            }
        });

    }

       public void executaModoJogada(int linha, int coluna){
           validarModoJogo.definindoModoJogo (linha, coluna);
       }

//ALZS
}

