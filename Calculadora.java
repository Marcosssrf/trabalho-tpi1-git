<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> oamanhanuncamorre
public class Calculadora {

    /**
     * Executa uma operação matemática básica.
<<<<<<< HEAD
<<<<<<< HEAD
     * @param operacao
=======
     * @param operacao Tipo da operação: "soma"
>>>>>>> amissao
=======
    public class Calculadora {

    /**
     * Executa uma operação matemática básica.
     * @param operacao Tipo da operação: "subtracao", "multiplicacao"
>>>>>>> oresgate
=======
     * @param operacao Tipo da operação: "divisao"
>>>>>>> oamanhanuncamorre
     * @param a Primeiro número
     * @param b Segundo número
     * @return Resultado da operação
     */
    public double calcular(String operacao, int a, int b) {
        switch (operacao.toLowerCase()) {
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
            default:
                throw new IllegalArgumentException("Operação inválida: " + operacao);
=======
            case "soma":
                return a + b;
            
>>>>>>> amissao
=======
            case "subtracao":
                return a - b;
            case "multiplicacao":
                return a * b;
>>>>>>> oresgate
=======
            case "divisao":
                if (b == 0) {
                    throw new IllegalArgumentException("Divisão por zero não é permitida!");
                }
                return (double) a / b;
>>>>>>> oamanhanuncamorre
        }
    }

    // Método principal para testar
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
<<<<<<< HEAD
<<<<<<< HEAD

<<<<<<< HEAD
        calc.calcular( "", 0, 0 );
=======
        System.out.println("Soma: " + calc.calcular("soma", 10, 5));
>>>>>>> amissao
=======
        System.out.println("Subtração: " + calc.calcular("subtracao", 10, 5));
        System.out.println("Multiplicação: " + calc.calcular("multiplicacao", 10, 5));
>>>>>>> oresgate
=======
        System.out.println("Divisão: " + calc.calcular("divisao", 10, 5));
>>>>>>> oamanhanuncamorre
    }
}

