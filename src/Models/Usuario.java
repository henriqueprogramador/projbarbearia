/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import java.util.Date;

/**
 *
 * @author Programador Henrique
 */
public class Usuario extends Pessoa {
    
    /* Aqui sao os parametros que foi passado, para a classe usuario. */
    protected String senha;
    protected String niveldeacesso;  

    /* construtores */
    public Usuario(int id, String nome, String senha) {
        super(id, nome);
        this.senha = senha;
    }

    public Usuario( int id, String nome, char sexo, String datadeNascimento, String telefone, String email, String rg, String senha, String niveldeacesso){
        super(id, nome, sexo, datadeNascimento, telefone, email, rg);
        this.senha = senha;
        this.niveldeacesso = niveldeacesso;
    }

    
     /* getters e setters */
    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNiveldeacesso() {
        return niveldeacesso;
    }

    public void setNiveldeacesso(String niveldeacesso) {
        this.niveldeacesso = niveldeacesso;
    }
    
    
}