/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.Helpers;

import Models.Agendamento;
import Models.Cliente;
import Models.Servico;
import View.Agenda;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Programador Henrique
 */
public class AgendaHelper implements IHelper{
    
    private final Agenda view;

    public AgendaHelper(Agenda view) {
        this.view = view;
    }

    public void preencherTabela() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void preencherTabela(ArrayList<Agendamento> Agendamentos) {
        
        
        DefaultTableModel tableModel = (DefaultTableModel) view.getTableAgendamentos().getModel();
        tableModel.setNumRows(0);
        
        //percorrer a lista preenchendo o table model.
        for (Agendamento Agendamento : Agendamentos) { 
            //criando as linhas
            tableModel.addRow(new Object[]{
            Agendamento.getId(),
            Agendamento.getCliente().getNome(),
            Agendamento.getServico().getDescricao(),
            Agendamento.getValor(),
            Agendamento.getDataFormatada(),
            Agendamento.getHoraFormatada(),
            Agendamento.getObservacao()
            
            });
            
           
        }
    }

    public void preencherCientes(ArrayList<Cliente> clientes) {
        
        
         DefaultComboBoxModel comboBoxModel = (DefaultComboBoxModel) view.getJcomboboxCliente().getModel();
         
         for (Cliente cliente : clientes) {
             
             comboBoxModel.addElement(cliente); //Estou adicionando um elemento chamado cliente no campo.
            
        }
    }

    public void preencherServicos(ArrayList<Servico> servicos) {
        DefaultComboBoxModel comboBoxModel = (DefaultComboBoxModel) view.getJcomboboxtServico().getModel();
        
        for (Servico servico : servicos) {
            comboBoxModel.addElement(servico);
            
        }
    }

    

    public void setarValor(float valor) {
        view.getTextValor().setText(valor+""); //Neste campo estou convertendo uma string texto para um valor do tipo real.
    }

    public Cliente obterCliente() {
        return (Cliente) view.getJcomboboxCliente().getSelectedItem();
    }
    
    public Servico obterServico() {
        return (Servico) view.getJcomboboxtServico().getSelectedItem();
    }

     // Aqui são todos os campos que o barbairo vai passar.
    @Override
    public Agendamento obterModelo() {   
        String idString = view.getTextId().getText();
        int id = Integer.parseInt(idString);
        Cliente cliente = obterCliente();
        Servico servico = obterServico();
        String valorString = view.getTextValor().getText();
        float valor = Float.parseFloat(valorString);
        String data = view.getTextFormatedData().getText();
        String hora = view.getTextFormatedHora().getText();
        String dataHora = data + " " + hora;
        String Observacao = view.getTextObservacao().getText();
        
        //criando agendamento
        Agendamento agendamento = new Agendamento(id, cliente, servico, valor, dataHora, Observacao);
        return agendamento;
        
    }

    @Override
    public void limpatTela() {
       view.getTextId().setText(""); // Setar para vazio
       view.getTextFormatedData().setText("");
       view.getTextFormatedHora().setText("");
       view.getTextObservacao().setText("");
    }
    
      
}
