package exercicios.exercicio25.confeitaria;

/*
 * @author Aluno
 */
public class Bolo {
    String sabor;
    Double valor;
    Integer quantidadeVendida;
    Boolean primeiraVenda = false;
    
    void comprarBolo(){
        if(quantidadeVendida>100){
            System.out.println("Seu pedido ultrapassou nosso limite diário para o bolo de " + sabor);                        
            quantidadeVendida=100;
        }else{
            if(!primeiraVenda){
                quantidadeVendida += quantidadeVendida;                
            }else{
                primeiraVenda=false;
            }
        }        
    }
    
    void exibirRelatorio(){
        System.out.println("=".repeat(15));
        System.out.println(String.format("O bolo sabor %s, foi comprado %d vezes"
                + " hoje, totalizando: R$ %.2f", sabor, quantidadeVendida, (quantidadeVendida*valor)));
        System.out.println("=".repeat(15));        
    }    
}