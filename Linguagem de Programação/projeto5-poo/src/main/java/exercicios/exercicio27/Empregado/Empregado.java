package exercicios.exercicio27.Empregado;

/*
 * @author Luiz Carlos Dinani
 */

public class Empregado {
  String nome;
  String cargo;
  Double salario;
  
  void reajustarSalario(Double pctReajuste){
    salario += salario*pctReajuste;
  }    
}