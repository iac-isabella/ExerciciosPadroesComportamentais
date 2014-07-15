/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.edu.ifes.poo2.model;

/**
 *
 * @author Isabella
 */
public class Apl {
    public double avaliar(String fator1, String fator2, String op){
        double a = Double.parseDouble(fator1);
        double b = Double.parseDouble(fator2);
        switch(op){
            case "+":
                return a + b;
            case "-":
                return a - b;
            case "*":
                return a * b;
            case "/":
                return a / b;
        }
        return a;
    }
}
