package exercicios.consultoria;
public class Teste {
    public static void main(String[] args) {
        Consultoria consult = new Consultoria("BandTec Solutions", 2);
        Desenvolvedor dev1 = new Desenvolvedor("Jorge", 10, 5.00);
        Desenvolvedor dev2 = new Desenvolvedor("Michel", 80, 100.00);
        DesenvolvedorMobile dev3 = new DesenvolvedorMobile("Luiz", 50, 100.00, 30, 150.00);

        consult.getContratar(dev2);
        consult.getContratar(dev3);
        consult.getContratar(dev1);
        System.out.println("Existe Luiz? " + consult.getExistePorNome("Luiz"));
        consult.getBuscarNome("Luiz");
        System.out.println("Qtd Devs Total: " + consult.getQtdDevs()); 
        System.out.println("Qtd Devs Mobile: " + consult.getQtdDevsMobile());
        System.out.println("Total Salário: R$"+consult.getSomaSalarios());
        System.out.println(dev2);
        System.out.println(dev3);
    }
}