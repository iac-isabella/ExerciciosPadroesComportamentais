/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.edu.ifes.poo2.pattern;


public class CommandCar implements Command {

    @Override
    public void fazer() {
        System.out.println("Ligando o carro!");
    }

    @Override
    public void desfazer() {
        System.out.println("Desligando o carro!");
    }
    
}
