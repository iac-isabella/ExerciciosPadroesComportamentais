package br.edu.ifes.poo2.pattern;

/**
 *
 * @author 20121bsi0112
 */
public class Maquina {
    
    private MaquinaState sem_moeda;
    private MaquinaState com_moeda;
    private MaquinaState goma_vendida;
    private MaquinaState goma_acabou;
    private MaquinaState estadoAtual;
    private int qtdGoma;

    public Maquina(int qtd) {
        qtdGoma = qtd;
        sem_moeda = new SemMoeda(this);
        com_moeda = new RecebeuMoeda(this);
        goma_vendida = new GomaVendida(this);
        goma_acabou = new GomaAcabou(this);
        setEstadoAtual(sem_moeda);
    }

    public MaquinaState getEstadoAtual() {
        return estadoAtual;
    }

    public void setEstadoAtual(MaquinaState estadoAtual) {
        this.estadoAtual = estadoAtual;
    }
  
    public void inserirMoeda(){
        estadoAtual.executarAcaoMoeda();
        
    }
    
    public void puxarAlavanca(){
        estadoAtual.executarAcaoAlavanca();
    }

    public MaquinaState getSem_moeda() {
        return sem_moeda;
    }

    public void setSem_moeda(MaquinaState sem_moeda) {
        this.sem_moeda = sem_moeda;
    }

    public MaquinaState getCom_moeda() {
        return com_moeda;
    }

    public void setCom_moeda(MaquinaState com_moeda) {
        this.com_moeda = com_moeda;
    }

    public MaquinaState getGoma_vendida() {
        return goma_vendida;
    }

    public void setGoma_vendida(MaquinaState goma_vendida) {
        this.goma_vendida = goma_vendida;
    }

    public MaquinaState getGoma_acabou() {
        return goma_acabou;
    }

    public void setGoma_acabou(MaquinaState goma_acabou) {
        this.goma_acabou = goma_acabou;
    }

    public int getQtdGoma() {
        return qtdGoma;
    }

    public void setQtdGoma(int qtdGoma) {
        this.qtdGoma = qtdGoma;
    }

}
