import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scannerObjNum = new Scanner(System.in);
        Scanner scannerObjSize = new Scanner(System.in);

        System.out.println("Tabela de multiplicação de qual número?");
        String number = scannerObjNum.nextLine();

        System.out.println("Qual o tamanho da tabela?");
        String size = scannerObjSize.nextLine();

        System.out.println("\n" + "Tabela de multiplicação de " + number + "\n");
        for (int i = 0; i <= Integer.parseInt(size); i++) {

            int result = i * Integer.parseInt(number);
            System.out.println(number + " x " + i + " = " + result);
        }
    }
}
