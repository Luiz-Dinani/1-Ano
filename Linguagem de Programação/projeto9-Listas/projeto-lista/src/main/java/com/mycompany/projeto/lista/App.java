package com.mycompany.projeto.lista;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author aluno
 */
public class App {
    public static void main(String[] args) {        
        List<Integer> listaInteiros = new ArrayList();
        
        listaInteiros.add(10);
        listaInteiros.remove(0); //Pode passar ou a posição ou o objeto a ser removido
        
        listaInteiros.add(500);
        listaInteiros.set(0, 100); //Substitui o item na posicao 0 por 100
        
        listaInteiros.removeAll(listaInteiros);
        
        
        
        
        listaInteiros.add(10);
        listaInteiros.add(100);
        listaInteiros.add(1000);
        listaInteiros.add(10000);
        
        for (int i = 0; i < listaInteiros.size(); i++) {
            Integer get = listaInteiros.get(i); //O get pega o que estiver nessa posição da lista é tipo um lista[i]
            System.out.println(get);
        }
        
        //Enhanced For - Funciona igual o For Each
        for (Integer inteiro : listaInteiros) {
            System.out.println(inteiro);
        }
        
        //Tem o For Each aqui também
        listaInteiros.forEach((inteiro) -> {
            System.out.println(inteiro);
        });
        
        Musica m1 = new Musica("A", "Rave Funk");
        Musica m2 = new Musica("B", "Clássica");
        Musica m3 = new Musica("C", "Eletrônica");
        Musica m4 = new Musica("D", "Forró");
        Musica m5 = new Musica("E", "Rap");
        
        List<Musica> listaMusicas = new ArrayList();
        
        listaMusicas.add(m1); //Poderia fazer listaMusicas.add(new Musica("A", "Rave Funk");)
        listaMusicas.add(m2);
        listaMusicas.add(m3);
        listaMusicas.add(m4);
        listaMusicas.add(m5);
        
        for (Musica musica : listaMusicas) {
            System.out.println(musica.getNome()+" "+musica.getGenero());         
        }
    }
}