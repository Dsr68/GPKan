/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import gpkan.view.Projetos;

/**
 *
 * @author dalison
 */
public class SelectMenu {
    public static void escolher(int escolha){
        switch(escolha){
            case 2:
                Projetos.mostrarProjetos();
                break;
        }
    }
}
