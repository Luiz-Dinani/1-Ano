package exercicios;

/*
 * @author Luiz Dinani
 */
public class Exercicio24PesoIdeal {
    Double calculaPesoIdeal(String sexo, Double altura){
        Double pesoIdeal;
        if(sexo.equals('m')){
            pesoIdeal = (72.7*altura)-58;
        }else{
            pesoIdeal = (62.1*altura)-44.7;
        }
        return pesoIdeal;
    }
}
