public class Calculadora {

    /**
     * Executa uma operação matemática básica.
<<<<<<< HEAD
     * @param operacao
=======
     * @param operacao Tipo da operação: "soma"
>>>>>>> amissao
     * @param a Primeiro número
     * @param b Segundo número
     * @return Resultado da operação
     */
    public double calcular(String operacao, int a, int b) {
        switch (operacao.toLowerCase()) {
<<<<<<< HEAD
            default:
                throw new IllegalArgumentException("Operação inválida: " + operacao);
=======
            case "soma":
                return a + b;
            
>>>>>>> amissao
        }
    }

    // Método principal para testar
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

<<<<<<< HEAD
        calc.calcular( "", 0, 0 );
=======
        System.out.println("Soma: " + calc.calcular("soma", 10, 5));
>>>>>>> amissao
    }
}

