/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.estudante;

import java.util.Date;

/**
 *
 * @author aluno
 */
public class Estudante {

   
    private int codMatricula;
    private String semestreIngresso;
    private int anosIngresso;
    private String situacaoAcademica;
    private static String nome;
    private Date dataNascimento;
    private String cpf;
    private char genero;
    private String matricula;
    private String email;
    private String telefone;
    public String digito;

    private int obterIdade(Date hoje) {
        int idade = 0;
        return idade;
    }

    public Estudante() {
        nome = "Nobody";
    }

    public static String getNome() {
        return nome;
    }

    public static void setNome(String _nome) {
        nome = _nome;
    }
    public void setMatricula(String _digito) {
        digito = _digito;
    }
    public String getMatricula() {
        return digito = matricula+semestreIngresso+digito;
    } 

    public int getCodMatricula() {
        return codMatricula;
    }

    public String getSemestreIngresso() {
        return semestreIngresso;
    }

    public int getAnosIngresso() {
        return anosIngresso;
    }

    public String getSituacaoAcademica() {
        return situacaoAcademica;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public char getGenero() {
        return genero;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getDigito() {
        return digito;
    }

    public void setCodMatricula(int codMatricula) {
        this.codMatricula = codMatricula;
    }

    public void setSemestreIngresso(String semestreIngresso) {
        this.semestreIngresso = semestreIngresso;
    }

    public void setAnosIngresso(int anosIngresso) {
        this.anosIngresso = anosIngresso;
    }

    public void setSituacaoAcademica(String situacaoAcademica) {
        this.situacaoAcademica = situacaoAcademica;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setDigito(String digito) {
        this.digito = digito;
    }
    
}
