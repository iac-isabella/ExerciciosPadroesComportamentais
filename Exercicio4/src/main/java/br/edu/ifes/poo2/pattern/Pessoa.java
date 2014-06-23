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
public class Pessoa {
    private double salario;
    private Imposto imposto;

    
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Imposto getImposto() {
        return imposto;
    }

    public void setImposto(Imposto imposto) {
        this.imposto = imposto;
    }
    
    public double calcularImposto(){
        return this.imposto.calcular(salario);
    }
    
}
