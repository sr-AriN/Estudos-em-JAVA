package com.spring_estudos.estudos.SpringFramework.Beans;

import org.springframework.beans.factory.annotation.Autowired;

public class Livros {
    private String nome;
    private String codigo;

    @Autowired
    AutorLivro autorLivro;

    public AutorLivro getAutorLivro() {
        return this.autorLivro;
    }

    public void setAutorLivro(AutorLivro autorLivro) {
        this.autorLivro = autorLivro;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodigo() {
        return this.codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void exibir() {
        System.out.println(this.nome + " // " + this.codigo);
        autorLivro.exibirAutor();
    }
}
