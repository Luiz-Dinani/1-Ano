package exercicios.figuras;

public class Triangulo extends Figura{
    private Double base;
    private Double altura;

    public Triangulo(String cor, Integer espessura, Double base, Double altura) {
        super(cor, espessura);
        this.base = base;
        this.altura = altura;
    }

    @Override
    public Double calculaArea() {
        return (base*altura)/2;
    }

    @Override
    public String toString() {
        return String.format("Triângulo \nCor: %s\nEspessura: %d\nBase: %.2f \nAltura: %.2f \nÁrea: %.2f \n", super.getCor(), super.getEspessura(), base, altura, calculaArea());
    }       
}
