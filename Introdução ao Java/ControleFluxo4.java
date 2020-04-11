package Lectures;

public class ControleFluxo4 {
    public static void main(String[] args) {
        int contador = 0;
        while(contador < 10) {      // Valor booleano
            System.out.println(contador);
            contador++;         // Pode ser colocado dentro do sysout tbm
        }

        do {
            System.out.println("Dentro do 'do while'!");
        }while(contador < 10);          // Não importa a informação que estiver aqui dentro,
                                        // o 'do while' executará a informação pelo menos uma vez
        for (int i = 0; i < 10; i++) {
            System.out.println("O valor de 'i' é: " + i);
        }
    }
}

/*
System.out.println(++contador); -> Pré-incremento
Irá imprimir de 1 até 10
while(true) -> Loop infinito, nesse código

OBS.: Se tivemos uma informação falsa dentro do 'while', essa informação nunca
      será executada
 */