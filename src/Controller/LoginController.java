/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Controller.Helpers.LoginHelper;
import Models.DAO.UsuarioDAO;
import Models.Usuario;
import View.Login;
import View.MenuPrincipal;

/**
 *
 * @author Programador Henrique
 */
public class LoginController {

    /* Construtor login view e campo view. */
    private final Login view;
    private LoginHelper helper;
    public LoginController(Login view) {
        this.view = view;
        this.helper = new LoginHelper(view);
    }
    
    /* Função entrar no sistema */
    public void entrarNoSistema(){
        // pegar um usuário da view
        Usuario usuario = helper.obterModelo();
        
        
        
        //Pesquisar usuário no banco
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        Usuario usuarioAutenticado = usuarioDAO.selectPorNomeESenha(usuario);
        
         // se o usuário da view tiver o mesmo usuário no banco de dados, redirecionar o usuário para a tela de menu principal.
        //caso contrario mostrar mensagem de erro: User e Password Invalid
        if(usuarioAutenticado != null){
            
            // navegar para o menu principal, se o usuario for diferente que nulo.
            MenuPrincipal menu = new MenuPrincipal();
            menu.setVisible(true);
            this.view.dispose(); // quando o menu abrir, a tela de login some.
        }else{
            view.exibeMensagem("User or password invalid!");
           
       
        
    }
    
        
    
    /* Todas as regras de negócio */
     /* public void alerta(){
        System.out.println("Busquei no Banco de Dados");
        
        this.view.exibeMensagem("Executei Alerta"); */
    }

        }


    
    
   
