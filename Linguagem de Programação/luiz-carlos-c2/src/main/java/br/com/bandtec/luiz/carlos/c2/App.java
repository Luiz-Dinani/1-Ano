package br.com.bandtec.luiz.carlos.c2;
/*
 * @author Aluno
 */
public class App {
    /*
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Jogo bomDeGuerra = new Jogo("Bom de Guerra", "Ação");
        Jogo skirem = new Jogo("Skirem", "RPG");
        Loja pareJogo = new Loja("pareJogo");
        
        System.out.println(bomDeGuerra);
        System.out.println(skirem);
        
        pareJogo.realizarVenda(bomDeGuerra, 250.00);
        
        pareJogo.cadastrarEstoque(bomDeGuerra, 100);
        pareJogo.cadastrarEstoque(skirem, 100);
        
        pareJogo.realizarVenda(bomDeGuerra, 250.00);
        pareJogo.realizarVenda(skirem, 500.00, 25.00);
        
        System.out.println(bomDeGuerra);
        System.out.println(skirem);
        
        System.out.println(pareJogo);
    }    
}