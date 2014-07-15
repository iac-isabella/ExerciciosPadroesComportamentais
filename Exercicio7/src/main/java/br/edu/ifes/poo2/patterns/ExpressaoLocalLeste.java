package br.edu.ifes.poo2.patterns;

import java.util.List;

/**
 *
 * @author Isabella
 */
public class ExpressaoLocalLeste implements Expressao {
    private List<Expressao> expressoes;

    public ExpressaoLocalLeste(List<Expressao> expressions) {
        this.expressoes = expressions;
    }
    
    @Override
    public  Local interpretar(){
       Local localFinal = new Local("Lugar", -999.9, -999.9);
        for(Expressao expressaoAtual: expressoes){
         Local atual = expressaoAtual.interpretar();
            if(atual.getLongitude()> localFinal.getLongitude()){
                localFinal = atual;
            }
        }
        return localFinal;
    }

}
