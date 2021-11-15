package exercicios.consultoria;

import java.util.ArrayList;
import java.util.List;

public class Consultoria {
    
    private String nome;
    private Integer vagas;
    private List<Desenvolvedor> desenvolvedores;

    public Consultoria(String nome, Integer vagas) {
        this.nome = nome;
        this.vagas = vagas;
        this.desenvolvedores = new ArrayList<Desenvolvedor>();
    }

    private Boolean existePorNome(String nome) {
        if (nome != null) {
            for (Desenvolvedor desenvolvedor : desenvolvedores) {
                if (desenvolvedor.nome.equalsIgnoreCase(nome)) {
                    return true;    
                }
            }            
        }
        return false;
    }

    private void contratar(Desenvolvedor desenvolvedor) {
        if (desenvolvedor != null && desenvolvedores.size()<vagas) {
            desenvolvedores.add(desenvolvedor);
            System.out.println(desenvolvedor.nome + " add com sucesso!");
        }else{
            System.out.println("Sem vagas! " +desenvolvedor.nome+ " não adicionado(a)");
        }
    }

    private Integer getQuantidadeDesenvolvedores() {
        return desenvolvedores.size();
    }

    private Integer getQuantidadeDesenvolvedoresMobile() {
        Integer qtdDesenvolvedoresMobile=0;
        for (Desenvolvedor desenvolvedor : desenvolvedores) {
            if(desenvolvedor instanceof DesenvolvedorMobile){
                qtdDesenvolvedoresMobile++;
            }
        }
        return qtdDesenvolvedoresMobile;
    }

    private Double getTotalSalarios() {
        Double totalSalarios = 0.00;
        for (Desenvolvedor desenvolvedor : desenvolvedores) {
            totalSalarios += desenvolvedor.getSalario();
        }
        return totalSalarios;
    }

    private Desenvolvedor buscarDesenvolvedorPorNome(String nome) {
        if (nome != null && existePorNome(nome)) {
            for (Desenvolvedor desenvolvedor : desenvolvedores) {
                if (desenvolvedor.nome.equalsIgnoreCase(nome)) {
                    return desenvolvedor;
                }
            }
        }
        return null;
    }
    @Override
    public String toString() {        
        return String.format("Nome: %s \nVagas: %d \n", nome, vagas);
    }

    public Boolean getExistePorNome(String nome) {
        return existePorNome(nome);
    }

    public void getContratar(Desenvolvedor desenvolvedor) {
        contratar(desenvolvedor);
    }

    public Integer getQtdDevs() {
        return getQuantidadeDesenvolvedores();
    }

    public Integer getQtdDevsMobile() {
        return getQuantidadeDesenvolvedoresMobile();
    }

    public Double getSomaSalarios() {
        return getTotalSalarios();
    }

    public Desenvolvedor getBuscarNome(String nome) {
        return buscarDesenvolvedorPorNome(nome);
        
    }

}