package exercicios.exercicio30.conta.bancaria;
/*
 * @author aluno
 */
public class ContaBancaria {

//Vars do Cliente    
    private String nome;
    private Double saldo = 0.00;
    private String situacao;

    /*
     * @param nome
     * @param saldo
     */
    
    public ContaBancaria(String nome) {
        this.nome = nome;       
        //depositar(0.00);
        //this.saldo<0.00 ? this.saldo = 0.00 : this.saldo=saldo;
    }

    public void sacar(Double valSaque) {
        if ((saldo - valSaque) >= 0) {
            saldo -= valSaque;
        } else {
            System.out.println("Você não tem dinheiro suficiente para efetuar esse saque");
            System.out.println("Nome: " + getNome());
            System.out.println("Saldo: R$ " + getSaldo());
        }
    }
    
    public void depositar(Double valDeposito) {
        if ((saldo + valDeposito) <= 200) {
            saldo += valDeposito;
        } else {
            System.out.println("Você já tem dinheiro demais na conta (Compre BTC e vc terá mais esse problema!)");
            System.out.println("Nome: " + getNome());
            System.out.println("Saldo: R$ " + getSaldo());
        }
    }

    public String getNome() {
        return nome;
    }
    public Double getSaldo() {
        return saldo;
    }
    
    String verSituacao(){
        if(saldo<=50){
            situacao = "Ruim";
        }else if(saldo<=100){
            situacao = "Regular";
        }else{
            situacao = "Boa";
        }
        return situacao;
    }

    @Override
    public String toString() {
        String txt = "Nome: %s \nSaldo: R$ %.2f \nSituação: %s";
        return String.format(txt, this.nome, this.saldo, this.situacao);
    }    
}