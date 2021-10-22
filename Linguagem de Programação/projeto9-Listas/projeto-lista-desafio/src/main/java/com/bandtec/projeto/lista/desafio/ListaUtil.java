package com.bandtec.projeto.lista.desafio;

import java.util.List;
import java.util.ArrayList;

public class ListaUtil {

    private List<Integer> inteiros;
    
    public ListaUtil() {
        this.inteiros = new ArrayList<>();
    }
    
    public Integer count(){
        Integer contador = 0;
        for (Integer inteiro : inteiros) {
             contador++;
        }
        return contador;
    }
    
    public void add(Integer inteiro){
        inteiros.add(inteiro);
    }
    
    public void remove(Integer posicao){
        inteiros.remove(posicao);
    }
    
    public Integer countPares(){
        Integer contador = 0;
        for (Integer inteiro : inteiros) {
            if(inteiro%2==0){
                contador++;
            }
        }
        return contador;
    }
    
    public Integer countImpares(){
    
        return null;
    }
    
    public Integer somar(){
    
        return null;
    }
    
    public Integer getMaior(){
    
        return null;
    }
    
    public Integer getMenor(){
    
        return null;
    }
    
    public Boolean hasDuplicidade(){
        
        return null;
    }
}
