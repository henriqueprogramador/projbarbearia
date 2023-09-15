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
public class Agendamento {
    
    /* Parametros da classe agendamento */
    private int id;
    private Cliente cliente; /*Aqui vou criar um objeto do tipo cliente. */
    private Servico servico; /*Aqui vou criar um objeto do tipo serviço. */
    private float valor;
    private Date data;
    private String Observacao;
    
    /* Construtor de agendamento */

    public Agendamento(int id, Cliente cliente, Servico servico, float valor, String data) {
        this.id = id;
        this.cliente = cliente;
        this.servico = servico;
        this.valor = valor;
        try { /* Aqui eu estou fazendo a formatação do tipo Date, importei o SimpleDateFormat e aplique o try catch. */
            this.data = new SimpleDateFormat("dd/mm/yyyy HH:mm").parse(data); /* dia, mês e ano (hora e min) */
        } catch (ParseException ex) {
            Logger.getLogger(Agendamento.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    /* getter e setter */

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Servico getServico() {
        return servico;
    }

    public void setServico(Servico servico) {
        this.servico = servico;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public Date getData() {
        return data;
    }
    
    public String getDataFormatada(){
        return new SimpleDateFormat("dd/MM/yyyy").format(data);
    }
    
    public String getHoraFormatada(){
         return new SimpleDateFormat("HH:mm").format(data);
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getObservacao() {
        return Observacao;
    }

    public void setObservacao(String Observacao) {
        this.Observacao = Observacao;
    }
    
    
}
