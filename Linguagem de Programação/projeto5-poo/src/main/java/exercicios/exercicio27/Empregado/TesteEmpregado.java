package exercicios.exercicio27.Empregado;
/*
 * @author Luiz Carlos Dinani
 */
public class TesteEmpregado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Empregado func = new Empregado();
        Empregado func2 = new Empregado();
        
        func.nome = "João";
        func.salario = 5400.00;
        func.cargo = "Analista de Sistemas";
        
        func.reajustarSalario(0.15);
        System.out.println(String.format("Nome: %s \nCargo: %s \nSalário Reajustado: %.2f",
                func.nome, func.cargo, func.salario));
        
        func.nome = "Luiz Carlos";
        func.salario = 10000000.00;
        func.cargo = "Cientista da Computação";
        
        func.reajustarSalario(10.00);
        System.out.println(String.format("Nome: %s \nCargo: %s \nSalário Reajustado: %.2f",
                func.nome, func.cargo, func.salario));
    }   
}