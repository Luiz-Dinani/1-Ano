package exercicios.exercicio33.lutadores;

/**
 *
 * @author Luiz Carlos Dinani
 */
public class Lutador {
    private Integer vida = 100;
    
    public void apanhar(){
        vida -= 10;
    }
    
    public void concentrarForca(){
        vida += 2;
    }

    public Integer getVida() {
        return vida;
    }        
}
