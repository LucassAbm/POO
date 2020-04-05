package Lectures;

public class Arrays2 {
    public static void main(String[] args) {
        String[] nomes = new String[3];   // Criando uma referência para um array (que é um objeto)
        nomes[0] = "Lucas";
        nomes[1] = "Enzo";
        nomes[2] = "Fernando";
        // nomes[3] = "Anna"; -> ArrayIndexOutOfBoundsException: Essa posição no Array não existe

        /*
        System.out.println("Nome 1: " + nomes[0]);
        System.out.println("Nome 2: " + nomes[1]);
        System.out.println("Nome 3: " + nomes[2]);
        */

        for (int i = 0; i < nomes.length; i++) {
            System.out.println("Nome " + (i + 1) + ": " + nomes[i]);
        }

        /*
        nomes = new String[4]; -> A variável 'nomes' passaria a referenciar um novo array com 4 posições,
        e o array antigo com 3 posições seria apagado pelo Garbage Collector
         */
    }
}

/*
Os arrays são inicializados automaticamente com os valores padrão:
        byte, short, int, long, float, double: 0
        char: '\u0000' ' '
        boolean: false
        reference: null

var.length -> Tamanho do array
 */