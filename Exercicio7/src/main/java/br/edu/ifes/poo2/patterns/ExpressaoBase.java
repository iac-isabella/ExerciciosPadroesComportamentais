package br.edu.ifes.poo2.patterns;



/**
 *
 * @author Isabella
 */
public class ExpressaoBase implements Expressao {
    private Local local;

    public ExpressaoBase(Local local) {
        this.local = local;
    }
    
    @Override
    public Local interpretar() {
        return local;
    }
    
}
