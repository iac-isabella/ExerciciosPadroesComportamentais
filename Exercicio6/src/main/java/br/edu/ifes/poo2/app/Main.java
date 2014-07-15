/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.edu.ifes.poo2.app;

import br.edu.ifes.poo2.pattern.PlayerAVI;
import br.edu.ifes.poo2.pattern.PlayerMP3;
import br.edu.ifes.poo2.pattern.PlayerVideo;

/**
 *
 * @author Isabella
 */
public class Main {
    public static void main(String[] args){
        System.out.println("Exibindo um video em AVI:");
        PlayerVideo player = new PlayerAVI();
        player.reproduzir("Lagoa Azul");
        System.out.println("Exibindo um video em MP3:");
        player = new PlayerMP3();
        player.reproduzir("Lagoa Azul - O retorno");
    }
}
