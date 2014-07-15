package br.edu.ifes.poo2.pattern;


public class RecebeuMoeda implements MaquinaState {

    private Maquina maquina;
    
    public RecebeuMoeda(Maquina maquina) {
        this.maquina = maquina;
    }

    public void executarAcaoAlavanca() {
        this.maquina.setEstadoAtual(this.maquina.getGoma_vendida());
        this.maquina.getEstadoAtual().executarAcaoAlavanca();
    }

    public void executarAcaoMoeda() {
        System.out.println("Devolvendo a moeda!");
        this.maquina.setEstadoAtual(this.maquina.getSem_moeda());
    }
    
}
