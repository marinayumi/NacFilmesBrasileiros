package br.com.fiap.exercicios.recyclerview.rm75865;

import java.io.Serializable;

/**
 * Created by logonrm on 04/04/2017.
 */

public class Filme implements Serializable{

    private String nome;
    private int imagem;
    private int descricao;

    public Filme(String nome, int imagem, int descricao) {
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

    public int getDescricao() {
        return descricao;
    }

    public void setDescricao(int descricao) {
        this.descricao = descricao;
    }
}
