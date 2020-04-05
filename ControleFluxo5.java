package Lectures;

public class ControleFluxo5 {
    public static void main(String[] args) {
        // Dado um valor de um carro, descubra em quantas vezes ele pode ser parcelado
        // Porém as parcelas não podem ser menores do que R$1000,00

        double valorTotal = 30000;
        for (int parcela = 1; parcela <= valorTotal; parcela++) {
            double valorParcela = valorTotal / parcela;
            if (valorParcela >= 1000) {
                System.out.println("Parcela " + parcela + " R$" + valorParcela);
            }else{
                break;      // Para parar de desperdiçar memória
            }
        }
    }
}

/*
continue -> Volta ao começo de uma iteração
 */