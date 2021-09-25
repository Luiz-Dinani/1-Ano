package exercicios.exercicio31.clube;
/*
 * @author aluno
 */
public class Clube {

    private String nome;
    private Integer vitorias = 0;
    private Integer derrotas = 0;
    private Integer empates = 0;
    private Integer pontos = 0;

    public Clube(String nome) {
        this.nome = nome;
    }

    void rodada(Clube vencedor, Clube empate, Clube derrotado) {

    }

    public void registrarVitoria() {
        vitorias++;
        pontos += 3;
        System.out.println(nome + " GANHOU, PARABÉNS!");
        System.out.println(String.format("Pontos do %s: %d", nome, pontos));
        System.out.println("=".repeat(15));
    }

    public void registrarEmpate() {
        empates++;
        pontos++;
        System.out.println(nome + " Empatou, nhe");
        System.out.println(String.format("Pontos do %s: %d", nome, pontos));
        System.out.println("=".repeat(15));
    }

    public void registrarDerrota() {
        derrotas++;
        System.out.println("Tinha que ser o " + nome + " pra jogar mal assim");
        System.out.println(String.format("Pontos do %s: %d", nome, pontos));
        System.out.println("=".repeat(15));
    }
    
    public void finalizarRodada(){
        String frase = "%s: %d vitórias, %d empates, %d derrotas \nTotal de Pontos: %d";
        System.out.println(String.format(frase, nome, vitorias, empates, derrotas, pontos));
        
    }
}