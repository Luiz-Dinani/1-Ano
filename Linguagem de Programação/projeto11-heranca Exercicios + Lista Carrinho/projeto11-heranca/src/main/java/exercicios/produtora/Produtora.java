package exercicios.produtora;
import java.util.List;
import java.util.ArrayList;

public class Produtora {
    private final String nome; //Final é o equivalente à constante
    private final Integer vagas;
    private final List<Ator> atores;

    public Produtora(String nome, Integer vagas) {
        this.nome = nome;
        this.vagas = vagas;
        atores = new ArrayList<>(); //Não precisa do Ator entre <> pq ele já reconhece que do tipo Ator por conta da linha 8
    }

    private Boolean existePorNome(String nome) {
        if (nome != null) {
            for (Ator ator : atores) {
                if (ator.nome.equalsIgnoreCase(nome)) {
                    return true;
                }
            }
        }
        return false;
    }

    private void contratar(Ator ator){
        if (ator != null && atores.size()<vagas){
            atores.add(ator);
            System.out.println(ator.nome + " contratado(a)");
        }else{
            System.out.println("Sem vagas! "+ator.nome+" não contratado(a)");
        }
    }

    private Integer getQuantidadeAtores() {
        return atores.size();
    }

    private Integer getQuantidadeProtagonistas() {
        Integer qtdProtagonistas = 0;
        for (Ator ator : atores) {
            if (ator instanceof Protagonista){
                qtdProtagonistas++;
            }
        }
        return qtdProtagonistas;
    }

    private Double getTotalSalarios() {
        Double totalSalarios=0.00;
        for (Ator ator : atores) {
            totalSalarios += ator.getSalario();
        }
        return totalSalarios;
    }

    private Ator buscarAtorPorNome(String nome) {
        if (nome != null && existePorNome(nome)) {
            for (Ator ator : atores) {
                if(ator.nome.equalsIgnoreCase(nome)){
                    return ator;
                }
            }
        }
        return null;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();

        str.append((String.format("Nome: %s \nVagas: %d \nAtores Contratados: \n", nome, vagas)));
        
        for (Ator ator : atores) {
            str.append(ator+"\n");
        }
        return str.toString();
    }

    public Boolean getExistePorNome(String nome) {
        return existePorNome(nome);
    }

    public void getContratar(Ator ator) {
        contratar(ator);
    }

    public Integer getQtdAtores() {
        return getQuantidadeAtores();
    }

    public Integer getQtdProtagonistas() {
        return getQuantidadeProtagonistas();
    }

    public Double getSomaSalarios() {
        return getTotalSalarios();
    }

    public Ator getBuscarNome(String nome) {
        return buscarAtorPorNome(nome);
        
    }
}