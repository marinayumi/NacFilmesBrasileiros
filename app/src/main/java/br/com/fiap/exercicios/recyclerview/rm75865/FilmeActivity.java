package br.com.fiap.exercicios.recyclerview.rm75865;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class FilmeActivity extends AppCompatActivity {

    ImageView imgFilme;
    TextView txtDesc;
    Filme filme;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_filme);

        Filme filme = (Filme) getIntent().getExtras().get("filmes");

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle(filme.getNome());

        imgFilme = (ImageView)findViewById(R.id.imgFilme);
        txtDesc = (TextView)findViewById(R.id.txtDesc);

        imgFilme.setImageResource(filme.getImagem());
        txtDesc.setText(filme.getDescricao());
    }
}
