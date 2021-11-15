package exercicios.produtora;
public class Teste {
    public static void main(String[] args) {
        Produtora consult = new Produtora("BandTec Solutions", 2);
        Ator ator1 = new Ator("Jorge", 10, 5.00);
        Ator ator2 = new Ator("Michel", 80, 100.00);
        Protagonista prot = new Protagonista("Luiz", 50, 100.00, 30, 150.00);

        consult.getContratar(ator2);
        consult.getContratar(prot);
        consult.getContratar(ator1);
        System.out.println("Existe Luiz? " + consult.getExistePorNome("Luiz"));
        consult.getBuscarNome("Luiz");
        System.out.println("Qtd Atores Total: " + consult.getQtdAtores()); 
        System.out.println("Qtd Protagonista: " + consult.getQtdProtagonistas());
        System.out.println("Total Salário: R$"+consult.getSomaSalarios());
        System.out.println(ator2);
        System.out.println(prot);
    }
}