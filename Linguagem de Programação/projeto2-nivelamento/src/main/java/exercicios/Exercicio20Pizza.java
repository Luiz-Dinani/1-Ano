package exercicios;

import java.util.Scanner;

/*
 * @author Luiz Dinani
 */
public class Exercicio20Pizza {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        Integer voto;
        Integer mussarela = 0;
        Integer calabresa = 0;
        Integer quatroQueijos = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.println("Vote no seu sabor favorito de pizza:"
                    + "\nMussarela = 5\nCalabresa = 25 \nQuatro Queijos = 50");
            
            voto = leitor.nextInt();
            
            switch (voto) {
                case 5:
                    mussarela++;
                    System.out.println("Obrigado por votar na mussarela <3");                    
                    System.out.println("-".repeat(15));                    
                    break;
                case 25:
                    calabresa++;
                    System.out.println("Obrigado por votar na calabresa <3");                    
                    System.out.println("-".repeat(15));                    
                    break;
                case 50:
                    quatroQueijos++;
                    System.out.println("Obrigado por votar na  Quatro Queijos <3");                    
                    System.out.println("-".repeat(15));                    
                    break;
                default:
                    System.out.println("Voto inválido. Use: \nMussarela = 5"
                            + "\nCalabresa = 25 \nQuatro Queijos = 50");
                    System.out.println("-".repeat(15));               
                    i--;
                    break;
            }
        }
        System.out.println(String.format("O resultado da pesquisa foi: "
                + "\nMussarela: %d \nCalabresa: %d \nQuatro Queijos: %d",
                mussarela, calabresa, quatroQueijos));
        
        if (mussarela > calabresa && mussarela > quatroQueijos) {
            System.out.println("A vencedora foi a pizza de MUSSARELA! YAY :)");
        }else if (calabresa > mussarela && calabresa > quatroQueijos) {
            System.out.println("A vencedora foi a pizza de CALABRESA! WOW :v");
        }else if (quatroQueijos>mussarela && quatroQueijos>calabresa){
            System.out.println("A vencedora foi a pizza de QUATRO QUEIJOS! YATTA ;p");
        }else{
            System.out.println("HOUVE UM EMPATE! A EQUIPE QUE TIVER MAIS MEMBROS"
                    + "VIVOS DAQUI A 10 MINUTOS VENCE!");
        }
    }
}