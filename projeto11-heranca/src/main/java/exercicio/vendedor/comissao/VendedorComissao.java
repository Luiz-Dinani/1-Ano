package exercicio.vendedor.comissao;

/*
 * @author aluno
 */

public class VendedorComissao {
    
    private String codigo;
    private String nome;
    private Double vendas; //Total vendido pelo vendedor, em dinheiro
    private Double taxa; //Quanto do total o vendedor recebe (em %)

    public VendedorComissao(String codigo, String nome, Double vendas, Double taxa) {
        this.codigo = codigo;
        this.nome = nome;
        this.vendas = vendas;
        this.taxa = taxa;
    }        
    
    public Double calcularSalario(){
        return vendas*(taxa/100);
    }    

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getVendas() {
        return vendas;
    }

    public void setVendas(Double vendas) {
        this.vendas = vendas;
    }

    public Double getTaxa() {
        return taxa;
    }

    public void setTaxa(Double taxa) {
        this.taxa = taxa;
    }
    
    

    @Override
    public String toString() {
        return "{" +
            " codigo='" + codigo + "'" +
            ", nome='" + nome + "'" +
            ", vendas='" + vendas + "'" +
            ", taxa='" + taxa + "'" +
            "}";
    }
}