package exercicio.vendedor.comissao;

/*
 * @author aluno
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        VendedorComissao vend1 = new VendedorComissao(01, "Jorge", 100000.00, 10.00);
        VendedorComissaoMaisSalario vend2 = new VendedorComissaoMaisSalario(1000.00, 02, "Glaciete", 100000.00, 10.00);
        
        System.out.println(vend1.calcularSalario());
        System.out.println(vend2.calcularSalario());
    }
    
}
