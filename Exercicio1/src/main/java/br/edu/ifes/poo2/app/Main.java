package br.edu.ifes.poo2.app;

import br.edu.ifes.poo2.pattern.Maquina;

/**
 *
 * @author 20121bsi0112
 */
public class Main {
    
    public static void main(String[] args){
        Maquina maquina1 = new Maquina(1);
        System.out.println("Inserindo moeda...");
        maquina1.inserirMoeda();
        System.out.println("Puxando a alavanca...");
        maquina1.puxarAlavanca();
        
        Maquina maquina2 = new Maquina(0);
        System.out.println("Inserindo moeda...");
        maquina2.inserirMoeda();
        System.out.println("Puxando a alavanca...");
        maquina2.puxarAlavanca();
        
    }
    
}
