/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifes.poo2.pattern;


public class SemMoeda implements MaquinaState {

    private Maquina maquina;
    
    public SemMoeda(Maquina maquina) {
        this.maquina = maquina;
    }

    public void executarAcaoAlavanca() {
        System.out.println("Você ainda não inseriu uma moeda!!! Achou que era esperto, né?");
    }

    public void executarAcaoMoeda() {
        this.maquina.setEstadoAtual(this.maquina.getCom_moeda());
        System.out.println("Moeda recebida!");
    }
    
}
