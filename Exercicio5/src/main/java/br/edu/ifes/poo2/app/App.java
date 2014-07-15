package br.edu.ifes.poo2.app;

import br.edu.ifes.poo2.pattern.ArCondicionado;
import br.edu.ifes.poo2.pattern.Mediador;
import br.edu.ifes.poo2.pattern.Sensor;
import java.util.ArrayList;
import java.util.List;


public class App 
{
    public static void main( String[] args )
    {
        Mediador m = new Mediador();
        List<Sensor> sensores = new ArrayList<Sensor>();
        Sensor s1 = new Sensor(m);
        Sensor s2 = new Sensor(m);
        Sensor s3 = new Sensor(m);
        sensores.add(s1);
        sensores.add(s2);
        sensores.add(s3);
        m.setSensores(sensores);
        ArCondicionado a = new ArCondicionado();
        m.setAr(a);
        s1.setQtdPessoas(5);
        s2.setQtdPessoas(7);
        s3.setQtdPessoas(6);
        System.out.println("Ar condicionado regulado!\n\tTemperatura: " + a.getTemperatura());        
    }
}
