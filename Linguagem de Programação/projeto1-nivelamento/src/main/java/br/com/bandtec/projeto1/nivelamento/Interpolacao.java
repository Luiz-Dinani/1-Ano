package br.com.bandtec.projeto1.nivelamento;

/*
 * @author Aluno
 */
public class Interpolacao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nome = "Luiz";
        Integer idade = 18;
        Double altura = 1.87;
        Boolean aluno = true;
        /*
            Interpolação de Texto em Java:
        
        String.format(template, args) No template a gente coloca a frase, reser-
        vando espaços para as variáveis usando:
        
        %s para string
        %d para numeros inteiro
        %.Xf para numeros com casas decimais, no lugar do X coloca-se quantas 
        casas decimais você quer
        
        No args você coloca as variáveis, na sequência em que elas devem aparecer
        */
        
        /*
            Operador Ternário
        
        Serve para sustituir um if-else simples, como esse:
        
        String verificarAluno = ""
        
        if(aluno){
            verificarAluno = "SIM"
        }else{
            verificarAluno = "NÃO"
        }
        
        Com o ternário fica assim:
        
        String verificarAluno = aluno ? "Sim" : "Não";
        */
        String verificarAluno = aluno ? "Sim" : "Não";
        String infos = String.format("Nome: %s Idade: %d Altura: %.2f Aluno: %s", nome, idade, altura, verificarAluno); //format é um método da classe string
        System.out.println(infos);
    }
    
}
