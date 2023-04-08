package br.com.dio.desafio.dominio;

public abstract class Conteudo {
//Tod Bootcamp tem conteúdos, e Curso e Mentoria são conteúdos.
    protected static final double XP_PADRAO = 10d;

    public String titulo;
    public String descricao;

    public abstract double CalcularXp();

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
