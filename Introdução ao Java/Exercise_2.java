package Exercises;

    /*
    Crie uma variável chamada salario e imprima seu imposto
    imposto:
    salario < 1000: 5%
    salario >= 1000 && salario < 2000: 10%
    salario >= 2000 && salario < 4000: 15%
    salario > 5000: 20%
     */

public class Exercise_2 {
    public static void main(String[] args) {
        double salario = 2500;
        double imposto = 0;
        String status;
        status = salario < 1000 ? "5%" : salario >= 1000 && salario < 2000 ? "10%" : salario >= 2000 && salario < 4000 ? "15%" : "20%"; // Operador ternário
        System.out.println(status);

        if (salario < 1000) { // O if retorna um valor booleano
            imposto = salario * 0.05;
            salario += imposto;
        } else if (salario >= 1000 && salario < 2000) {
            imposto = salario * 0.1;
            salario += imposto;
        } else if (salario >= 2000 && salario < 4000) {
            imposto = salario * 0.15;
            salario += imposto;
        } else {
            imposto = salario * 0.2;
            salario += imposto;
        }
        System.out.println("O novo valor é R$" + salario);
        System.out.println("O valor do imposto foi de R$" + imposto);

    }
}
