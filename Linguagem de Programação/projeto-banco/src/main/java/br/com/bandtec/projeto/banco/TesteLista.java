package br.com.bandtec.projeto.banco;

import java.util.ArrayList;
import java.util.List;

/*
 * @author Aluno
 */

public class TesteLista {
    public static void main(String[] args) {
        String[] vetor = new String[10]; //Vetores em java tem tamanho definido
        Integer[] vetor2 = new Integer[10];
        
//        List listaShow = new ArrayList(); //Esse List é um vetor elástico, igual no JS
        
//        listaShow.add("Luiz"); //Para adicionar itens na lista é só usar .add
//        listaShow.add(18);
//        listaShow.add(1.90);
//        listaShow.add(true);
//        //Essa lista é meio merda pq permite vários tipos (String, Integer, Double e Boolean)
//        System.out.println(listaShow);

          List<String> filmes = new ArrayList(); //Lista do tipo Genérico String. O <> é conhecido como Diamond Operator
          
          filmes.add("Star Wars IV");
          //filmes.add(50); //Não funciona mais pq a lista é só pra String
          
          String filmeParaAdd = "Harry Potter";
          
          filmes.add(filmeParaAdd);
          
          filmes.add(0, "Senhor dos Anéis"); //Adiciona Senhor dos Anéis na Posição 0 da Lista, o Star Wars IV vai pra posição 1
          
          filmes.set(2, "Carros"); //O set substitui o item na posição pelo que vc quer, no caso tira o Harry Potter e coloca Carros
          
          filmes.remove(0); //Remove o item na posição 0, no caso, Senhor dos Anéis
          
          for (int i = 0; i < filmes.size(); i++) { //Na lista, o size() substitui o length
              System.out.println(filmes.get(i)); //Ao invés de fazer filmes[i] tem que usar o get
        }
          
          for (String filme : filmes) { //No Java isso é um For Aprimorado, em outras linguagens é o for each. Para cada filme na lista filmes, ele faz o print
              System.out.println(filme);
        }
          
          Aluno a1 = new Aluno();
          Aluno a2 = new Aluno();
          
          a1.setId(02211045);
          a1.setIdade(18);
          a1.setNome("Luiz");
                    
          a2.setId(9);
          a2.setIdade(1000);
          a2.setNome("Glaciete");
          
          List<Aluno> alunos = new ArrayList(); //Nessa lista só entram objetos do tipo Aluno
          
          alunos.add(a1);
          alunos.add(a2);
          
          for (int i = 0; i < alunos.size(); i++) {
            Aluno alunoDaVez = alunos.get(i);
            
              System.out.println(alunoDaVez);
        }
    }
}