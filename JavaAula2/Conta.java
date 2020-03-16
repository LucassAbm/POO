public class Conta {
    private String nome; // Com o private, esses atributos só podem ser acessados dentro dessa classe;
    private double saldo;

    public double getSaldo() {
        return saldo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String n) {
        nome = n;
    }

    public void setSaldo(double s) {
        saldo = s;
    }

    public void depositar(double val) {
        saldo += val;
    }

    public boolean Sacar(double val) {
        // if (val <= 0) throw new RuntimeException();
        if (val <= saldo) {
            saldo -= val;
            return true;
        }
        else {
            return false;
        }
    }
}

// Métodos public podem ser acessados por qualquer um