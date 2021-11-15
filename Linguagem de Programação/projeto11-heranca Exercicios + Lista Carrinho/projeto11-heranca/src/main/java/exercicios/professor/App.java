package exercicios.professor;

/*
 * @author aluno
 */
public class App {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        Professor prof = new Professor(01, "Jorge", 10, 20.00);
        Coordenador coord = new Coordenador(02, "Rosa", 10, 10.00, 20, 20.00, "Mecatrônica");
        Faculdade facul = new Faculdade("BandTec", 2);

        System.out.println(prof);        
        System.out.println(coord);        

        facul.contratarProfessor(coord);
        facul.contratarProfessor(prof);
        facul.exibirProfessores();
        System.out.println(facul.toString());
    }
}