/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.edu.ifes.poo2.pattern;

import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author Isabella
 */
public class ArCondicionado implements Observer{

    @Override
    public void update(Observable obs, Object o) {
        Sensor sensor = (Sensor) obs;
        System.out.println("Aumentando a temperatura em: " + sensor.getQtdPesssoas() + " graus!");
    }
    
}
