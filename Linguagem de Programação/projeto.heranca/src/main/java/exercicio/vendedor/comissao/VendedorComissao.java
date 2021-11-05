package exercicio.vendedor.comissao;

/*
 * @author aluno
 */

public class VendedorComissao {
    
    private Integer codigo;
    private String nome;
    private Double vendas; //Total vendido pelo vendedor, em dinheiro
    private Double taxa; //Quanto do total o vendedor recebe (em %)

    public VendedorComissao(Integer codigo, String nome, Double vendas, Double taxa) {
        this.codigo = codigo;
        this.nome = nome;
        this.vendas = vendas;
        this.taxa = taxa;
    }        
    
    public Double calcularSalario(){
        return vendas*(taxa/100);
    }    
    
}