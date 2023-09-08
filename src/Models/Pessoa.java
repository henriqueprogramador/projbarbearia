/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Programador Henrique
 */
abstract public class Pessoa {
    /* Parametros classe herança "pessoa". */
    
    protected int id;
    protected String nome;
    protected char sexo;
    protected Date datadeNascimento;
    protected String telefone;
    protected String email;
    protected String rg;
    
/* construtor pessoa */
    public Pessoa(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }
/* outro jeito de criar uma pessoa */
    public Pessoa(int id, String nome, char sexo, String datadeNascimento, String telefone, String email, String rg) {
        this.id = id;
        this.nome = nome;
        this.sexo = sexo;
        try { /* As declarações try... catch marcam um bloco de declarações para testar (try), e especifica uma resposta, caso uma exceção seja lançada.*/
            this.datadeNascimento = new SimpleDateFormat("dd/mm/yyyy").parse(datadeNascimento);
        } catch (ParseException ex) {
            Logger.getLogger(Pessoa.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.telefone = telefone;
        this.email = email;
        this.rg = rg;
    }
    
    /* acessar todos os atributos getter e setter */

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
