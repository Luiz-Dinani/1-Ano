package exercicios;
/*
 * @author Aluno
 */
public class Exercicio21ClassesSociais {
    Double CalcQtdSM(Double renda){
        Double salMin = 1100.00; //Coloquei 1100 pq o prof pediu no enunciado, mas o valor correto seria 1045, de acordo com a tabela
        Double qtdSM = renda/salMin;
        return qtdSM;
    }
    
    void VerifClasse(Double qtdSM){
        if(qtdSM<=2) {
            System.out.println("Você pertence à classe E");
        }else if(qtdSM<=4) {
            System.out.println("Você pertence à classe D");
        }else if(qtdSM<=10) {
            System.out.println("Você pertence à classe C");
        }else if(qtdSM<=20) {
            System.out.println("Você pertence à classe B");
        }else{
            System.out.println("Você pertence à classe A");
        }
    }
}