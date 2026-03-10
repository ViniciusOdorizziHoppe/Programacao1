/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pum;

import java.util.Date;

class Pum {
   
        private static String nome;
        private Date dataNascimento;
        private String cpf;
        private char genero;
        private String matricula;
        private String email;
        
        private int obterIdade(Date hoje) {
            int idade = 0;
            return idade;
        }
        public Pum() {
            nome = "Nobody";
        }
        
        public static String getNome(){
            return nome;
        }
        
        public static void setNome(String _nome) {
            nome = _nome;
        }
    
}
