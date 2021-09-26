package exercicios.exercicio25.confeitaria;

/*
 * @author Aluno
 */
public class Bolo {

    String sabor;
    Double valor;
    Integer qtdVendidaAgr = 0;
    Integer quantidadeVendida = qtdVendidaAgr;

    void comprarBolo() {

        quantidadeVendida += qtdVendidaAgr;
        if (quantidadeVendida > 100) {
            System.out.println("Seu pedido ultrapassou nosso limite diário para o bolo de " + sabor);
            quantidadeVendida = 100;
        }
    }

    void exibirRelatorio() {
        System.out.println("=".repeat(15));
        System.out.println(String.format("O bolo sabor %s, foi comprado %d vezes"
                + " hoje, totalizando: R$ %.2f", sabor, quantidadeVendida, (quantidadeVendida * valor)));
        System.out.println("=".repeat(15));
    }
}
