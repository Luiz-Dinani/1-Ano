package exercicios.exercicio30.conta.bancaria;

/*
 * @author aluno
 */
public class AppCliente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria("Luiz");
        
        conta.depositar(10.00);
        conta.sacar(100.00);
        
        System.out.println(conta);
    }
    
}
