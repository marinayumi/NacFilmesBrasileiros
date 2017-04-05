package br.com.fiap.exercicios.recyclerview.rm75865;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by logonrm on 04/04/2017.
 */

public class GeraFilme {

    public static List<Filme> listaFilme(){
        List<Filme> filmes = new ArrayList<>();

        filmes.add(new Filme("Limite", R.drawable.limite, R.string.descLimite));
        filmes.add(new Filme("Deus e o Diabo na Terra do Sol", R.drawable.deuseodiabo, R.string.descDeus));
        filmes.add(new Filme("Vidas Secas", R.drawable.vidassecas, R.string.descVidas));
        filmes.add(new Filme("Cabra Marcado para Morrer", R.drawable.cabra, R.string.descCabra));
        filmes.add(new Filme("Terra em Transe", R.drawable.terra, R.string.descTerra));
        filmes.add(new Filme("O Bandido da Luz Vermelha", R.drawable.obandidodaluzvermelha, R.string.descBandido));
        filmes.add(new Filme("São Paulo, Sociedade Anônima", R.drawable.sociedade, R.string.descSP));
        filmes.add(new Filme("Cidade de Deus", R.drawable.cidadededeus, R.string.descCidade));
        filmes.add(new Filme("O Pagador de Promessas", R.drawable.pagadordepromessas, R.string.descPagador));
        filmes.add(new Filme("Macunaíma", R.drawable.macunaima, R.string.descMacunaima));

        return filmes;
    }
}
