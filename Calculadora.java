<<<<<<< HEAD
public class Calculadora {

    /**
     * Executa uma operação matemática básica.
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
     * @param a Primeiro número
     * @param b Segundo número
     * @return Resultado da operação
     */
    public double calcular(String operacao, int a, int b) {
        switch (operacao.toLowerCase()) {
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
        }
    }

    // Método principal para testar
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
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
    }
}

