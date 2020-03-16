import java.util.Scanner;

public class LeituraGato {
    public static void main (String[] args) {
        System.out.println("*** Início do quinto programa ***");
        Gato x = new Gato();
        Gato y = new Gato();
        Scanner s = new Scanner (System.in);

        System.out.println("Insira o nome dos gatos: ");

        String lendoNome1 = s.nextLine();
        String lendoNome2 = s.nextLine();

        System.out.println("Insira a idade dos gatos: ");
        
        int lendoIdade1 = s.nextInt();
        int lendoIdade2 = s.nextInt();

        System.out.println("Os nomes dos gatos são: " + lendoNome1 + ", " + lendoNome2);
        System.out.println("As idades dos gatos são respectivamente: " + " " + lendoIdade1 + ", " + lendoIdade2);
    }
}