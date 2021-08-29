package exercicios;

import java.util.Scanner;

/*
 * @author Aluno
 */
public class TestarClasses {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leitorNumericos = new Scanner(System.in);
        Scanner leitorTexto = new Scanner(System.in);
        Exercicio21ClassesSociais cs = new Exercicio21ClassesSociais();
        Exercicio22VerificarFaixaEtaria vfe = new Exercicio22VerificarFaixaEtaria();
        Exercicio23DescontoProgressivo desc = new Exercicio23DescontoProgressivo();
        Exercicio24PesoIdeal pi = new Exercicio24PesoIdeal();
        
        System.out.println("-".repeat(30));
        System.out.println("Exercício 1\n");
        Double renda;
        do {            
            System.out.println("Qual a sua renda bruta?");
            renda = leitorNumericos.nextDouble();  
            if (renda<0) {
                System.out.println("Eu perguntei a renda bruta animal,"
                        + "sem descontar nada");
            }
        } while (renda<0);
        
        Double verQtdSal = cs.CalcQtdSM(renda);
        System.out.println(String.format("Você recebe: %.1f salários mínimos",verQtdSal)); 
        cs.VerifClasse(verQtdSal);
        
        System.out.println("-".repeat(30));
        System.out.println("Exercício 2\n");
        Integer idadeUsuario;
        do {            
            System.out.println("Insira sua idade: ");            
            idadeUsuario = leitorNumericos.nextInt();
        } while (idadeUsuario<0);
        vfe.classificarIdade(idadeUsuario);
        
        System.out.println("-".repeat(30));
        System.out.println("Exercício 3\n");
        System.out.println("Bem Vindo ao Sistema de Desconto Progressivo");
        Double valUni;
        Integer qtdItens;
        
        do {            
            System.out.println("Insira o valor unitário do produto");            
            valUni = leitorNumericos.nextDouble();
        } while (valUni<=0);
        
        
        do {            
            System.out.println("Insira a quantidade de itens comprados");                        
            qtdItens = leitorNumericos.nextInt();
        } while (qtdItens<=0);
        
        Double desconto = desc.calcularDesconto(valUni, qtdItens);
        String notaFiscal = desc.exibirNotaFiscal(valUni, qtdItens, desconto);
        System.out.println(notaFiscal);
        
        System.out.println("-".repeat(30));
        System.out.println("Exercício 4\n");
        String sexo;
        Double altura;
        
        System.out.println("Qual o seu sexo? (m/f)");
        
        do {            
            sexo = leitorTexto.nextLine();
            if (!sexo.equals("m") && !sexo.equals("f")) {
                System.out.println("Não inventa moda porra, tu é Macho ou Fêmea?");
            }
        } while (!sexo.equals("m") && !sexo.equals("f"));
        
        do {            
            System.out.println("Qual a sua altura (em metros. Use , para separ m de cm)?");
            altura = leitorNumericos.nextDouble();
            if (altura>3) {
                System.out.println("OLHA O POSTE KKKKK TÁ PORRA");
            }
        } while (altura>3);
        Double pesoIdeal = pi.calculaPesoIdeal(sexo, altura);
        System.out.println(String.format("Seu peso ideal é: %.2f kg", pesoIdeal));        
    }   
}