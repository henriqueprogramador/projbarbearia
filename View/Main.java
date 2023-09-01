/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Models.Cliente;
import Models.Serviço;
import Models.Usuario;

/**
 *
 * @author Programador Henrique
 */
public class Main {
    
    
    
    
    public static void main (String[] args){
    
    String nome = "Henrique";
            System.out.println(nome);
            
            Serviço serviço = new Serviço(1, "cabelo", 15);
            
            System.out.println(serviço.getDescricao());
            System.out.println(serviço.getValor());
            
            Cliente cliente = new Cliente(1, "Henrique", 'M', "995546587", "Rua castanhos 5554");
            System.out.println(cliente);
            
            Usuario usuario = new Usuario(1, "barbeiro", "barbearia");
            System.out.println(usuario);
    }
}
