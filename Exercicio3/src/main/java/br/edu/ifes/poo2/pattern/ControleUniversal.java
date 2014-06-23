/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.edu.ifes.poo2.pattern;

/**
 *
 * @author Isabella
 */
public class ControleUniversal {
    
    private Command objeto;

    public Command getObjeto() {
        return objeto;
    }

    public void setObjeto(Command objeto) {
        this.objeto = objeto;
    }
    
    public void fazerAlgo(){
        objeto.fazer();
    }
    
    public void desfazerAlgo(){
        objeto.desfazer();
    }
    
}
