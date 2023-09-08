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
public class Cliente extends Pessoa {
   /* Aqui sao os parametros que foi passado, para a classe cliente. */
    private String endereco;
    private String cep;

    /* importe classe pessoa - construtor */

    public Cliente(int id, String nome, char sexo, String datadeNascimento, String telefone, String email, String rg, String endereco, String cep) {
        super(id, nome, sexo, datadeNascimento, telefone, email, rg);
        this.endereco = endereco;
        this.cep = cep;
    }
    
    /* segundo construtor - mais leve */

    public Cliente(int id, String nome, String endereco, String cep) {
        super(id, nome);
        this.endereco = endereco;
        this.cep = cep;
    }

    

     
   /* getter e setter */

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }
    
    
    
    
        
        
    }

