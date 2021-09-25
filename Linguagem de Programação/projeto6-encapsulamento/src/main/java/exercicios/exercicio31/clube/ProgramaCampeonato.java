package exercicios.exercicio31.clube;

/**
 *
 * @author aluno
 */
public class ProgramaCampeonato {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Clube cor = new Clube("Corinthians");
        Clube pal = new Clube("Palmeiras");
        
        //Rodada 1
        cor.registrarVitoria();
        pal.registrarDerrota();
        
        //Rodada 2
        cor.registrarVitoria();
        pal.registrarDerrota();
        
        //Rodada 3
        cor.registrarEmpate();
        pal.registrarEmpate();
    
        //Finalizar Rodada
        System.out.println("Final de Temporada");
        cor.finalizarRodada();
        pal.finalizarRodada();
    }
    
}
