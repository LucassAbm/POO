package Exercises;

    /*
    Imprima todos os números pares de 0 até 100000
     */

public class Exercise_4 {
    public static void main (String[] args) {
        int i;
        for (i = 0; i <= 100000; i++) {         // for (int i = 0; i <= 100000; i++)
            if ((i % 2) == 0)                   // Para números ímpares: if ((i % 2) != 0)
                System.out.println(i);
        }
    }
}
/*
int valor = 100000
for (i = 0; i <= valor; i++) {
    if ((i % 2) == 0)
        System.out.println(i);
}
 */
