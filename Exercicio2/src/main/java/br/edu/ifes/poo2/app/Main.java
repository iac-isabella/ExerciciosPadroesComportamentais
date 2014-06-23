/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.edu.ifes.poo2.app;

import br.edu.ifes.poo2.pattern.ArCondicionado;
import br.edu.ifes.poo2.pattern.Sensor;

/**
 *
 * @author Isabella
 */
public class Main {
    public static void main(String[] args){
        ArCondicionado ar = new ArCondicionado();
        Sensor sensor = new Sensor();
        sensor.addObserver(ar);
        sensor.setQtdPesssoas(3);
        sensor.setQtdPesssoas(5);
    }
}
