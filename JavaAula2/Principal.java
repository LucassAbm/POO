public class Principal {
    public static void main (String []args) {
        int vet[] = new int[3];     // Cria um vetor com 3 posições, onde o valor inicial delas é 0, pois é vetor de int
        int x[];
        int soma = 0;
        x = vet;    // x refere-se para onde vet se refere
        System.out.println(vet[0]);
        x[0] = 2;
        x[1] = 5;
        x[2] = 8;
        System.out.println(vet[2]);
        System.out.println(x[2]);
        // Como ambos se referem ao mesmo vetor, e consequentemente à mesma posição, eles irão imprimir o mesmo resultado

        for (int i = 0; i < vet.length; i++) {
            soma += x[i];
        }
        System.out.println(soma);
        // Com o 'length' a gente tem como definido o tamanho do vetor/array, sem precisar fazer trocas futuras
        // Imprime a soma dos elementos do vetor

        String a[] = new String [3]; // Array de String com valores iniciais 'NULL'
        a[0] = "Bola";
        a[1] = new String("Barca"); // Uma outra maneira que a String pode ser criada
        a[2] = "Casa";
        /**
        a[3] = "Abc"; -> Dá erro de compilação, chamada de 'ArrayIndexOutOfBoundsException'.
        Ocorre quando o array tenta imprimir um dado que está além de seu tamanho que foi determinado.
        **/
        System.out.println(a[0]);
        System.out.println(a[2]);

        a = aumentaSePreciso(a);
        for (int z = 0; z < a.length; z++) {
            System.out.println(z);
        }
        System.out.println(a[3]); // Teste para ver se o array realmente aumentou
    }
    public static String [] aumentaSePreciso (String []x) {
        for (int i = 0; i < x.length; i++) {
            if (x[i] == null) {
                return x; // Array não está cheio
            }
        }
        String y[] = new String [x.length + 3];
        for (int j = 0; j < x.length; j++) {
            y[j] = x[j];
        }
        System.out.println(y[3]);
        System.out.println(y[4]);
        System.out.println(y[5]);
        return y;
    }
    // Esse método faz o seguinte: Se o array estiver cheio, esse método recebe o array e 'aumenta' ele de tamanho em quantas unidades for preciso
}

/**
    OBS.:
        int []y, u; -> Eu estou criando duas variáveis do tipo array de inteiros
        int a, b[]; -> Aqui eu estou criando uma variável do tipo int, e uma variável do tipo array de inteiros
        É preciso incializar os vetores
        'int x[]' -> Não cria o vetor
        'new int[]' -> Cria o vetor
        O array depois de criado não pode ser redimensionado
 */