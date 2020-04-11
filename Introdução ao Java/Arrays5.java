package Lectures;

public class Arrays5 {
    public static void main(String[] args) {
        int[][] dias = new int[3][];
        dias[0] = new int[2];       // Valores iniciais = 0;
        dias[1] = new int[]{1, 2, 3};       // Valores iniciais definidos;
        dias[2] = new int[4];       // Valores iniciais = 0;
        // Estamos criando arrays com tamanhos diferentes dentro do primeiro array;

        //int[][] dias = {{0, 0}, {1, 2, 3}, {0, 0, 0, 0}}; -> Um outro jeito de declarar esse mesmo array

        for(int[] arr : dias) {         // "Para cada posição(array) dentro do array"
            for(int num : arr) {        // "Para cada valor dentro de cada posição(array)"
                System.out.println(num);
            }
        }
    }
}

// Qual o valor da posição [1][2] ?  ->  = 3