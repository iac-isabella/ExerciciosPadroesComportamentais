/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.edu.ifes.poo2.app;

import br.edu.ifes.poo2.pattern.CommandCar;
import br.edu.ifes.poo2.pattern.CommandPortao;
import br.edu.ifes.poo2.pattern.ControleUniversal;

/**
 *
 * @author Isabella
 */
public class Main {
   public static void main(String[] args){
       ControleUniversal controle = new ControleUniversal();
       controle.setObjeto(new CommandCar());
       controle.fazerAlgo();
       controle.desfazerAlgo();
       controle.setObjeto(new CommandPortao());
       controle.fazerAlgo();
       controle.desfazerAlgo();
   }
}
