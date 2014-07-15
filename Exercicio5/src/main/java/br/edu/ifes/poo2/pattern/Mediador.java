/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.edu.ifes.poo2.pattern;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 20121bsi0112
 */
public class Mediador {
    
    List<Sensor> sensores = new ArrayList<Sensor>();
    ArCondicionado ar = new ArCondicionado();
    
    public void alterarTemperatura(){
        int pessoas = 0;
        for(Sensor s: sensores){
            pessoas += s.getQtdPessoas();
        }
        int graus = pessoas/(sensores.size());
        ar.controlarTemperatura(graus);
    }

    public List<Sensor> getSensores() {
        return sensores;
    }

    public void setSensores(List<Sensor> sensores) {
        this.sensores = sensores;
    }

    public ArCondicionado getAr() {
        return ar;
    }

    public void setAr(ArCondicionado ar) {
        this.ar = ar;
    }
    
    
    
}
