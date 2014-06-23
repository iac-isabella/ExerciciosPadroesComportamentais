/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.edu.ifes.poo2.pattern;

import java.util.Observable;

/**
 *
 * @author Isabella
 */
public class Sensor extends Observable{
    private int qtdPesssoas;

    public int getQtdPesssoas() {
        return qtdPesssoas;
    }

    public void setQtdPesssoas(int qtdPesssoas) {
        this.qtdPesssoas = qtdPesssoas;
        setChanged();
        notifyObservers();
    }
    
}
