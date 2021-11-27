package exercicios.figuras;

public class Quadrado extends Figura{
    private Double lado;

    public Quadrado(String cor, Integer espessura, Double lado) {
        super(cor, espessura);
        this.lado = lado;
    }

    @Override
    public Double calculaArea() {        
        return Math.pow(lado, 2);
    }   

    @Override
    public String toString() {
        return String.format("Quadrado \nCor: %s\nEspessura: %d\nLado: %.2f \nÁrea: %.2f \n", super.getCor(), super.getEspessura(), lado, calculaArea());
    }       
}