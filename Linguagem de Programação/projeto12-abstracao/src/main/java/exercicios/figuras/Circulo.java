package exercicios.figuras;

public class Circulo extends Figura{

    private Double raio;

    public Circulo(String cor, Integer espessura, Double raio) {
        super(cor, espessura);
        this.raio = raio;
    }

    @Override
    public Double calculaArea() {
        return Math.PI*Math.pow(raio,2);
    }    
    @Override
    public String toString() {
        return String.format("Círculo \nCor: %s\nEspessura: %d \nRaio: %.2f \nÁrea: %.2f \n", super.getCor(), super.getEspessura(), raio, calculaArea());
    }       
}