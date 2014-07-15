package br.edu.ifes.poo2.patterns;

import java.util.List;

/**
 *
 * @author Isabella
 */
public class ExpressaoLocalOeste implements Expressao{
    private List<Expressao> expressoes;

    public ExpressaoLocalOeste(List<Expressao> expressions) {
        this.expressoes = expressions;
    }
    
    @Override
    public  Local interpretar(){
       Local localFinal = new Local("Lugar", -999.9, 999.9);
        for(Expressao expressaoAtual: expressoes){
         Local atual = expressaoAtual.interpretar();
            if(atual.getLongitude() < localFinal.getLongitude()){
                localFinal = atual;
            }
        }
        return localFinal;
    }

}
