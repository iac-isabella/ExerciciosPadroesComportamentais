/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.edu.ifes.poo2.control;

import br.edu.ifes.poo2.model.Apl;
import br.edu.ifes.poo2.view.View;

/**
 *
 * @author Isabella
 */
public class Control {
    private final View view = new View();
    private final Apl apl = new Apl();
    public void run(){
      String s = view.lerExpressao();
      String[] temp = s.split(" ");
      double d;
      d = apl.avaliar(temp[0], temp[1], temp[2]);
      view.mostrarResultado(d);
    }
}
