package exercicios;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aluno
 */
public class Exercicio13Autenticacao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String usuario;
        String senha;
        Integer tentativas = 0;
        do {            
            if (tentativas == 0) {
            System.out.println("Insira seu usuário");        
            usuario = leitor.nextLine();
            System.out.println("Agora, insira sua senha");
            senha = leitor.nextLine();              
            }else{
                System.out.println("Login e/ou Senha inválidos, tá tentando invadir msm?");
                System.out.println("Insira seu usuário");        
                usuario = leitor.nextLine();
                System.out.println("Agora, insira sua senha");
                senha = leitor.nextLine();              
            }         
            tentativas++;
        } while (!usuario.equals("admin") && !senha.equals("#Bandtec"));
        System.out.println("Login realiado com sucesso. Seja bem vindo!");
    }    
}