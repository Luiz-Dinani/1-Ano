package com.bandtec;

public class App {
    public static void main(String[] args) {
        Instrutor inst1 = new Instrutor("Torelli", 10, 10.00);
        Instrutor inst2 = new Instrutor("Paulão", 10, 20.00);
        Personal pers1 = new Personal("Wagner", 5, 50.00, 10, 100.00);
        Personal pers2 = new Personal("Fernando", 40, 40.00, 40, 75.00);
        
        Academia acad = new Academia("Academia de Ex Professores de Educação Física do Luiz", 3);

        acad.exibirInstrutores();

        acad.contratarInstrutor(inst1);
        acad.contratarInstrutor(pers1);
        acad.contratarInstrutor(inst2);
        acad.contratarInstrutor(pers2);

        acad.exibirInstrutores();
        acad.exibePersonalTrainers();
        acad.exibeFolhaDePagamento();

        if (acad.buscarInstrutor("Wagner") != null) {
            System.out.println("Wagner existe na Lista");
        } else {
            System.out.println("Wagner não existe na Lista");
        }

        if (acad.buscarInstrutor("Fernando") != null) {
            System.out.println("Fernando existe na Lista");
        } else {
            System.out.println("Fernando não existe na Lista \n");
        }
        
        System.out.println(acad);
    }
}