package exercicios.exercicio36.pokemon;

/*
 * @author Luiz Dinani
 */
public class TestePokemon {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pokemon charmander = new Pokemon("Charmander", "Fogo", 100.00);
        Pokemon pikachu = new Pokemon("Pikachu", "Elétrico", 50.00);
        
        TreinadorPokemon enzo = new TreinadorPokemon("Enzo");
        TreinadorPokemon ash = new TreinadorPokemon("Ash");
        
        for (int i = 1; i <= 5; i++) {
            enzo.treinarPokemon(charmander);
        }
        System.out.println(charmander);
        
        enzo.evoluirPokemon(charmander, "Charmeleon");
        System.out.println(charmander);
        System.out.println("=".repeat(15));
        
        ash.treinarPokemon(pikachu);
        ash.treinarPokemon(pikachu);
        System.out.println(pikachu);
        
        ash.evoluirPokemon(pikachu, "Raichu");
        System.out.println("=".repeat(15));
                
        System.out.println(enzo);
        System.out.println("=".repeat(15));
        System.out.println(ash);
    }
    
}
