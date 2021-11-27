package exercicios.figuras;

public class Retangulo extends Figura{
    private Double base;
    private Double altura;

    public Retangulo(String cor, Integer espessura, Double base, Double altura) {
        super(cor, espessura);
        this.base = base;
        this.altura = altura;
    }

    @Override
    public Double calculaArea() { 
        return base*altura;
    }

    @Override
    public String toString() {
        return String.format("Retângulo \nCor: %s\nEspessura: %d\nBase: %.2f \nAltura: %.2f \nÁrea: %.2f \n", super.getCor(), super.getEspessura(), base, altura, calculaArea());
    }       
}