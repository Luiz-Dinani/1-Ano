package com.mycompany.projeto13.enums;

/*
 * @author aluno
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        dizerLocalidade(LocalizacaoEnums.SUDESTE);
        System.out.println(LocalizacaoEnums.SUDESTE.getAbreviacao());
        System.out.println(LocalizacaoEnums.SUDESTE.getCodigo());
        
        String localidade = "Sul";
        
        for (LocalizacaoEnums local : LocalizacaoEnums.values()) { //O .values pega os valores
            System.out.println(local.getCodigo());
        }
        
        Aluno aluno = new Aluno("Luiz", LocalizacaoEnums.fromCodigo(2));
}
     public static void dizerLocalidade(LocalizacaoEnums localizacao) {

        if (localizacao == LocalizacaoEnums.SUL) {
            System.out.println("Voce escolheu o Sul");
        } else if (localizacao == LocalizacaoEnums.SUDESTE) {
            System.out.println("Você escolheu o Sudeste");
        } else if (localizacao == LocalizacaoEnums.CENTRO_OESTE) {
            System.out.println("Você escolheu o Centro Oeste");
        } else if (localizacao == LocalizacaoEnums.NORDESTE) {
            System.out.println("Você escolheu o Nordeste");
        } else if (localizacao == LocalizacaoEnums.NORTE) {
            System.out.println("Você escolheu o Norte");
        }        
    }
}