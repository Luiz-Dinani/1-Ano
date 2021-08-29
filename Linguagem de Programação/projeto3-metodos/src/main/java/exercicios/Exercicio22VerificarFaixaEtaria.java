package exercicios;

/*
 * @author Luiz Dinani
 */
public class Exercicio22VerificarFaixaEtaria {
  void classificarIdade(Integer idadeUsuario){
      if(idadeUsuario<=2){
          System.out.println("Você é um Bebê");
      }else if(idadeUsuario<=11){
          System.out.println("Você é uma Criança");
      }else if(idadeUsuario<=19){
          System.out.println("Você é um Adolescente");
      }else if(idadeUsuario<=30){
          System.out.println("Você é um Jovem");
      }else if(idadeUsuario<=60){
          System.out.println("Você é um Adulto");
      }else if(idadeUsuario<=100){
          System.out.println("Você é um Velho Idoso");
      }else{
          System.out.println("Você é um ser Ancestral! Parabéns, eu acho. Cuida"
                  + "do pra não tropeçar nem levantar os braços hein");
      }
  }
}
