package exercicio.vendedor.comissao;
import java.util.ArrayList;
import java.util.List;

/*
 * @author Luiz Dinani
 */
public class Departamento{
    private List<VendedorComissao> vendedores;

    public Departamento() {
        this.vendedores = new ArrayList<VendedorComissao>();
    }
    
    public void adicionarVendedor(VendedorComissao vendedor){
        if (vendedor != null) {
            vendedores.add(vendedor);            
        }
    }

    public Double calcularTotalSalario(){
        Double totalSalario = 0.00;
        for (VendedorComissao vendedor : vendedores) {
            totalSalario += vendedor.calcularSalario();
        }
        return totalSalario;
    }

    public void exibeTodos(){
        System.out.println("Vendedores Registrados: \n");
        for (VendedorComissao vendedor : vendedores) {
            System.out.println(vendedor);
        }
    }
}