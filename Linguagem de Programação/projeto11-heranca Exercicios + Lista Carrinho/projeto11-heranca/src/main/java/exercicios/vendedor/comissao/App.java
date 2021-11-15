package exercicios.vendedor.comissao;

/*
 * @author aluno
 */
public class App {    
    /**
     * @param args the command line arguments
     */    
    public static void main(String[] args) {
        VendedorComissao vend1 = new VendedorComissao("01", "Jorge", 100000.00, 10.00);
        VendedorComissaoMaisSalario vend2 = new VendedorComissaoMaisSalario("02", "Glaciete", 100000.00, 10.00, 1000.00);
        Departamento dep = new Departamento();

        dep.adicionarVendedor(vend1);
        dep.adicionarVendedor(vend2);

        System.out.println(vend1.calcularSalario());
        System.out.println(vend2.calcularSalario());
        System.out.println("=".repeat(15));
        System.out.println(String.format("Total pago em Salário: %.2f", dep.calcularTotalSalario()));
        dep.exibeTodos();
    }   
}