package exercicios;
import java.util.Scanner;

/*
 * @author Luiz Dinani
 */
public class Exercicio3CadastroUsuario {

    /*
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lerLogin = new Scanner(System.in);
        Scanner lerSenha = new Scanner(System.in);
        Scanner lerTentativas = new Scanner(System.in);
        
        System.out.println("Qual o seu Login?");
        String login = lerLogin.nextLine();
        
        System.out.println("Qual a sua senha?");
        String senha = lerSenha.nextLine();
        
        System.out.println("Quantas vezes você aceita errar a senha antes de"
                + "bloquearmos a conta?");
        Integer tentativas = lerTentativas.nextInt();
        
        System.out.println(String.format("Seu login é %s e sua senha é %s. Você"
                + " tem %d tentativas antes de ser bloqueado", login, senha, tentativas));
    }
}