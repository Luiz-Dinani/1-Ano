package exercicios.exercicio29.recursos.humanos;
/*
 * @author Luiz Carlos Dinani
 */
public class RecursosHumanos {
    Colaborador colaborador = new Colaborador();
    Integer totalPromovidos=0;
    Integer totalReajustados=0;
    Double novoSalario;
    
  void reajustarSalario(Colaborador colaborador, Double valReajuste){
    colaborador.salario = colaborador.salario * valReajuste;
    totalReajustados++;
  }
  
  void promoverColaborador(Colaborador colaborador, String novoCargo, Double novoSalario){
      if(novoSalario>colaborador.salario){
          colaborador.cargo = novoCargo;
          colaborador.salario = novoSalario;
          System.out.println("Parabéns " + colaborador.nome + "pela promoção!");
          totalPromovidos++;
      }else{
          System.out.println("Operação Inválida");
          System.out.println("Colaborador " + colaborador.nome + "não foi promovido");
      }
  }
}