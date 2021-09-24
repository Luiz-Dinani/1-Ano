package exercicios.exercicio28.termometro;

/*
 * @author Luiz Carlos Dinani
 */
public class TesteTermometro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Termometro term = new Termometro();
        
        term.temperaturaAtual = 50.00;
        term.temperaturaMax = 100.00;
        term.temperaturaMin = 25.00;
        
        term.aumentaTemperatura(55.00);
        term.diminuiTemperatura(95.00);
        term.exibeFahreinheit();
    }
    
}
