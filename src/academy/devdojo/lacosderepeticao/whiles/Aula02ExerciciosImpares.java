package academy.devdojo.lacosderepeticao.whiles;

import java.util.Scanner;

public class Aula02ExerciciosImpares {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe um número desejado: ");
        int numero = entrada.nextInt();
        int i = 0;
        while (i <= numero) {
            if (i % 2 != 0) {
                System.out.println("i = " + i);
            }
            i = i + 1;
        }
    }
}
