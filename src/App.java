import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scannerObjNum = new Scanner(System.in);
        Scanner scannerObjSize = new Scanner(System.in);

        System.out.println("Tabela de multiplicação de qual número?");
        int number = scannerObjNum.nextInt();

        System.out.println("Qual o tamanho da tabela?");
        int size = scannerObjSize.nextInt();

        System.out.println("\n" + "Tabela de multiplicação de " + number + "\n");

        for (int i = 0; i <= size; i++) {

            int result = i * number;
            System.out.println(number + " x " + i + " = " + result);
        }
    }
}
