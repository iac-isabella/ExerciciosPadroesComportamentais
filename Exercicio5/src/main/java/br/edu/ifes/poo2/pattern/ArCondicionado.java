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
public class ArCondicionado {

    private int temperatura;

    public ArCondicionado() {
        temperatura = 25;
    }
    
    public void controlarTemperatura(int graus) {
        temperatura= 25 - graus;
    }

    public int getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
    }
    
}
