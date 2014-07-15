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
public abstract class PlayerVideo {
    public void reproduzir(String video){
        carregar(video);
        exibir(video);
        finalizar(video);
    }
    protected abstract void carregar(String video);
    protected abstract void exibir(String video);
    protected abstract void finalizar(String video);
}
