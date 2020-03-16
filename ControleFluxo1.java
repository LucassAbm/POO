package Lectures;

public class ControleFluxo1 {
    // Aqui trabalharemos com if, else if e else
    public static void main(String[] args) {
        int idade = 20;
            String categoria;
            if(idade < 15) {
                categoria = "Infantil";
            }else if(idade >= 15 && idade < 18) {
                categoria = "Juvenil";
            }else{
                categoria = "Adulto";
            }
        System.out.println(categoria);
    }
}

/*
OBS.: Operador ternário:
    var = <condição> ? <true> : <false>;
 */