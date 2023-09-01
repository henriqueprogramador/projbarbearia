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
public class Usuario {
    
    private int id;
    private String nome;
    private String senha;
    private String niveldeacesso;
    private char sexo;
    private Date datadeNascimento;
    private String telefone;
    private String email;
    private String rg;

    public Usuario(int id, String nome, String senha, String niveldeacesso, char sexo, Date datadeNascimento, String telefone, String email, String rg) {
        this.id = id;
        this.nome = nome;
        this.senha = senha;
        this.niveldeacesso = niveldeacesso;
        this.sexo = sexo;
        this.datadeNascimento = datadeNascimento;
        this.telefone = telefone;
        this.email = email;
        this.rg = rg;
    }

    public Usuario(int id, String nome, String senha) {
        this.id = id;
        this.nome = nome;
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

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

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public Date getDatadeNascimento() {
        return datadeNascimento;
    }

    public void setDatadeNascimento(Date datadeNascimento) {
        this.datadeNascimento = datadeNascimento;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }
    
    
    
}
