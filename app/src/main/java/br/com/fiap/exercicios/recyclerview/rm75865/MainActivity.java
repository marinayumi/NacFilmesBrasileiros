package br.com.fiap.exercicios.recyclerview.rm75865;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView rvFilmes;
    List<Filme> filmes;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        filmes = GeraFilme.listaFilme();

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);

        FilmeAdapter adapter = new FilmeAdapter(this, filmes);

        rvFilmes = (RecyclerView)findViewById(R.id.rvFilmes);
        rvFilmes.setHasFixedSize(true);
        rvFilmes.setAdapter(adapter);
        rvFilmes.setLayoutManager(layoutManager);

    }
}
