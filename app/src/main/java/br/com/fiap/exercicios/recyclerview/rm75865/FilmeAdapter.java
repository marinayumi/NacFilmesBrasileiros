package br.com.fiap.exercicios.recyclerview.rm75865;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

/**
 * Created by logonrm on 04/04/2017.
 */

public class FilmeAdapter extends RecyclerView.Adapter<FilmeAdapter.FilmeViewHolder> {

    private Context context;
    private List<Filme> filmes;

    public FilmeAdapter(Context context, List<Filme> filmes) {
        this.context = context;
        this.filmes = filmes;
    }

    @Override
    public FilmeViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(this.context).inflate(R.layout.recyclerview_filme, parent, false);
        FilmeViewHolder filmeViewHolder = new FilmeViewHolder(v);
        return filmeViewHolder;

    }
    @Override
    public void onBindViewHolder(FilmeViewHolder holder, int position) {
        final Filme filme = this.filmes.get(position);
        holder.imgFilme.setImageResource(filme.getImagem());
        holder.txtNome.setText(filme.getNome());

        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(FilmeAdapter.this.context, FilmeActivity.class);
                it.putExtra("filmes", filme);
                FilmeAdapter.this.context.startActivity(it);
            }
        });
    }

    @Override
    public int getItemCount() {
        return this.filmes.size();
    }


    public static class FilmeViewHolder extends RecyclerView.ViewHolder {

        CardView cardView;
        ImageView imgFilme;
        TextView txtNome;


        public FilmeViewHolder(View itemView) {
            super(itemView);

            cardView = (CardView) itemView;
            imgFilme = (ImageView) itemView.findViewById(R.id.imgFilme);
            txtNome = (TextView) itemView.findViewById(R.id.txtNome);

        }
    }
}
