/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.droidlist;

/**
 *
 * @author Dil
 */
public class Lista {
    private int id;
    private String nome;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return this.nome;
    }


}
