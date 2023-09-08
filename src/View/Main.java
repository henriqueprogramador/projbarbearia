/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Models.Agendamento;
import Models.Cliente;
import Models.Servico;
import Models.Usuario;

/**
 *
 * @author Programador Henrique
 */
public class Main {
    
    
    
    
    public static void main (String[] args){
    
    String nome = "Henrique";
            System.out.println(nome);
            
            Servico serviço = new Servico(1, "cabelo", 15);
            
            System.out.println(serviço.getDescricao());
            System.out.println(serviço.getValor());
            
            Cliente cliente = new Cliente(1, "Henrique", "Rua Pedro 350", "00814255");
            System.out.println(cliente.getNome());
            
            Usuario usuario = new Usuario(1, "barber", "barbeiro");
            System.out.println(usuario.getNome());
            
            Agendamento agendamento = new Agendamento(1, cliente, serviço, 15, "08/09/2023 17:00");
            System.out.println(agendamento.getCliente().getNome());
    }
    
}
