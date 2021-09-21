package exercicios.exercicio25.confeitaria;
/*
 * @author Aluno
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Bolo boloChocolate = new Bolo();
        Bolo boloMorango = new Bolo();
        Bolo boloAbacaxi = new Bolo();
        
        boloChocolate.sabor = "Chocolate";
        boloChocolate.valor = 35.00;
        boloChocolate.quantidadeVendida = 30;
        
        boloMorango.sabor = "Morango";
        boloMorango.valor = 40.55;
        boloMorango.quantidadeVendida = 5;
        
        boloAbacaxi.sabor = "Abacaxi";
        boloAbacaxi.valor = 50.00;
        boloAbacaxi.quantidadeVendida = 50;
        //for (int i = 1; i < 5; i++) {
        boloChocolate.comprarBolo();
        boloMorango.comprarBolo();
        boloAbacaxi.comprarBolo();        
        //}
        
        boloChocolate.exibirRelatorio();
        boloMorango.exibirRelatorio();
        boloAbacaxi.exibirRelatorio();                    
    }   
}