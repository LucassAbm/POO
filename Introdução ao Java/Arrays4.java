package Lectures;

public class Arrays4 {
    public static void main(String[] args) {
        int[][] dias = new int[2][2];       // Array multidimensional
        dias[0][0] = 30;
        dias[0][1] = 31;
        dias[1][0] = 29;
        dias[1][1] = 28;
        // 1° colchete: Posição no primeiro array // 2° colchete: Posição no segundo array

        for(int i = 0; i < dias.length; i++) {
            System.out.println(dias[i]);        // Vai imprimir o endereço de memória do primeiro array
            for(int j = 0; j < dias[i].length; j++) {
                System.out.println(dias[i][j]);
            }
        }
        System.out.println("-------------------------------");
        for(int[] ref : dias) {
            for(int dia : ref) {
                System.out.println(dia);
        // Usando foreach;
            }
        }
    }
}

/*
Os arrays multidimensionais somente requerem que vc defina o tamanho do array original;
Cada posição do primeiro array faz referência para o segundo array, e assim por diante;
O último array que vai fazer referência aos valores int, double, String...
 */