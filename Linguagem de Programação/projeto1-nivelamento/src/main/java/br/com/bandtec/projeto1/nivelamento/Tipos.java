package br.com.bandtec.projeto1.nivelamento;

/*
 * @author Luiz Dinani
 */
public class Tipos {

    /**
     * @param args the command line arguments
     */
    //Torna a clase executável;
    //Indicativo do ponto de entrada. É por aqui que o código começa a ser lido, mesmo se ela estiver no meio do código (Nesse caso ele lê tudo que vem depois da main)
    public static void main(String[] args) {
        //String: tipo para texto (Alfanumérico) DEVE-SE SEMPRE USAR ASPAS DUPLAS
        String nome = "Diego";
        String faculdade = "Bandtec";
        String profAssistente = "Paulo";
        
        //Integer: Utilizaremos para numéricos inteiros
        Integer idadeDiego = 28;
        Integer idadePaulo = 45;
        Integer numeroDaSorte = 42;
        
        /*
        Tipos Primitivos:
        int
        double
        boolean
        ...
        Não aceitam "null"
        São apenas uma variável
        
        Class Wrappers (Usaremos essas):
        Integer - Para números inteiros
        Double - Para números com casas decimais
        Boolean - Para representar verdadeiro ou falso
        
        Aceitam "null"
        Tem métodos próprios, não precisam de conversão
        */
        
        Double valor = 10.50;
        Double altura = 1.875;
        
        Boolean ligado = true;
        Boolean temMundial = false;
        Boolean eMaior = idadeDiego>30;
        
        System.out.println("Resultado do eMaior: " + eMaior);
    }
    
}
