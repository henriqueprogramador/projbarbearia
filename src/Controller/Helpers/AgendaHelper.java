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
public class AgendaHelper {
    
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
    
      
}
