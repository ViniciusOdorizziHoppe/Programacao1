/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.no;

/**
 *
 * @author aluno
 */
public class No {

    private String nome;
    private int codigo;
    private No prox;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public No getProx() {
        return prox;
    }

    public void setProx(No prox) {
        this.prox = prox;
    }

     
    public boolean equals(Object obj) {
        No noaux = (No)obj; 
        if (this.codigo == noaux.getCodigo()) {
            return true;
        }else {
            return false;
        }
    }
    
        
}
