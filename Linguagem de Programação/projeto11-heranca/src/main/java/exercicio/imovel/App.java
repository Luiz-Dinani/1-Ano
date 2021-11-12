package exercicio.imovel;

/*
 * @author aluno
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Imovel imov1 = new Imovel(100.00, "Votorantim");
        ImovelUsado imov2 = new ImovelUsado(100.00, "Taipas");
        ImovelNovo imov3 = new ImovelNovo(100.00, "Pd Florencio");
        
        System.out.println(imov1.getPrecoVenda());
        System.out.println(imov2.getPrecoVenda());
        System.out.println(imov3.getPrecoVenda());
    }    
}