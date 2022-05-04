package exercicio1;

public class areaQuadrilatero {

    public static double area(double lado) {
        return lado * lado;
    }

    public static double area(double altura, double largura) {
        return altura * largura;
    }

    public static double area(double base1, double base2, double altura) {
        return ((base1 + base2) * altura)/ 2;
    }
}
