package br.com.bandtec.provaac1luizcarlos1ccoa;
import java.util.Scanner;
/*
 * @author Luiz-Dinani
 */
public class VendaLivro {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leitorNum = new Scanner(System.in);
                
        System.out.println("Bem Vindo escritor! Realize o controle do lançamento"
                + " do seu livro:");
        
        System.out.println("Quantidade de livros em estoque:");
        Integer qtdEstoque = leitorNum.nextInt();
                
        System.out.println("Meta de vendas dos livros (%)");
        Double pctMeta = leitorNum.nextDouble();
        while(pctMeta>100){
            System.out.println("Sua meta não pode ser maior que 100%");
            System.out.println("Digite uma Meta de vendas válida (%)");
            pctMeta = leitorNum.nextDouble();
        }
       
        Double qtdMeta = qtdEstoque*(pctMeta/100);            
        
        System.out.println(String.format("Para atingir a meta, você precisa vender"
                + " %.0f livros", qtdMeta));
        
        Boolean sair = false;
        while(!sair){
            System.out.println("Escolha os próimos passos: \n1 - Vender Livros\n"
                    + "2 - Sair");
            Integer escolhaUser = leitorNum.nextInt();
            
            Integer livrosVendidos;
            switch (escolhaUser) {
                case 1:
                    System.out.println("Digite a quantidade de livros escolhida:");
                    livrosVendidos = leitorNum.nextInt();    
                    while (livrosVendidos>qtdEstoque) {                                                                        
                            System.out.println("Infelizmente você não possui"
                                    + " exemplares o suficiente para a venda.");
                            System.out.println(String.format("Quantidade Disponível:"
                                    + "%d", qtdEstoque));
                            System.out.println("Digite uma quantidade válida:");
                            livrosVendidos = leitorNum.nextInt();                                                          
                    }                                                           
                    for(Integer i = 1; i<=livrosVendidos; i++){
                        System.out.println(String.format("Vendendo %dº livro", i));
                            qtdEstoque--;                            
                        }
                    System.out.println(String.format("Você acabou de "
                        + "vender %d livro(s)! \nQuantidade em estoque:"
                        + " %d \nMeta de Vendas: %.0f (%.2f%%)", 
                            livrosVendidos, qtdEstoque, qtdMeta, pctMeta));                                    
                    break;
                case 2:
                    System.out.println("Até Logo");
                    sair=true;
                    break;
                default:
                    System.out.println("Número Inválido, digite 1 ou 2");
                    break;
            }                        
        }
    }    
}