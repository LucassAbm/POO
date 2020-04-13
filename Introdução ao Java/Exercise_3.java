package Exercises;

    /*
    Crie um switch que dado um valor de 1 a 7, considerando domingo = 1, imprima se é dia útil ou final de semana
     */

public class Exercise_3 {
    public static void main (String[] args) {
        byte dia = 5;                                   // Switch só aceita byte, char, int, short, enum e String
        switch (dia) {
            case 1:
            System.out.println("Domingo"); break;       // O break sinaliza à máquina para ela sair daquele bloco de código, pode ser usado no while, do while, for e switch
            case 2:
            System.out.println("Segunda"); break;
            case 3:
            System.out.println("Terça"); break;
            case 4:
            System.out.println("Quarta"); break;
            case 5:
            System.out.println("Quinta"); break;
            case 6:
            System.out.println("Sexta"); break;
            case 7:
            System.out.println("Sábado");
            default:                                    // Caso nenhuma das opções seja atendida
                System.out.println("Operação inválida");
        }
        if (dia == 1 || dia == 7 ) {
            System.out.println("Dia não-útil");
        }else if (dia <= 1 || dia >= 7){
            System.out.println("Operação inválida");
        }else{
            System.out.println("Dia útil");
        }
    }
}
