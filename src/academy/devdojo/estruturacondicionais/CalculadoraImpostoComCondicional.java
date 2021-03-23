package academy.devdojo.estruturacondicionais;

public class CalculadoraImpostoComCondicional {
    public static void main(String[] args) {
        float salario = 4700.50F;
        float resultado = 0F;
        String  valorDoResultado = "";
        if (salario > 4500) {
            valorDoResultado = "30% ";
            resultado = salario * 0.3F;
        } else {
            valorDoResultado = "15% ";
            resultado = salario * 0.15F;
        }
        System.out.println("O valor final é: " + valorDoResultado + " = "+ resultado);
    }
}
/*
        Versao do Professor

public class academy.devdojo.estruturacondicionais.CalculadoraImpostoComCondicional {
    public static void main(String[] args) {
        float salario = 4700F;
        if (salario > 4500) {
            float trintaPorCento = salario * 0.3F;
            System.out.println("30% = " + trintaPorCento);
        } else {
            float quinzePorCento = salario * 0.15F;
            System.out.println("30% = " + quinzePorCento);

        }
    }
}

 */
