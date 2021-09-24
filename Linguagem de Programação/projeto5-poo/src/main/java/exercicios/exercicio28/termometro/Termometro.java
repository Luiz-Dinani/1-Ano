package exercicios.exercicio28.termometro;

/*
 * @author Luiz Carlos Dinani
 */

public class Termometro {
  Double temperaturaAtual;
  Double temperaturaMax;
  Double temperaturaMin;
  
  void aumentaTemperatura(Double valAumentaTemp){
      temperaturaAtual += valAumentaTemp;
      if(temperaturaAtual>temperaturaMax){
          temperaturaMax = temperaturaAtual;
      }
      System.out.println("Temperatura Máxima: " + temperaturaMax + " ºC");
  }
  
  void diminuiTemperatura (Double valDiminuiTemp){
      temperaturaAtual -= valDiminuiTemp;
      if(temperaturaAtual<temperaturaMin){
          temperaturaMin = temperaturaAtual;
      }
      System.out.println("Temperatura Mínima: " + temperaturaMin + " ºC");
  }
  void exibeFahreinheit(){
      Double tempF = (temperaturaAtual*9/5)+32;
      System.out.println(temperaturaAtual + " ºC " + "Em Fahreinheit: " + tempF + " ºF");
  }
}
