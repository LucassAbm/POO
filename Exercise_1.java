package Exercises;

public class Exercise_1 {
    public static void main(String args[]) {
        String name, address, phone;
        name = "Lucas";
        address = "Rua Monte Paschoal";
        phone = "00000-0000";
        System.out.println("O " + name + " domiciliado no endereço " + address + " e telefone " + phone + " não possui nenhuma pendência.");

        String name2, marital_status;
        name2 = "Lucas";
        marital_status = "Solteiro";
        double salary = 2000;
        char gender = 'M';
        int age = 20;

        System.out.println("O trabalhador " + name2 + " do sexo " + gender + " idade "
                + age + " estado civil " + marital_status + " e salario "
                + salary + " encontra-se neste estabelecimento");
    }
}
