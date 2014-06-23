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
public class AliquotaD implements Imposto{

    @Override
    public double calcular(double salario) {
        return salario * 0.225;
    }
    
}
