public class ProgramaPrincipal {
    public static void main (String[] args) { // Variável/Array 'args': Vetor de String.
        System.out.println("*** Início do programa ***" + "\n");
        Gato x = new Gato(); // Cria na memória um novo objeto 'Gato' que possui idade e nome, com valores respectivos iguais a 0 e null.
        Gato y = new Gato();

        x.nome = "Garfield"; // Para onde 'x' aponta ? Nome. Então acessa o campo 'nome' e modifica para 'Garfield'
        x.idade = 10;
        y.nome = "Félix";
        y.idade = 5;
        System.out.println(x.nome + " " + x.idade);
        System.out.println(y.nome + " " + y.idade);

        x.miar();
        y.miar();
        System.out.println("\n");

        Cachorro z = new Cachorro();
        Cachorro w = new Cachorro();

        z.nome = "Hércules";
        z.idade = 10;
        w.nome = "Melo";
        w.idade = 5;
        System.out.println(z.nome + " " + z.idade);
        System.out.println(w.nome + " " + w.idade);

        z.latir();
        w.latir();

        System.out.println("Fim do programa" + "\n");

        System.out.println("*** Início do segundo programa ***");

        long a = 10; // Valor literal
        int b = (int)a;
        System.out.println(a);
        System.out.println(b);

        long u = 10897495532L; // É preciso informar que a gente quer que ele seja representado como long, 
                               // senão ele é interpretado como um valor literal, como um int
        int d = (int)u;
        System.out.println(u);
        System.out.println(d);

        short i = 10;
        short j = 5;
        short k = 3;
        short l = (short)(i + j + k); // Também serve com as outras operações
        System.out.println(l);

        System.out.println("Fim do segundo programa" + "\n");

        System.out.println("*** Início do terceiro programa ***");

        int e = 10;
        if (e > 0) { // O java não compila se estiver, por exemplo, 'if(x)'
            System.out.println("Maior");
        } else if (e < 0) {
                System.out.println("Menor");
        } else {
            System.out.println("Igual");
        }
        for (int f = 0; f < 18; f++) {
            System.out.println(f);
        }
        int g = 0;
        boolean h = false;
        while (h == false) {
            g++;
            if (g == 10) {
                h = true;
            }
            System.out.println(g);
        }
        int p = 10;
        do{
            System.out.println(p);
            p--;
        }while (p > 0);

        for (int q = 0; q < 10; q++) {
            if (q == 6) {
                continue; // O 'continue' tem a função de continuar o código. Quando o 'q' chegar no 6, o programa entra no 'continue',
                          // não imprime o 6 na tela, e volta para o for
            }
            System.out.println(q);
        }
        for (int r = 0; r < 10; r++) {
            if (r == 6) {
                break; // O 'break' tem a função de quebrar o código. Quando o 'r' chegar no 6, o programa "quebra", não roda mais o 'for'
            }
        }

        /*
        for (int s = 0; s < 3; s ++) {
            int t = s;
        }
        System.out.println(t);
        */ //Não compila, dá erro de compilação

        /*
        int t = 0;
        for (int s = 0; s < 3; s ++) {
            t = s;
        }
        System.out.println(t); // Variável local
        System.out.println(s); // Variável local // Este 's' não compila
        */ //Compila
        System.out.println("Fim do terceiro programa" + "\n");
    }
}

// x.nome, x.idade, y.nome, y.idade: Variáveis de referência -> Se referm à um objeto em memória
// Também existem as variáveis primitivas do tipo primitivas (byte(8 bits), short(16 bits), int(32 bits), long(64 bits),
// float, double, char, boolean)
// CASTING: Moldar o valor da variável, para "caber" em variáveis menores
// Variáveis locais: Só possuem valor enquanto o escopo em que elas estiverem atreladas estiver rodando