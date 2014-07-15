package br.edu.ifes.poo2.app;

import br.edu.ifes.poo2.patterns.GPS;

/**
 *
 * @author Isabella
 */
public class Main {
    public static void main(String[] args) {
        GPS gps = new GPS();
        String comando = "Vila Velha Serra Vitória norte";
        System.out.println("GPS da Foobar Motors:");
        System.out.println("Expressão a ser avaliada: " + comando);
        System.out.println("Resposta:");
        System.out.println(gps.interpretarComando(comando).toString());
    }
}
