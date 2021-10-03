package exercicios.exercicio36.pokemon;

/*
 * @author Luiz Dinani
 */
public class TreinadorPokemon {

    private String nome;
    private Integer nivel;

    public TreinadorPokemon(String nome) {
        this.nome = nome;
        this.nivel = 1;
    }
    
    

    public void treinarPokemon(Pokemon pokemon) {
        pokemon.setForca(pokemon.getForca() * 1.1);
        pokemon.setDoces(pokemon.getDoces() + 10);
        nivel += 2;
    }

    private String nomeAntigo;

    public void evoluirPokemon(Pokemon pokemon, String nomeEvolucao) {
        if (pokemon.getDoces() >= 50) {
            nomeAntigo = pokemon.getNome();
            pokemon.setNome(nomeEvolucao);
            pokemon.setDoces(pokemon.getDoces() - 50);
            
            System.out.println(String.format("Pokémon %s evoluiu para -> %s",
                    nomeAntigo, nomeEvolucao));
        }else{
            System.out.println(String.format("Doces Insuficientes, faltam %d", 
                    (50-pokemon.getDoces())));
        }
    }

    @Override
    public String toString() {
        String txt = String.format("Nome: %s \nNível: %s", nome, nivel);
        return txt;
    }
    
    
}
