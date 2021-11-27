package exercicios.figuras;
public class App {
    public static void main(String[] args) {
        Quadrado quad = new Quadrado("Azul", 10, 15.00);
        Retangulo retang = new Retangulo("Preto", 50, 100.00, 500.00);
        Triangulo triang = new Triangulo("Rosa", 15, 20.00, 70.00);
        Circulo circ = new Circulo("Vermelho", 3, 361728000.00); //É o círculo de transmutação do Homem do Frasco em Amestris! (em metros)

        System.out.println(quad);
        System.out.println(retang);
        System.out.println(triang);
        System.out.println(circ);

        Imagem img = new Imagem();
        img.adicionaFigura(quad);
        img.adicionaFigura(retang);
        img.adicionaFigura(triang);
        img.adicionaFigura(circ);
        
        img.exibeFiguras();
        img.exibeSomaArea();
        img.exibeFiguraMaior20();
        img.exibeQuadrado(); 
    }
}