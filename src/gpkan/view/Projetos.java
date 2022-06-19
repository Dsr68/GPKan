/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gpkan.view;

/**
 *
 * @author dalison
 */
public class Projetos {
    static String titulo = "|                        PROJETOS                        |";
    static String topo = " ________________________________________________________";
    static String base = "|________________________________________________________|";
    static String linha  = "|                                                        |";
    public static void mostrarProjetos(){
        System.out.println(topo);
        
        for(int i = 0; i < 3; i++){
            System.out.println(linha);
            if(i == 1){
                System.out.println(titulo);
                
            }
        }
        
        System.out.println(base);
    }
}
