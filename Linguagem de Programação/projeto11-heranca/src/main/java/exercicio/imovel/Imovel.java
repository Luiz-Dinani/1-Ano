package exercicio.imovel;

/*
 * @author aluno
 */
public class Imovel {
    private Double preco;
    private String endereco;

    public Imovel(Double preco, String endereco) {
        this.preco = preco;
        this.endereco = endereco;
    }
        
    public Double getPrecoVenda() {
        return preco;
    }

    @Override
    public String toString() {
        return "Imovel{" + "preco=" + preco + ", endereco=" + endereco + '}';
    }
    
    
}