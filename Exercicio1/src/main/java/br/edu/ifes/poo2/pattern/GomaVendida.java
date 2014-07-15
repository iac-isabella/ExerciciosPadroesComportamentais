package br.edu.ifes.poo2.pattern;


public class GomaVendida implements MaquinaState {

    private Maquina maquina;
    
    public GomaVendida(Maquina maquina) {
        this.maquina = maquina;
    }

    public void executarAcaoAlavanca() {
        if(this.maquina.getQtdGoma() > 0){
            System.out.println("Entregando a goma de mascar!");
            this.maquina.setQtdGoma(this.maquina.getQtdGoma()-1);
            this.maquina.setEstadoAtual(this.maquina.getSem_moeda());
        }else{
            
            this.maquina.setEstadoAtual(this.maquina.getGoma_acabou());
            this.maquina.getEstadoAtual().executarAcaoAlavanca();
        }
    }

    public void executarAcaoMoeda() {
        System.out.println("Estou trabalhando e não vou receber a sua moeda!");
    }
    
}
