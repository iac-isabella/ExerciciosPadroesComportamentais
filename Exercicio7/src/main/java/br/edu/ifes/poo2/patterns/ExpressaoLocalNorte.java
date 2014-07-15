package br.edu.ifes.poo2.patterns;


import java.util.List;

/**
 *
 * @author Isabella
 */
public class ExpressaoLocalNorte implements Expressao {
    private List<Expressao> expressoes;

    public ExpressaoLocalNorte(List<Expressao> expressions) {
        this.expressoes = expressions;
    }
    
    @Override
    public  Local interpretar(){
       Local localFinal = new Local("Lugar", -999.9, -999.9);
        for(Expressao expressaoAtual: expressoes){
         Local atual = expressaoAtual.interpretar();
            if(atual.getLatitude() > localFinal.getLatitude()){
                localFinal = atual;
            }
        }
        return localFinal;
    }
}
