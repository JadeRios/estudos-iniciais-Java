package exercicio1;

public class main {

    public static void main(String[] args) {


        System.out.println("Exercício Calculadora");
        calculadora.soma(3, 5);
        calculadora.subtracao(4, 5);
        calculadora.multiplicacao(2.5, 5);
        calculadora.divisao(4, 8);


        System.out.println("Exercício mensagem");
        mensagem.obterMensagem(9);
        mensagem.obterMensagem(14);
        mensagem.obterMensagem(19);

        System.out.println("Exercício empréstimo");
        emprestimo.calcular(1000, emprestimo.getDuasParcelas());
        emprestimo.calcular(1000, emprestimo.getTresParcelas());
        emprestimo.calcular( 1000,5);

        System.out.println("Exercício área quadriláteros");
        quadrilatero.calcularArea(5);
        quadrilatero.calcularArea(5,7);
        quadrilatero.calcularArea(4, 6, 5);

        System.out.println("Exercício return");
        double areaQuadrado = areaQuadrilatero.area(5);
        System.out.println("A área do quadrado é igual a " + areaQuadrado);
        double areaRetangulo = areaQuadrilatero.area(5, 7);
        System.out.println("A área do retangulo é igual a " + areaRetangulo);
        double areaTrapezio = areaQuadrilatero.area(4,6,5);
        System.out.println("A área do retangulo é igual a " + areaTrapezio);
    }


}
