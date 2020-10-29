package br.com.caelum.livraria.bean;

import br.com.caelum.livraria.model.Livro;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;

@ManagedBean
public class LivroBean {

    private Livro livro = new Livro();

    @PostConstruct
    public void posCriacao(){
        System.out.println("Objeto 'Livro Bean' foi criado.");
    }

    public Livro getLivro() {
        return livro;
    }

    public void gravar(){
        System.out.println("Gravando livro: " + livro);
    }
}
