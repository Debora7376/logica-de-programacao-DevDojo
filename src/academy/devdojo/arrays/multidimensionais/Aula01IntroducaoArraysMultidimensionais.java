package academy.devdojo.arrays.multidimensionais;

public class Aula01IntroducaoArraysMultidimensionais {
    public static void main(String[] args) {
        int [] [] arrayMulti1 = new int [2] [2];
        arrayMulti1[0] [0] = 11;
        arrayMulti1[0] [1] = 22;
        arrayMulti1[1] [0] = 44;
        arrayMulti1[1] [1] = 55;
        System.out.println(arrayMulti1[0][0]);
        System.out.println(arrayMulti1[0][1]);
        System.out.println(arrayMulti1[1][0]);
        System.out.println(arrayMulti1[1][1]);
    }
}
