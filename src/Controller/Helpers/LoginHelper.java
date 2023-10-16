/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.Helpers;

import Models.Usuario;
import View.Login;

/**
 *
 * @author Programador Henrique
 */
public class LoginHelper implements IHelper{
    
    private final Login view;

    /* construtor */
    public LoginHelper(Login view) {
        this.view = view;
    }
    // Modelo usuário, obter o campo de texto usuário e senha.
    public Usuario obterModelo(){
       /* Strings - pegando usuario e senha */
        String nome = view.getTextUsuario().getText();
        String senha = view.getTextSenha().getText();
        /* transformar os campos acima em usuario */
        Usuario modelo = new Usuario(0, nome, senha);
        return modelo;
    }
    
    // Modelo setar, irá setar ou seja reiniciar o campo usuário.
    public void setarModelo(Usuario modelo){ // setar modelos para tela
        String nome = modelo.getNome();
        String senha = modelo.getSenha();
        
        view.getTextUsuario().setText(nome);
        view.getTextSenha().setText(senha);
        
    }
    
    // Limpar Tela
    public void LimparTela(){
        view.getTextUsuario().setText("");
        view.getTextSenha().setText("");
    }

    @Override
    public void limpatTela() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
