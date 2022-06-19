
import controller.SelectMenu;
import gpkan.view.Menu;
import java.util.Scanner;



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author dalison
 */
public class GPKan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        byte numero = 10;
        
        Menu.criarMenu();
        
       numero = entrada.nextByte();
       
        SelectMenu.escolher(numero);
    }
    
}
