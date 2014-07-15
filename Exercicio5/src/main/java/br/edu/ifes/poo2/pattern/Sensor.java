/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.edu.ifes.poo2.pattern;

/**
 *
 * @author 20121bsi0112
 */
public class Sensor {
    private Mediador mediador;
    private int qtdPessoas;

    public Sensor(Mediador mediador) {
        this.mediador = mediador;
        this.qtdPessoas = 0;
    }
    
    public int getQtdPessoas() {
        return qtdPessoas;
    }

    public void setQtdPessoas(int qtdPessoas) {
        this.qtdPessoas = qtdPessoas;
        this.mediador.alterarTemperatura();
    }
    
    
}
