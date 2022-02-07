package br.com.bandtec.luiz.carlos.c2;

/*
 * @author Luiz Carlos
 */
public class Loja {
    private String nome;
    private Integer quantidadeJogosVendidos;
    private Integer quantidadeDescontosAplicados;
    private Double totalFaturado;  
    //private Jogo jogo = new Jogo();

    public Loja(String nome) {
        this.nome = nome;
        this.quantidadeJogosVendidos = 0;
        this.quantidadeDescontosAplicados = 0;
        this.totalFaturado = 0.00;
    }  
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getQuantidadeJogosVendidos() {
        return quantidadeJogosVendidos;
    }

    public void setQuantidadeJogosVendidos(Integer quantidadeJogosVendidos) {
        this.quantidadeJogosVendidos = quantidadeJogosVendidos;
    }

    public Integer getQuantidadeDescontosAplicados() {
        return quantidadeDescontosAplicados;
    }

    public void setQuantidadeDescontosAplicados(Integer quantidadeDescontosAplicados) {
        this.quantidadeDescontosAplicados = quantidadeDescontosAplicados;
    }

    public Double getTotalFaturado() {
        return totalFaturado;
    }

    public void setTotalFaturado(Double totalFaturado) {
        this.totalFaturado = totalFaturado;
    }

    public void realizarVenda(Jogo jogo, Double valVenda){
        if (jogo.getEstoque()<1) {
            System.out.println("Operação Inválida");
        }else{
            jogo.setPreco(valVenda);
            System.out.println("\n------------");
            System.out.println("Relaizando venda sem desconto:");
            System.out.println(jogo);
            System.out.println("\n------------");           
            
            quantidadeJogosVendidos++;
            totalFaturado+=valVenda;
            jogo.setEstoque(jogo.getEstoque()-1);
        }
    }
    
    public void realizarVenda(Jogo jogo, Double valVenda, Double pctDesconto){
        if (jogo.getEstoque()<1) {
            System.out.println("Operação Inválida");
        }else{
            jogo.setPreco(valVenda*(1-pctDesconto/100));
            
            System.out.println("\n------------");
            System.out.println("Relaizando venda com desconto:");
            System.out.println(jogo);
            System.out.println("\n------------");           
            System.out.println(String.format("Valor da venda: R$ %.2f \n"
                    + "Valor do desconto: %.2f%% -> R$ %.2f\n"
                    + "Valor Final: R$ %.2f", valVenda, pctDesconto, 
                    valVenda*(pctDesconto/100),valVenda*(1-pctDesconto/100)));
            
            quantidadeJogosVendidos++;
            quantidadeDescontosAplicados++;
            totalFaturado+=valVenda*(1-pctDesconto/100);
            jogo.setEstoque(jogo.getEstoque()-1);
        }
    }    
    
    public void cadastrarEstoque(Jogo jogo, Integer qtdCadastrar){                
        System.out.println(String.format("O estoque do jogo %s foi alterado", jogo.getNome()));       
        jogo.setEstoque(jogo.getEstoque()+qtdCadastrar);        
    }
    
    @Override
    public String toString() {
        return String.format("\n%s \nQuantidade vendida: %d \nDescontos Aplicados: %d "
                + "\nTotal Faturado: R$ %.2f", nome, quantidadeJogosVendidos, 
                quantidadeDescontosAplicados, totalFaturado);
    }      
}