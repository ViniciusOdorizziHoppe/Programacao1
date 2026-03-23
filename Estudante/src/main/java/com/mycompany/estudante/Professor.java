/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.estudante;

import java.util.Date;

/**
 *
 * @author aluno
 */
public class Professor {
    
    
   private static String nome;
    private String email;
    private String telefone;
     private String identificacao;
    private String titulacaoAcademica;
     public String areaAtuacao;
    private String regimeTrabalho;

    public static String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getIdentificacao() {
        return identificacao;
    }

    public String getTitulacaoAcademica() {
        return titulacaoAcademica;
    }

    public String getAreaAtuacao() {
        return areaAtuacao;
    }

    public String getRegimeTrabalho() {
        return regimeTrabalho;
    }

    public static void setNome(String nome) {
        Professor.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setIdentificacao(String identificacao) {
        this.identificacao = identificacao;
    }

    public void setTitulacaoAcademica(String titulacaoAcademica) {
        this.titulacaoAcademica = titulacaoAcademica;
    }

    public void setAreaAtuacao(String areaAtuacao) {
        this.areaAtuacao = areaAtuacao;
    }

    public void setRegimeTrabalho(String regimeTrabalho) {
        this.regimeTrabalho = regimeTrabalho;
    }
     
   
    
   
    
}
