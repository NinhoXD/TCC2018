package br.com.phoenix.phoenixmedical;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class InicialActivity extends AppCompatActivity {


    ImageButton imgButtonExame;
    ImageButton imgButtonIndicacao;
    ImageButton imgButtonUnidades;
    ImageButton imgButtonEspecializacoes;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicial);
        imgButtonExame = findViewById(R.id.imgButtonExame);
        imgButtonIndicacao = findViewById(R.id.imgButtonIndicacao);
        imgButtonUnidades = findViewById(R.id.imgButtonUnidadesSaude);
        imgButtonEspecializacoes = findViewById(R.id.imgEspecializacoes);

        //Abre a Activity de Exame
        imgButtonExame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),ExameActivity.class);
                startActivity(intent);
            }
        });

        //Abre a Activity de Especializacoes
        imgButtonEspecializacoes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        //Abre a Activity de Indicacao
        imgButtonIndicacao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });


        //Abre a Activity de Unidades de Saúde
        imgButtonUnidades.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}
