package br.com.bandtec.projeto.maven;

import com.github.javafaker.Faker; //Documentação: https://github.com/DiUS/java-faker
import java.util.Locale;

/*
 * @author Aluno
 */
public class TesteFaker {
    public static void main(String[] args) {
        Faker faker = new Faker(new Locale("pt","BR")); //Dependencia importada pelo GitHub, dá uma olhada no pom.xml em "Project Files" na tag Dependecies
        
        /*
            Para importar uma dependencia no Maven, vá em Project Files abaixo de
        </properties> colocar <dependencies></dependencies>, ir no repositorio
        do Maven (Só digitar "maven repo" no Google), procurar a biblioteca, escolher a versão
        e copiar o código que vai aparecer na parte de baixo de tela, depois é só colar
        o código dentro da tag dependencies
            
        */
        System.out.println(faker.name().fullName()); //O faker tem uma cacetada de funções vai colocando . e vendo kkkkk
        System.out.println(faker.harryPotter().spell());
    }
         
}
