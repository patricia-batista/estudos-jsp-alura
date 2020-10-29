package br.com.caelum.livraria.bean;

import br.com.caelum.livraria.model.Autor;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;

@ManagedBean
public class AutorBean {
    Autor autor = new Autor();

    @PostConstruct
    public void posCriacao(){
        System.out.println("Objeto 'Autor Bean' foi criado.");
    }

    public Autor getAutor() {
        return autor;
    }

    public void gravar(){
        System.out.println("Autor gravado com sucesso! " + autor);
    }

}
