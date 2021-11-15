package exercicios.vendedor.comissao;

/**
 * @author aluno
 */
public class VendedorComissaoMaisSalario extends VendedorComissao{

    private Double salarioFixo;

    public VendedorComissaoMaisSalario(String codigo, String nome, Double vendas, Double taxa, Double salarioFixo) {
        super(codigo, nome, vendas, taxa);
        this.salarioFixo = salarioFixo;
    }
        
    @Override
    public Double calcularSalario() {
        return super.calcularSalario()+salarioFixo; //To change body of generated methods, choose Tools | Templates.
    }    

    @Override
    public String toString() {
        return "{" +
        " codigo='" + super.getCodigo() + "'" +
        ", nome='" + super.getNome() + "'" +
        ", vendas='" + super.getVendas() + "'" +
        ", taxa='" + super.getTaxa() + "'" +
            " salarioFixo='" + salarioFixo + "'" +
            "}";
    }
}