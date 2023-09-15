/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Controller.Helpers.AgendaHelper;
import Models.Agendamento;
import Models.Cliente;
import Models.DAO.AgendamentoDAO;
import Models.DAO.ClienteDAO;
import Models.DAO.ServicoDAO;
import Models.Servico;
import View.Agenda;
import java.util.ArrayList;

/**
 *
 * @author Programador Henrique
 */
public class AgendaController {
    
    // Atributo da view Agenda.
    
    private final Agenda view;
    private final AgendaHelper helper;
    
    // construtor da view agenda

    public AgendaController(Agenda view) {
        this.view = view;
        this.helper = new AgendaHelper(view);
    }
    
    /* Atualização */
    public void atualizaTabela(){
            
            //Buscar a lista com agendamentos no banco de dados.
            AgendamentoDAO agendamentoDAO = new AgendamentoDAO(); //instanciando(chamando) o model DAO
        ArrayList<Agendamento> Agendamentos = agendamentoDAO.selectAll(); //usando o DAO para buscar a lista no banco
                //Exibir lista na View
                helper.preencherTabela(Agendamentos); //chamando o ajudante helper para preencher a tabela, passando o parametro agendamentos.

            
    }
    
    //Busca Clientes do BD
    public void atualizaCliente(){ //Responsável por pegar o objeto cliente e ficar na tela.
        ClienteDAO clienteDAO = new ClienteDAO(); /*instancia para o banco ClienteDAO */
        ArrayList<Cliente> clientes = clienteDAO.selectAll() //pega todos os clientes do banco.
                ;
        
        //Exibir clientes no combobox cliente
        helper.preencherCientes(clientes);
    }
    public void atualizaServico(){
        ServicoDAO servicoDAO = new ServicoDAO();
        ArrayList<Servico> servicos = servicoDAO.selectAll();
        helper.preencherServicos(servicos);
    }
}
