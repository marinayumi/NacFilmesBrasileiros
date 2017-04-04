package br.com.fiap.exercicios.recyclerview.rm75865;

/**
 * Created by logonrm on 04/04/2017.
 */

public class Filme {

    private String nome;
    private int imagem;
    private String descricao;

    public Filme(String nome, int imagem, String descricao) {
        this.nome = nome;
        this.imagem = imagem;
        this.descricao = descricao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getImagem() {
        return imagem;
    }

    public void setImagem(int imagem) {
        this.imagem = imagem;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
