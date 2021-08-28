package br.com.bandtec.projeto3.metodos;

/*
 * @author Aluno
 */
public class Utilitaria {
  //Public = Modificar acesso - quem pode ver esse método
  void exibirLinha(){ //void - tipo de função que não retorna nada para ninguém
      System.out.println("-".repeat(30));
      System.out.println("Aí sim, o cara usa exibirLinha, foda");
      System.out.println("-".repeat(30));
  }
  void exibirNome(){
      System.out.println("Luiz Carlos");
}
  void exibirNomeDecorado(){
  exibirLinha();
  exibirNome();
  }
}
