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
public class PlayerAVI extends PlayerVideo{

    @Override
    protected void carregar(String video) {
        System.out.println("Usando o codec AVI para carregar o video: " + video);
    }

    @Override
    protected void exibir(String video) {
        System.out.println("Usando o codec AVI para exibir o video: " + video);
    }

    @Override
    protected void finalizar(String video) {
        System.out.println("Usando o codec AVI para finalizar a exibição do video: " + video);
    }
    
}
