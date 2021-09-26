package exercicios.exercicio34.carro;

/*
 * @author Luiz Carlos Dinani
 */
public class Carro {
    private Boolean ligado;
    private String modelo;
    private Integer marcha=0;
    private Integer velocidade=0;

    public Carro(String modelo) {
        this.modelo = modelo;
    }
    
    public void ligar(){
        ligado=true;
        System.out.println("Carro Ligado!");
    }
    
    public void desligar(){
        ligado = false;
        System.out.println("Carro Desligado!");
    }
    
    public void aumentarMarcha(){
        if(marcha<=5 && ligado){
            marcha++;        
            System.out.println("Marcha Aumentada!");
            System.out.println("Marcha atual: " + marcha);            
        }
    }
    
    public void diminuirMarcha(){
        if(marcha>=-1 && ligado){
            marcha--;
            System.out.println("Marcha Diminuida!!");
            System.out.println("Marcha atual: " + marcha);
        }
    }
    
    public void acelerar(){
        if(ligado && velocidade<=120 && marcha!=0){
            velocidade += 10;
            System.out.println("Velocidade: " + velocidade);
        }
    }
    
    public void frear(){
        if(ligado && velocidade>=0){
            velocidade -= 10;
            System.out.println("Velocidade: " + velocidade);
        }
    }

    public Boolean getLigado() {
        return ligado;
    }

    public String getModelo() {
        return modelo;
    }

    public Integer getMarcha() {
        return marcha;
    }

    public Integer getVelocidade() {
        return velocidade;
    }        
}
