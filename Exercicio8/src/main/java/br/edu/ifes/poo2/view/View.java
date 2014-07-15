/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.edu.ifes.poo2.view;

import java.util.Scanner;

/**
 *
 * @author Isabella
 */
public class View {
    private Scanner s = new Scanner(System.in);
    
    public String lerExpressao(){
        System.out.println("Digite a expressão:");
        return s.nextLine();
    }
    
    public void mostrarResultado(double d){
        System.out.println("Resultado: "+ d);
    }
}
