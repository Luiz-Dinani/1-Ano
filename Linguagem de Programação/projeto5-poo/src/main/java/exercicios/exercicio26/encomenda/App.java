package exercicios.exercicio26.encomenda;

/*
 * @author Luiz Carlos Dinani
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Encomenda pct = new Encomenda();
        
        pct.altura = 50.00;
        pct.largura = 100.00;
        pct.enderecoRemetente = "Rua Padre Florêncio Luis Rodrigues";
        pct.enderecoDestinatario = "Rua Almirante Marquês de Leão";
        pct.distancia = 130.00;
        pct.valorEncomenda = 100.00;
        
        pct.calcularFrete();
        pct.emitirEtiqueta();
    }
    
}
