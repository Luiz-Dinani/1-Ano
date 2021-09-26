package br.com.bandtec.projeto6.encapsulamento;

/*
 * @author aluno
 */
/*                          Parte 1 da Aula
    Modificadores de Acesso - Servem para garantir a integridade do "estado" do Objeto

default => Pode ser acessada em qualquer lugar no mesmo pacote
protected
private => A informação só pode ser usada pela Classe. Usar ao criar atributos, para garantir a integridade dos dados
public => Pode ser usada em qualquer lugar, até em outros pacotes. Usamos para 
*/
public class Aluno {

    private String ra;
    private String nome;
    private String curso;
    private Double nota1;
    private Double nota2;
    
    public String getRa(){  //Quando apenas 1 valor for retornado ou alterado, usar get ou set
        return ra;
    }

    //Não precisa ficar fazendo esses gets na unha, se apertar Alt+Insert e 
    //selecionar Getter vai aparecer uma lista de todas as vars, basta selecionar as que vc quer exibir 
    public String getNome() {
        return nome;
    }

    public String getCurso() {
        return curso;
    }

    public Double getNota1() {
        return nota1;
    }

    public Double getNota2() {
        return nota2;
    }
    
    //Nem todo get retorna uma característa do Objeto. Eu posso retornar a média,
    //mesmo sem ter decladrado ela    
    public Double getMedia(){   
        return (nota1+nota2)/2;
    }

    public void setRa(String ra) { //Isso poderia estar comentado, ver linha 94
        this.ra = ra; //TL:DR O this é usado para resolver conflitos de nomes iguais entre
                      //variáveis ou métodos e o argumento recebido pelo método.
                      
                      //O this serve para diferenciar a variavel ra (declarada 
                      //na linha 16) do argumento String ra (na linha 50)
                      //Para não precisar do this é só trocar o String ra (na linha 50)
                      //para String novoRA, por exemplo
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void setNota1(Double nota1) {
        this.nota1 = nota1;
    }

    public void setNota2(Double nota2) {
        this.nota2 = nota2;
    }
    
    //Parte 2 da aula - Construtor
    //Construtor - Um método especial que só é utilizado ao criar o objeto
    public Aluno(String ra, String nome, String curso){     //TODO CONSTRUTOR COMEÇA COM LETRA MAIÚSCULA e TEM O MESMO NOME DA CLASSE
        this.ra = ra;
        this.nome = nome;
        this.curso = curso;
        this.nota1 = 0.0;
        this.nota2 = 0.0;
    }
    
    //Um construtor também pode ser sobrecarregado, ou seja, pode ter mais de um com o mesmo nome, desde que os parâmetros sejam diferentes
    public Aluno(String ra, String nome, String curso, Double nota1, Double nota2){ //Esse construtor vai precisar que o usuario coloque as notas 1 e 2
        this.ra = ra;
        this.nome = nome;
        this.curso = curso;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }
    //Agora que temos o construtor, poderíamos remover o setRA, pois o RA do aluno é o mesmo para sempre
//Esse comando sobrescreve o método toString que, se usado no print mostrava a posição da var na memória
    @Override
    public String toString() {
        String texto = "RA: %s \nNome: %s \nCurso: %s \nNota1: %.2f \nNota2: %.2f";
        return String.format(texto, this.ra, this.nome, this.curso, this.nota1, this.nota2);
    }
    
}