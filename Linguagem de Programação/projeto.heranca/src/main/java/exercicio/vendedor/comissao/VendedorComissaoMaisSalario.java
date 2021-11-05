package exercicio.vendedor.comissao;

/**
 *
 * @author aluno
 */
public class VendedorComissaoMaisSalario extends VendedorComissao{

    private Double salarioFixo;

    public VendedorComissaoMaisSalario(Double salarioFixo, Integer codigo, String nome, Double vendas, Double taxa) {
        super(codigo, nome, vendas, taxa);
        this.salarioFixo = salarioFixo;
    }
        
    @Override
    public Double calcularSalario() {
        return super.calcularSalario()+salarioFixo; //To change body of generated methods, choose Tools | Templates.
    }    
}