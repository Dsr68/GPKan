/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gpkan.view;

/**
 *
 * @author dalison
 */
public class Menu {
    
    public static void criarMenu(){
        
        System.out.println(" __________________________________________________");
        
        for(int i = 0; i < 2; i++){
            if(i == 1){
                System.out.println("|                       MENU                       |");
            }
            else{
                System.out.println("|                                                  |");
            }
        }
        
        System.out.println("|__________________________________________________|");
        
        for(int i = 0; i < 15; i++){
            if(i == 2){
                criarOpcaoCriarProjeto();
            }
            else if(i == 4){
                criarOpcaoVerProjetos();
            }
            else if(i == 6){
                criarOpcaoAjuda();
            }
            else if(i == 8){
                criarOpcaoSair();
            }
            else{
                criarLaterais();
            }
        }
        
        System.out.println("|__________________________________________________|");
        
    }
    
    public static void criarLaterais(){
        System.out.println("|                                                  |");
    }
    
    public static void criarOpcaoCriarProjeto(){
        System.out.println("|                 1 - Criar projeto                |");
    }
    
    public static void criarOpcaoVerProjetos(){
        System.out.println("|                 2 - Ver projetos                 |");
    }
    
    public static void criarOpcaoAjuda(){
        System.out.println("|                 3 - Ajuda                        |");
    }
    
    public static void criarOpcaoSair(){
        System.out.println("|                 0 - Sair                         |");
    }
    
}
