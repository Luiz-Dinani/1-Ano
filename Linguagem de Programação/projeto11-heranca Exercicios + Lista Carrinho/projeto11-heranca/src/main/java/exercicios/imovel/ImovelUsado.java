package exercicios.imovel;

/**
 *
 * @author aluno
 */
public class ImovelUsado extends Imovel{

    public ImovelUsado(Double preco, String endereco) {
        super(preco, endereco);
    }

    @Override
    public Double getPrecoVenda() { //Esse método substitui o getPrecoVenda() da classe Imovel
        return super.getPrecoVenda()*0.9;
    }   
}