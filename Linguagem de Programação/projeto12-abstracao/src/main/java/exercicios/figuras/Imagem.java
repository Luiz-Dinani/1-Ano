package exercicios.figuras;

import java.util.ArrayList;
import java.util.List;

public class Imagem {

    private List<Figura> figuras;

    public Imagem() {
        this.figuras = new ArrayList<>();
    }

    public void adicionaFigura(Figura figura){
        figuras.add(figura);
    }

    public void exibeFiguras() {
        for (Figura figura : figuras) {
            System.out.println(figura);
        }
    }

    public void exibeSomaArea() {
        Double somaArea = 0.00;

        for (Figura figura : figuras) {
            somaArea += figura.calculaArea();
        }
        System.out.println("Soma das Áreas: " + somaArea);
    }

    public void exibeFiguraMaior20() {
    
        for (Figura figura : figuras) {
            if(figura.calculaArea()>20){
                System.out.println(figura);
            }
        }
    }

    public void exibeQuadrado() {
        for (Figura figura : figuras) {
            if (figura instanceof Quadrado) {
                System.out.println(figura);
            }
        }
    }

}