package exercicios.exercicio32.dadinhos;

import java.util.Random;

/*
 * @author Luiz Carlos Dinani
 */

public class Dadinho {
    Random random = new Random();
    
    private Integer numSorteado;
    private Integer vitorias = 0;
   
    public void sortear(){
        numSorteado = random.nextInt(6)+1;
    }

    public Integer getNumSorteado() {
        return numSorteado;
    }        
    
    public void darVitoria(){
        vitorias++;
    }

    public Integer getVitorias() {
        return vitorias;
    }
    
    
}