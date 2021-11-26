package com.mycompany.projeto12.abstracao;

public class App {
    public static void main(String[] args) {
        //NÃO FAÇA ISSO!:
        // Funcionario func = new Funcionario("111", "Luiz") {

        //     @Override
        //     public Double calcSalario() {
        //         return null;
        //     }
            
        // };

        //É uma gambiarra para gerar um objeto de uma classe abstrata, mas toda vez que eu precisar da sobrescrita feita no construtor em outro objeto, vou ter que reescrever o método novamente
            Horista horista = new Horista("555", "Paulo", 100, 20.00);
            Vendedor vendedor = new Vendedor("666", "Jorge", 150.00, 0.6);
            Empresa empresa = new Empresa();

            //System.out.println(horista);
            //System.out.println(vendedor);
            //empresa.adicionarFunc(horista);
            //empresa.adicionarFunc(vendedor);
            //empresa.exibirFuncionarios();
            //empresa.exibeTotalSalario();
            
            Pessoa luiz = new Pessoa("Luiz");
            Pessoa anna = new Pessoa("Anna");

            System.out.println(luiz);
            System.out.println(anna);

            luiz.setIdadeMinimaVoto(25); //Deveria mudar apenas do Luiz, mas como o atributo é static, vai mudar para a Anna também
            
            System.out.println(luiz);
            System.out.println(anna);

            Pessoa.setIdadeMinimaVoto(18); //Como o static se referencia à classe Pessoa e é comum à todos os seus objetos, ela deve ser alterado diretamente na classe
        }
}