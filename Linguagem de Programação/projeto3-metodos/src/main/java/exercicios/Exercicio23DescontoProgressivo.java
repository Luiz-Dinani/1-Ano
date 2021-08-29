package exercicios;

/*
 * @author Luiz Dinani
 */
public class Exercicio23DescontoProgressivo {
    Double calcularDesconto(Double valUni, Integer qtdItens){
        Double desconto;
        if(qtdItens==1){
            desconto = valUni*0.9;    
        }else if(qtdItens==2){
            desconto = valUni*qtdItens*0.8;    
        }else{
            desconto = valUni*qtdItens*0.7;    
        }
        return desconto;
    }
    
    String exibirNotaFiscal(Double valUni, Integer qtdItens, Double desconto){
        String notaFiscal = String.format("-".repeat(30) + 
                "\nValor do Produto: %.2f \nQuantidade: %d\n" + "-".repeat(30) + 
                "\nValor com Desconto: %.2f", valUni, qtdItens, desconto);        
        
        return notaFiscal;
    }
}
