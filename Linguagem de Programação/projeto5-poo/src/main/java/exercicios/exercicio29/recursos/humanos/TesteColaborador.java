package exercicios.exercicio29.recursos.humanos;
/*
 * @author Luiz Carlos Dinani
 */
public class TesteColaborador {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Colaborador colaborador1 = new Colaborador();
        Colaborador colaborador2 = new Colaborador();
        RecursosHumanos rh = new RecursosHumanos();
        
        colaborador1.nome = "Luiz Carlos";
        colaborador1.cargo = "Cientista da Computação";
        colaborador1.salario = 10000000.00;
        
        colaborador2.nome = "Jorge Mariano";
        colaborador2.cargo = "Analista de Sistemas";
        colaborador2.salario = 1000.00;
        
        System.out.println("***** Infos do Colaborador 1 *****");
        System.out.println("Nome: " + colaborador1.nome);
        System.out.println("Cargo: " + colaborador1.cargo);
        System.out.println("Salário: " + colaborador1.salario);
        
        System.out.println("***** Infos do Colaborador 2 *****");
        System.out.println("Nome: " + colaborador2.nome);
        System.out.println("Cargo: " + colaborador2.cargo);
        System.out.println("Salário: " + colaborador2.salario);
        System.out.println("=".repeat(15));
        
        rh.promoverColaborador(colaborador1, "Engenheiro de Software", 1000000000.00);
        rh.promoverColaborador(colaborador2, "Dev de Sistemas", 10.00);
        rh.reajustarSalario(colaborador2, 0.50);
        
        System.out.println("***** Infos do Colaborador 1 *****");
        System.out.println("Nome: " + colaborador1.nome);
        System.out.println("Cargo: " + colaborador1.cargo);
        System.out.println("Salário: " + colaborador1.salario);
        
        System.out.println("***** Infos do Colaborador 2 *****");
        System.out.println("Nome: " + colaborador2.nome);
        System.out.println("Cargo: " + colaborador2.cargo);
        System.out.println("Salário: " + colaborador2.salario);
        System.out.println("=".repeat(15));
        
        System.out.println("Total Promovidos: " + rh.totalPromovidos);
        System.out.println("Total Reajustados: " + rh.totalReajustados);
    }    
}