import java.util.Scanner;

/**
 *  Crie uma clase chamada Mochila
 *  - Atributos: cor e anoFabricado
 * 
 *  Crie uma classe com o main
 *  - Crie um array de mochilas e popule esse array com 4 mochilas. As cores e os anos
 *    das mochilas devem ser preenchidos com o Scanner;
 *  - Percorra o array e imprima a media dos anos das mochilas
 */

 public class Main {
     public static void main (String []args) {
         Mochila m[] = new Mochila[4];
         for (int i = 0; i < m.length; i++) {
             m[i] = new Mochila();
         }
         /**
         m[0] = new Mochila();
         m[1] = new Mochila();
         m[2] = new Mochila();
         m[3] = new Mochila();
        **/
         Scanner s = new Scanner(System.in);
        System.out.println("Insira os anos de fabricação das mochilas: ");
        m[0].anoFabricado = s.nextInt();
        m[1].anoFabricado = s.nextInt();
        m[2].anoFabricado = s.nextInt();
        m[3].anoFabricado = s.nextInt();
        s.skip ("\n");

        System.out.println("Insira as cores das mochilas: ");
        m[0].cor = s.nextLine();
        m[1].cor = s.nextLine();
        m[2].cor = s.nextLine();
        m[3].cor = s.nextLine();

        double media = 0;
        for (int j = 0; j < m.length; j++) {
            media = (media + m[j].anoFabricado) / m.length;
        }
        System.out.println(media);
        
        s.close();
    }
    
 }