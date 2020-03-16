public class Caixa {
    public static void main (String []args) {
        double valorSaque = 500;
        Conta c = new Conta();
        c.depositar(50);
        c.Sacar(valorSaque);
        System.out.println(c.getSaldo());
        /** 
        Vai imprimir apenas o valor do depósito feito pois o programa não realiza a operação de saque
        pois o valor de saque é maior que o saldo total
        **/

        System.out.println(c.getNome());
        c.setNome("João");
        System.out.println(c.getNome());
        
        //c.saldo = 10;
        // c.saldo = c.saldo - valorSaque; //c.sacar(valorSaque); -> Isso sem o private
        //System.out.println(c.saldo);
    }
}