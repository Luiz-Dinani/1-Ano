package exercicios.exercicio34.carro;

/*
 * @author Luiz Carlos Dinani
 */
public class TesteCarro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Carro carro = new Carro("Clio");
        
        carro.ligar();
        System.out.println("Estado: " + carro.getLigado());
        
        System.out.println("Modelo: " + carro.getModelo());
        carro.aumentarMarcha();
        carro.acelerar();
        carro.acelerar();        
        carro.diminuirMarcha();
        carro.frear();
        System.out.println("Marcha: " + carro.getMarcha());
        
        carro.desligar();
        System.out.println("Estado: " + carro.getLigado());
    }
    
}
