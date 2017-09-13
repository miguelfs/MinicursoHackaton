package com.example.miguel.minicursohackaton;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView especieTextView;
    RelativeLayout layout;
    TrocaCorETexto troca;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         especieTextView = (TextView) findViewById(R.id.especieTextView);
        Button botaoTrocarTextoCor = (Button) findViewById(R.id.buttonCurso);
         layout = (RelativeLayout) findViewById(R.id.relativeLayout);

         troca = new TrocaCorETexto();


        botaoTrocarTextoCor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int inteiroColor = Color.parseColor(troca.getColor());
                layout.setBackgroundColor(inteiroColor);
                especieTextView.setText(troca.getTexto());
            }
        });


    }
}
