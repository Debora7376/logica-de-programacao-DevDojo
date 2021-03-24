package academy.devdojo.arrays.multidimensionais;

import java.util.Scanner;

public class Aula02InicializandoArraysMultidimensionais {

    public static void main(String[] args) {
        int [][] arrayMultil = new int[2][3];
        Scanner entrada = new Scanner(System.in);
        for (int i = 0; i < arrayMultil[i].length; i++) {
            for (int j = 0; j < arrayMultil[i].length; j++) {
                System.out.println("Digite o valor da posição [" +i+ "] [" +j+ "]");
                arrayMultil[i][j] = entrada.nextInt();
            }
        }
        for (int i = 0; i < arrayMultil.length; i++) {
            for (int j = 0; j < arrayMultil[i].length; j++) {
                System.out.println("[" + i + "][" + j + "]" + arrayMultil[i][j]);
            }
        }
    }
}
