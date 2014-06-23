/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.edu.ifes.poo2.app;

import br.edu.ifes.poo2.pattern.AliquotaA;
import br.edu.ifes.poo2.pattern.AliquotaB;
import br.edu.ifes.poo2.pattern.AliquotaC;
import br.edu.ifes.poo2.pattern.AliquotaD;
import br.edu.ifes.poo2.pattern.AliquotaE;
import br.edu.ifes.poo2.pattern.Pessoa;

/**
 *
 * @author Isabella
 */
public class Main {
 
    public static void main(String[] args ){
        System.out.println("Utilizando o padrao Estrategia:");
        Pessoa pessoa  = new Pessoa();
        pessoa.setSalario(1700.0);
        pessoa.setImposto(new AliquotaA());
        System.out.println("Imposto: " + pessoa.calcularImposto());
        pessoa.setSalario(2000.0);
        pessoa.setImposto(new AliquotaB());
        System.out.println("Imposto: " + pessoa.calcularImposto());
        pessoa.setSalario(3000.0);
        pessoa.setImposto(new AliquotaC());
        System.out.println("Imposto: " + pessoa.calcularImposto());
        pessoa.setSalario(4000.0);
        pessoa.setImposto(new AliquotaD());
        System.out.println("Imposto: " + pessoa.calcularImposto());
        pessoa.setSalario(5000.0);
        pessoa.setImposto(new AliquotaE());
        System.out.println("Imposto: " + pessoa.calcularImposto());
        
    }
    
}
