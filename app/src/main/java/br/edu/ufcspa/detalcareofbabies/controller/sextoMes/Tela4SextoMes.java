package br.edu.ufcspa.detalcareofbabies.controller.sextoMes;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import br.edu.ufcspa.detalcareofbabies.R;

/**
 * Created by meiski on 31/07/16.
 */
public class Tela4SextoMes extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sexto_mes_dica2);

        Button btOk = (Button)findViewById(R.id.btnDicas);
        btOk.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Tela5SextoMes.class));
                finish();
            }
        });
    }
}