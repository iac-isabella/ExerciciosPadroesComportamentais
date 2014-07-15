package br.edu.ifes.poo2.pattern;


public class GomaAcabou implements MaquinaState {

    private Maquina maquina;
    
    public GomaAcabou(Maquina maquina) {
        this.maquina = maquina;
    }

    public void executarAcaoAlavanca() {
        System.out.println("Estou sem goma de mascar!");
    }

    public void executarAcaoMoeda() {
        System.out.println("Estou sem goma de mascar e não vou receber a sua moeda!");
    }
    
}
