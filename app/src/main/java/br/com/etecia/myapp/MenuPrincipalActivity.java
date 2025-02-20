package br.com.etecia.myapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MenuPrincipalActivity extends AppCompatActivity implements View.OnClickListener {
    CardView sobre, pao, donuts, queijo, estoque, financeiro;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.menu_principal_layout);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        sobre = findViewById(R.id.sobrebtn);
        sobre.setOnClickListener(this);

        pao = findViewById(R.id.paobtn);
        pao.setOnClickListener(this);

        donuts = findViewById(R.id.donutsbtn);
        donuts.setOnClickListener(this);

        queijo = findViewById(R.id.queijobtn);
        queijo.setOnClickListener(this);

        estoque = findViewById(R.id.estoquebtn);
        estoque.setOnClickListener(this);

        financeiro = findViewById(R.id.financeirobtn);
        financeiro.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
    if(v.getId() == R.id.sobrebtn){
        startActivity(new Intent(getApplicationContext(), SobreNosActivity.class));
        finish();
    }
    }
}