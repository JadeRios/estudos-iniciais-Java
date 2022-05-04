package exercicio1;

public class quadrilatero {


    public static void calcularArea(double lado) {
        double areaQuadrado = lado * lado;
        System.out.println("A área do quadrado é igual a " + areaQuadrado);
    }

    public static void calcularArea(double altura, double largura) {
        double areaRetangulo = altura * largura;
        System.out.println("A área do retangulo é igual a " + areaRetangulo);
    }

    public static void calcularArea(double base1, double base2, double altura) {
        double areaTrapezio = ((base1 + base2) * altura)/ 2;
        System.out.println("A área do losango é igual a " + areaTrapezio);
    }
}