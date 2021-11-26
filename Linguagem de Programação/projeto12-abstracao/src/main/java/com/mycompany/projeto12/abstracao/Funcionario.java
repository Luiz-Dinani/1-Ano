package com.mycompany.projeto12.abstracao;

/*
 * @author aluno
 */
public abstract class Funcionario{ //Classes Abstratas não podem ser instânciadas (Funcionario func = new Funcionario não funciona)
        private String cpf;
        private String nome;

        //O construtor é usado apenas para iniciar as variáveis, mas ainda não é possível criar uma instância Funcionario
        //Classes Herdeiras ainda são obrigadas a inicializar essas variáveis
        public Funcionario(String cpf, String nome) {
                this.cpf = cpf;
                this.nome = nome;
        }

        public abstract Double calcSalario(); //Métodos abstratos não têm corpo, são usados quando sabe-se que o método será necessário, mas não se sabe como o método será aplicado nas outras classes.
        //Um método abstrato DEVE aparecer em todas as classes herdeiras

        public String getCpf() {
                return cpf;
        }

        public void setCpf(String cpf) {
                this.cpf = cpf;
        }

        public String getNome() {
                return nome;
        }

        public void setNome(String nome) {
                this.nome = nome;
        }

        @Override
        public String toString() {        
        return String.format("CPF: %s \nNome: %s", cpf, nome);
        }
}
