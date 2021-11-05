package exercicio.imovel;
/*
 * @author aluno
 */
public class ImovelNovo extends Imovel{

    public ImovelNovo(Double preco, String endereco) {
        super(preco, endereco);
    }
    
    @Override
    public Double getPrecoVenda() {
        return super.getPrecoVenda()*1.1; //To change body of generated methods, choose Tools | Templates.
    }   
}