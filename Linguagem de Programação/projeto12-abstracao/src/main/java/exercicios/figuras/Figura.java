package exercicios.figuras;

public abstract class Figura {
    private String cor;
    private Integer espessura;


    public Figura(String cor, Integer espessura) {
        this.cor = cor;
        this.espessura = espessura;
    }
    
    public abstract Double calculaArea();

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Integer getEspessura() {
        return espessura;
    }

    public void setEspessura(Integer espessura) {
        this.espessura = espessura;
    }

    @Override
    public String toString() {
        return String.format("Cor: %s \nEspessura: %d \nCalcular Área: %.2f", cor, espessura, calculaArea());
    }
}
