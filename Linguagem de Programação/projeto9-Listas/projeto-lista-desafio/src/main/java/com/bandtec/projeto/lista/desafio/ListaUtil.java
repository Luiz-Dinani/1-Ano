package com.bandtec.projeto.lista.desafio;

import java.util.List;
import java.util.ArrayList;

public class ListaUtil {

    private List<Integer> inteiros;

    public ListaUtil() {
        this.inteiros = new ArrayList<>();
    }

    public Integer count() {
        Integer contador = 0;
        for (Integer inteiro : inteiros) {
            contador++;
        }
        return contador;
    }

    public void add(Integer inteiro) {
        if (inteiro != null) {
            inteiros.add(inteiro);
        }
    }

    public void remove(Integer posicao) {
        inteiros.remove(posicao);
    }

    public Integer countPares() {
        Integer contador = 0;
        for (Integer inteiro : inteiros) {
            if (inteiro % 2 == 0) {
                contador++;
            }
        }
        return contador;
    }

    public Integer countImpares() {
        Integer contador = 0;
        for (Integer inteiro : inteiros) {
            if (inteiro % 2 != 0) {
                contador++;
            }
        }
        return contador;
    }

    public Integer somar() {
        Integer soma = 0;
        for (Integer inteiro : inteiros) {
            soma += inteiro;
        }
        return soma;
    }

    public Integer getMaior() {
        Integer maior = Integer.MIN_VALUE;
        if (inteiros.size() != 0) {
            for (Integer inteiro : inteiros) {
                if (inteiro > maior) {
                    maior = inteiro;
                }
            }
        } else {
            maior = 0;
        }
        return maior;
    }

    public Integer getMenor() {
        Integer menor = Integer.MAX_VALUE;

        if (inteiros.size() != 0) {
            for (Integer inteiro : inteiros) {
                if (inteiro < menor) {
                    menor = inteiro;
                }
            }
        } else {
            menor = 0;
        }
        return menor;
    }

    public Boolean hasDuplicidade() {
        Boolean duplicidades = false;
        Integer inteiro=0;
        if (inteiros.size() != 0) {
            for (int i = 0; i < inteiros.size(); i++) {
                    inteiro = inteiros.get(i);
                for (int j = i+1; j < inteiros.size(); j++) { //i=1 para não comparar o 1ª elemento com ele mesmo
                    Integer inteiro2 = inteiros.get(j);
                    if (inteiro == inteiro2) {
                        duplicidades = true;
                        return duplicidades; //O return quebra o laço, então assim que achar uma duplicidade, a função acaba
                    }
                }                
            }
        }
        return duplicidades; //Ainda precisa desse return pro caso de não ter duplicidade retornar false
    }
}
