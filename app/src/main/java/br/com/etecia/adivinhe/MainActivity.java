package br.com.etecia.adivinhe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private Button btnjogar;
    private TextView txtresultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnjogar = findViewById(R.id.btnjogar);
        txtresultado = findViewById(R.id.txtresultado);

        btnjogar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random randon = new Random();
                int resultado = randon.nextInt(10);
                txtresultado.setText("O resultado é:"+resultado);
            }
        });
    }
}
