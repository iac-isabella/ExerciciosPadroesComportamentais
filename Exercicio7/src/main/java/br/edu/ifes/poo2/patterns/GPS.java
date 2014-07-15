package br.edu.ifes.poo2.patterns;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

/**
 *
 * @author Isabella
 */
public class GPS {
    private Map<String, Local> locais;
    
    public GPS(){
        locais = new HashMap<>();
        locais.put("Serra", new Local("Serra", -1.5, -1.5));
        locais.put("Vitória", new Local("Vitória", -2.0, -1.5));
        locais.put("Cariacica", new Local("Cariacica", -2.0, -2.5));
        locais.put("Vila Velha", new Local("Vila Velha", -2.5, -1.5));
    }
    
    public Local interpretarComando(String comando){
        Stack<Expressao> pilhaExpressao = new Stack<>();
        for(String token: comando.split(" ")){
            if(locais.containsKey(token)){
              Local city = locais.get(token);
              pilhaExpressao.push(new ExpressaoBase(city));
            }else if(token.equals("norte")){
                pilhaExpressao.push(new ExpressaoLocalNorte(carregarExpressoes(pilhaExpressao)));
            }else if(token.equals("sul")){
                pilhaExpressao.push(new ExpressaoLocalSul(carregarExpressoes(pilhaExpressao)));
            }else if(token.equals("leste")){
                pilhaExpressao.push(new ExpressaoLocalLeste(carregarExpressoes(pilhaExpressao)));
            }else if(token.equals("oeste")){
                pilhaExpressao.push(new ExpressaoLocalOeste(carregarExpressoes(pilhaExpressao)));
            }
        }
        return pilhaExpressao.pop().interpretar();
    }
    
    private List<Expressao> carregarExpressoes(Stack<Expressao> pilhaExpressoes){
        List<Expressao> expressoes = new ArrayList<>();
        while(! pilhaExpressoes.empty()){
            expressoes.add(pilhaExpressoes.pop());
        }
        return expressoes;
    }
}
