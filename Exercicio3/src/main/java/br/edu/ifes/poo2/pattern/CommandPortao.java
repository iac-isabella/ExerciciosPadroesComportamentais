/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.edu.ifes.poo2.pattern;


public class CommandPortao implements Command {

    @Override
    public void fazer() {
        System.out.println("Abrindo o portao!");
    }

    @Override
    public void desfazer() {
        System.out.println("Fechando o portao!");
    }
    
}
