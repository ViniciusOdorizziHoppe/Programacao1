/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pum;

import java.util.Date;

/**
 *
 * @author Vinícius
 */
public class Pum {
    public class Estudante {
        private String nome;
        private Date dataNascimento;
        private String cpf;
        private char genero;
        private String matricula;
        private String email;
        
        public int obterIdade(Date hoje) {
            int idade = 0;
            return idade;
        }
        public Estudante() {
            nome = "Nobody";
        }
        
        public String getNome(){
            return nome;
        }
        
        public void setNome(String _nome) {
            nome = _nome;
        }
    }
}
