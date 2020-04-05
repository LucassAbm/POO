package Lectures;

public class Arrays1 {
    public static void main(String[] args) {
        int[] idades = new int[3];   // Criando uma referência para um array (que é um objeto)
        idades[0] = 20;
        idades[1] = 15;
        idades[2] = 30;
       // idades[3] = 45; -> ArrayIndexOutOfBoundsException: Essa posição no Array não existe

        System.out.println("Idade 1: " + idades[0]);
        System.out.println("Idade 2: " + idades[1]);
        System.out.println("Idade 3: " + idades[2]);
    }
}

/*
 Toda vez que um array for criado, é preciso definir o tamanho.
 Arrays sempre começam na posição '0'.
 Arrays não são expansíveis
 */