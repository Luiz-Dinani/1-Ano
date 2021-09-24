package exercicios.exercicio26.encomenda;
/*
 * @author Luiz Carlos Dinani
 */
public class Encomenda {
    Double altura;
    Double largura;
    String enderecoRemetente; //Endereço Remetente
    String enderecoDestinatario; //Endereço Destinatário
    Double distancia;    
    Double valorEncomenda;    
    String tamanho;
    Double frete;    
    void calcularFrete(){
        if(altura<=6 && largura<=16){
            tamanho = "Pequeno";
            frete = valorEncomenda*0.01;
        }else if(altura<=15 && largura<=50){
            tamanho = "Médio";
            frete = valorEncomenda*0.03;
        }else{
            tamanho = "Grande";
            frete = valorEncomenda*0.05;
        }
        
        if(distancia<=50){
            frete += distancia*3;
        }else if(distancia<=200){
            frete += distancia*5;
        }else{
            frete += distancia*7;
        }
    }
        
    void emitirEtiqueta(){
        System.out.println("***** ETIQUETA PARA ENVIO *****");
        System.out.println(String.format("Endereço do remetente: %s \nEndereço "
                + "Destinatário: %s \nAltura da Encomenda: %.2f cm \nLargura da "
                + "Encomenda: %.2f cm \nTamanho: %s", enderecoRemetente, enderecoDestinatario,
                altura, largura, tamanho));
        System.out.println("-".repeat(15));
        System.out.println(String.format("Valor da Encomenda: R$ %.2f \nValor do"
                + " Frete: %.2f", valorEncomenda, frete));
        System.out.println("-".repeat(15));
        System.out.println("Valor Total: R$"+(valorEncomenda+frete));
    }
}